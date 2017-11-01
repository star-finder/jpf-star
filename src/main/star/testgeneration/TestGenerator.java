package star.testgeneration;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.MethodInfo;
import starlib.formula.Formula;
import starlib.formula.Variable;
import starlib.formula.expression.Comparator;
import starlib.formula.expression.Expression;
import starlib.formula.expression.LiteralExpression;
import starlib.formula.expression.VariableExpression;
import starlib.jpf.PathFinderUtils;
import starlib.jpf.testsuites.TestGenVisitor;
import starlib.precondition.Precondition;
import starlib.precondition.PreconditionLexer;
import starlib.precondition.PreconditionParser;

public class TestGenerator {
	
	private static ClassInfo ci;
	
	private static MethodInfo mi;
	
	private static Config conf;
	
	private static HashSet<String> models = new HashSet<String>();
	
	private static int index = 1;
	
	private static boolean first = true;
	
	public static void setClassAndMethodInfo(ClassInfo ci, MethodInfo mi, Config conf) {
		if(first) {
			TestGenerator.ci = ci;
			TestGenerator.mi = mi;
			TestGenerator.conf = conf;
			first = false;
		}
	}
	
	public static void reset() {
		first = true;
	}
	
	public static void addModel(String model) {
		models.add(model);
	}
	
	public static void generateTests() {
		StringBuffer test = new StringBuffer();
		init(test);
		
		for (String model : models) {
			model = model.replaceAll("FLOAT 0.", "0");
			String[] tmp = model.split(";");
			
			model = tmp[0];
			String pure = tmp[1];
			
			if (pure.contains("Sat")) {
				pure = pure.substring(tmp[1].indexOf('[') + 1, tmp[1].length() - 1);
				pure = pure.replaceAll("\\),", ");");
			} else {
				pure = "";
			}
						
			model = standarizeModel(model);
			model = "pre temp == " + model;
			
			ANTLRInputStream in = new ANTLRInputStream(model);
			PreconditionLexer lexer = new PreconditionLexer(in);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        PreconditionParser parser = new PreconditionParser(tokens);
	        
	        Precondition[] ps = parser.pres().ps;
	        Formula f = ps[0].getFormula();
			
			generateTest(f, test, pure);
		}
		
		test.append("}\n");
//		System.out.println(test);
		
		writeToFile(test);
	}
	
	private static void generateTest(Formula f, StringBuffer test, String pure) {
		String objName = "obj";
		String clsName = ci.getSimpleName();
		
		test.append("\t@Test\n");
		test.append("\tpublic void test_" + mi.getName() + index++ + "() throws Exception {\n");
		
		if (!mi.isStatic())
			test.append("\t\t" + clsName + " " + objName + " = new " + clsName + "();\n");
		
		LocalVarInfo[] args = mi.getArgumentLocalVars();
		FieldInfo[] insFields = ci.getInstanceFields();
		FieldInfo[] staFields = ci.getDeclaredStaticFields();
		
		HashMap<String,String> knownTypeVars = PathFinderUtils.initTypeVarMap(ci,mi);
		
		f.updateType(knownTypeVars);
		f.removeTerm();
		
		if (pure.length() > 0) {
			String[] pureAssigns = pure.split(";");
			for (String pureAssign : pureAssigns) {
				pureAssign = pureAssign.replaceAll("\\(", "");
				pureAssign = pureAssign.replaceAll("\\)", "");
				
				String[] nameAndValue = pureAssign.split(",");
				String name = nameAndValue[0];
				String value = nameAndValue[1];
				
				for(Entry<String, String> entry : knownTypeVars.entrySet()) {
					Variable var = new Variable(entry.getKey(), entry.getValue());
					if (var.isPrim() && var.getName().equals(name)) {
						Expression exp1 = new VariableExpression(new Variable(name, var.getType()));
						Expression exp2 = new LiteralExpression(value);
						f.addComparisonTerm(Comparator.EQ, exp1, exp2);
					}
				}
			}
		}
		
		HashSet<Variable> initVars = new HashSet<Variable>();
		
		for (FieldInfo field : insFields) {
			if (field.isFinal() || field.isPrivate() || field.isProtected()) {
				String name = "this_" + field.getName();
				String type = PathFinderUtils.toS2SATType(field.getType());
				
				initVars.add(new Variable(name, type));
			}
		}
		
		for (FieldInfo field : staFields) {
			if (field.isFinal() || field.isPrivate() || field.isProtected()) {
				String name = clsName + "_" + field.getName();
				String type = PathFinderUtils.toS2SATType(field.getType());
				
				initVars.add(new Variable(name, type));
			}
		}
		
//		f.genTest(knownTypeVars, initVars, test, objName, clsName, insFields, staFields);
		TestGenVisitor jpfGen = new TestGenVisitor(knownTypeVars, initVars, objName, clsName, insFields, staFields, test);
		jpfGen.visit(f);
		
//		if (!mi.isStatic())
//			test.append("\t\tSystem.out.println(Utilities.repOK(" + objName + "));\n");
		
		if (mi.isStatic())
			test.append("\t\t" + clsName + "." + mi.getName() + "(");
		else
			test.append("\t\t" + objName + "." + mi.getName() + "(");
		
		String s = "";
		for (LocalVarInfo arg : args) {
			if (!arg.getName().equals("this"))
				s += arg.getName() + ",";
		}
		
		if (!s.isEmpty())
			s = s.substring(0, s.length() - 1);
			
		test.append(s + ");\n");
		
		test.append("\t}\n\n");
	}
	
	private static void init(StringBuffer test) {
		String pack = conf.getProperty("star.test_package");
		if (pack != null) {
			test.append("package " + pack + ";\n\n");
		}
		
		String[] imps = conf.getStringArray("star.test_imports");
		if (imps != null) {
			for (String imp : imps) {
				test.append("import " + imp + ";\n");
			}
		}
		test.append("import org.junit.Test;\n");
		test.append("import gov.nasa.jpf.util.test.TestJPF;\n");
		test.append("\n");
		
		test.append("public class " + ci.getSimpleName() + "_" + mi.getName() + "1 extends TestJPF {\n\n");
	}
	
	private static void writeToFile(StringBuffer test) {
		String fileName = ci.getSimpleName() + "_" + mi.getName() + "1.java";
		String path = conf.getProperty("star.test_path");
		// create the directory if it does not exist
		try {
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdirs();
			} else{
				// FileUtils.cleanDirectory(dir);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			PrintWriter pw = new PrintWriter(path + "/" + fileName, "UTF-8");
			pw.println(test.toString());
			
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String standarizeModel(String model) {
		String ret = model;
		
		ret = ret.substring(8, model.length());
		ret = ret.replaceAll("[\\[\\]]", "");
		
		if (ret.endsWith("@M")) {
			ret = ret.replaceAll("@M,", " *");
			ret = ret.replaceAll("@M", "");
		} else {
			ret = ret.replaceAll("@M,", " *");
			ret = ret.replaceAll("@M", " &");
		}
		
		return ret.substring(1);
	}
}
