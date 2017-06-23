package gov.nasa.jpf.star.testgeneration;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.precondition.Precondition;
import gov.nasa.jpf.star.precondition.PreconditionLexer;
import gov.nasa.jpf.star.precondition.PreconditionParser;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.MethodInfo;

public class TestGenerator {
	
	private static ClassInfo ci;
	
	private static MethodInfo mi;
	
	private static List<String> models;
	
	public static void setClassAndMethodInfo(ClassInfo ci, MethodInfo mi) {
		if (TestGenerator.ci == null)
			TestGenerator.ci = ci;
		
		if (TestGenerator.mi == null)
			TestGenerator.mi = mi;
	}
	
	public static void addModel(String model) {
		if (models == null)
			models = new ArrayList<String>();
		
		if (model.length() > 0)
			models.add(model);
	}
	
	public static void generateTests() {
		for (String model : models) {
			model = standarize(model);
			model = "pre temp == " + model;
			
			System.out.println(model);
			
			ANTLRInputStream in = new ANTLRInputStream(model);
			PreconditionLexer lexer = new PreconditionLexer(in);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        PreconditionParser parser = new PreconditionParser(tokens);
	        
	        Precondition[] ps = parser.pres().ps;
	        Formula f = ps[0].getFormula();
			
			System.out.println(f);
			
			generateTest(f);
		}
	}
	
	private static void generateTest(Formula f) {
		
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
		
		ret = ret.replaceAll("<", "(");
		ret = ret.replaceAll(">", ")");
		ret = ret.replaceAll("::", "->");
		
		return ret.substring(1);
	}

}
