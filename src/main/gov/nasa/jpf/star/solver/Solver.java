package gov.nasa.jpf.star.solver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.HeapFormula;
import gov.nasa.jpf.star.formula.PureFormula;

public class Solver {
	
	private static int MAX_LENGTH = 10;
	
	private static int MIN_INT = Integer.MIN_VALUE;
	
	private static int MAX_INT = Integer.MAX_VALUE;
	
	public static boolean solve(Formula f, Config c) {
		HeapFormula hf = f.getHeapFormula();
		PureFormula pf = f.getPureFormula();
		
		int heapSize = hf.getHeapTerms().length;
		int pureSize = pf.getPureTerms().length;
		
		int maxLength = MAX_LENGTH;
		
		String s = c.getProperty("star.max_len_pc");
		if (s != null) {
			maxLength = Integer.parseInt(s);
		}
		
		if (heapSize + pureSize > maxLength)
			return false;
		else
			return true;
	}
	
	public static boolean solve(String problem) {
		boolean ret = false;
		
		try {
			String cmd = "./s2sat " + problem;
			Process p = Runtime.getRuntime().exec("ls");
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(p.getInputStream()));
			
			String s = br.readLine();
			while (s != null) {
				if (s.contains("SAT")) {
					ret = true;
					break;
				} else if (s.contains("UNSAT")) {
					ret = false;
					break;
				}
				s = br.readLine();
			}
			
			br.close();
			p.waitFor();
			
			return ret;
		} catch (Exception e) {
			e.printStackTrace();
			return ret;
		}
	}
	
	public static String getTestCase(String problem) {
		String ret = "";
		
		try {
			String cmd = "./s2sat " + problem;
			Process p = Runtime.getRuntime().exec("ls");
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(p.getInputStream()));
			
			String s = br.readLine();
			while (s != null) {
				if (s.contains("SAT")) {
					ret += s;
					break;
				} else if (s.contains("UNSAT")) {
					ret += s;
					break;
				}
				s = br.readLine();
			}
			
			br.close();
			p.waitFor();
			
			return ret;
		} catch (Exception e) {
			e.printStackTrace();
			return ret;
		}
	}
	
	public static int getMinInt(Config c) {
		int min = MIN_INT;
		
		String s = c.getProperty("star.min_int");
		if (s != null) {
			min = Integer.parseInt(s);
		}
		
		return min;
	}
	
	public static int getMaxInt(Config c) {
		int max = MAX_INT;
		
		String s = c.getProperty("star.max_int");
		if (s != null) {
			max = Integer.parseInt(s);
		}
		
		return max;
	}

}
