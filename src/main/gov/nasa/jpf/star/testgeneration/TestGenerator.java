package gov.nasa.jpf.star.testgeneration;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.Variable;
import gov.nasa.jpf.star.formula.expression.Expression;
import gov.nasa.jpf.star.formula.expression.LiteralExpression;
import gov.nasa.jpf.star.formula.expression.VariableExpression;
import gov.nasa.jpf.star.precondition.Precondition;
import gov.nasa.jpf.star.precondition.PreconditionLexer;
import gov.nasa.jpf.star.precondition.PreconditionParser;
import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.MethodInfo;

public class TestGenerator {
	
	private static ClassInfo ci;
	
	private static MethodInfo mi;
	
	private static Config conf;
	
	private static List<String> models = new ArrayList<String>();
	
	private static int index = 1;
	
	public static void setClassAndMethodInfo(ClassInfo ci, MethodInfo mi, Config conf) {
		if (TestGenerator.ci == null)
			TestGenerator.ci = ci;
		
		if (TestGenerator.mi == null)
			TestGenerator.mi = mi;
		
		TestGenerator.conf = conf;
	}
	
	public static void addModel(String model) {
		if (model.length() > 0)
			models.add(model);
	}
	
	public static void generateTests() {
		StringBuffer test = new StringBuffer();
		init(test);
		
		for (String model : models) {
			String[] tmp = model.split(";");
			
			model = tmp[0];
			String pure = tmp[1].substring(tmp[1].indexOf('[') + 1, tmp[1].length() - 1);
			pure = pure.replaceAll("\\),", ");");
						
			model = standarize(model);
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
		String clsName = ci.getName();
		
		test.append("\t@Test\n");
		test.append("\tpublic void test" + index++ + "() {\n");
		
		if (!mi.isStatic())
			test.append("\t\t" + clsName + " " + objName + " = new " + clsName + "();\n");
		
		LocalVarInfo[] args = mi.getArgumentLocalVars();
		FieldInfo[] insFields = ci.getInstanceFields();
		FieldInfo[] staFields = ci.getDeclaredStaticFields();
		
		List<Variable> knownTypeVars = new ArrayList<Variable>();
		
		for (LocalVarInfo arg : args) {
			knownTypeVars.add(new Variable(arg.getName(), arg.getType()));
		}
		
		for (FieldInfo field : insFields) {
			knownTypeVars.add(new Variable("this_" + field.getName(), field.getType()));
		}
		
		for (FieldInfo field : staFields) {
			knownTypeVars.add(new Variable(clsName + "_" + field.getName(), field.getType()));
		}
		
		f.updateType(knownTypeVars);
		f.removePrimTerm();
		
		String[] pureAssigns = pure.split(";");
		for (String pureAssign : pureAssigns) {
			pureAssign = pureAssign.replaceAll("\\(", "");
			pureAssign = pureAssign.replaceAll("\\)", "");
			
			String[] nameAndValue = pureAssign.split(",");
			String name = nameAndValue[0];
			String value = nameAndValue[1];
			
			for (Variable var : knownTypeVars) {
				if (var.getName().equals(name)) {
					Expression exp1 = new VariableExpression(new Variable(name, var.getType()));
					Expression exp2 = new LiteralExpression(value);
					f.addComparisonTerm(Comparator.EQ, exp1, exp2);
				}
			}
		}
		
		List<Variable> initVars = new ArrayList<Variable>();
		
		f.genTest(initVars, test, objName, clsName);
		
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
		
		test.append("public class " + ci.getName() + "1 extends TestJPF {\n\n");
	}
	
	private static void writeToFile(StringBuffer test) {
		String fileName = ci.getName() + "1.java";
		String path = conf.getProperty("star.test_path");
		
		try {
			PrintWriter pw = new PrintWriter(path + "/" + fileName, "UTF-8");
			pw.println(test.toString());
			
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String standarize(String model) {
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
