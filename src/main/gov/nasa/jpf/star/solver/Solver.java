package gov.nasa.jpf.star.solver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.star.data.DataNode;
import gov.nasa.jpf.star.data.DataNodeMap;
import gov.nasa.jpf.star.formula.Formula;
import gov.nasa.jpf.star.formula.HeapFormula;
import gov.nasa.jpf.star.formula.PureFormula;
import gov.nasa.jpf.star.predicate.InductivePred;
import gov.nasa.jpf.star.predicate.InductivePredMap;

public class Solver {
	
	private static int MAX_LENGTH = 100;
	
	private static String s2sat = "s2sat";
	
	private static String model = "";
	
	public static boolean checkSat(Formula f, Config c) {
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
		else {
//			return true;
			File file = printToFile(f);
			if (file != null) {
				return checkSat(file);
			}
			return false;
		}
	}
	
	private static File printToFile(Formula f) {
		try {
			File file = File.createTempFile("sat", null);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsolutePath(), true));

			DataNode[] dns = DataNodeMap.getAll();
			for (int i = 0; i < dns.length; i++) {
				String dn = dns[i].toS2SATString();
				bw.write(dn + "\n");
			}
			
			InductivePred[] preds = InductivePredMap.getAll();
			for (int i = 0; i < preds.length; i++) {
				String pred = preds[i].toS2SATString();
				bw.write(pred + "\n");
			}
			
			String problem = "checksat " + f.toS2SATString() + ".\n";
			bw.write(problem);
			
			bw.flush();
			bw.close();
			return file;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	private static boolean checkSat(File file) {
		boolean ret = false;
		
		try {
			String cmd = s2sat + " " + file.getAbsolutePath();
//			System.out.println(cmd);
			Process p = Runtime.getRuntime().exec(cmd);
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(p.getInputStream()));
			
			String s = br.readLine();
			
			model = "";
			boolean readModel = false;
			while (s != null) {
//				System.out.println(s);
				
				if (s.contains("cex:")) {
					readModel = true;
				}
				
				if (s.contains(": SAT")) {
					ret = true;
					readModel = false;
					break;
				} else if (s.contains(": UNSAT")) {
					ret = false;
					readModel = false;
					break;
				}
				
				if (readModel) {
					model += s;
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
	
	public static String getModel() {
		return model;
	}
	
	public static int getMinInt(Config c) {
		int min = -1000;
		
		String s = c.getProperty("star.min_int");
		if (s != null) {
			min = Integer.parseInt(s);
		}
		
		return min;
	}
	
	public static int getMaxInt(Config c) {
		int max = 1000;
		
		String s = c.getProperty("star.max_int");
		if (s != null) {
			max = Integer.parseInt(s);
		}
		
		return max;
	}
	
	public static long getMinLong(Config c) {
		long min = -10000;
		
		String s = c.getProperty("star.min_long");
		if (s != null) {
			min = Integer.parseInt(s);
		}
		
		return min;
	}
	
	public static long getMaxLong(Config c) {
		long max = 10000;
		
		String s = c.getProperty("star.max_long");
		if (s != null) {
			max = Integer.parseInt(s);
		}
		
		return max;
	}

}
