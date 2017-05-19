package gov.nasa.jpf.star.solver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solver {
	
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

}
