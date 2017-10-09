package star.solver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import gov.nasa.jpf.Config;
import starlib.data.DataNode;
import starlib.data.DataNodeMap;
import starlib.formula.Formula;
import starlib.predicate.InductivePred;
import starlib.predicate.InductivePredMap;

public class Solver {

	private static int MAX_DEPTH = 3;
	
	private static int MAX_TIME = 1;

	private static String s2sat = "s2sat";

	private static boolean ret = false;
	
	private static String model = "";
	
	private static Process p = null;
	
	public static boolean checkSat(Formula f, Config c) {
//		System.out.println(f);
//		System.out.println(f.getDepth());
		
		ret = false; model = "";
		
		int maxDepth = MAX_DEPTH;

		String s = c.getProperty("star.max_depth");
		if (s != null) {
			maxDepth = Integer.parseInt(s);
		}

		if (f.getDepth() > maxDepth) {
			return false;
		} else {
			// return true;
			File file = printToFile(f);
			
			if (file != null) {
				boolean ret = checkSat(file, c);
				return ret;
			}
			
			return false;
		}
	}

	private static File printToFile(Formula f) {
		try {
			File file = File.createTempFile("sat", null);
//			System.out.println(file.getAbsolutePath());
			
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

	
	
	private static boolean checkSat(File file, Config c) {
		try {
			Future future = null;
			String cmd = s2sat + " " + file.getAbsolutePath();
			
			Runnable check = new Thread() {
				@Override
				public void run() {
					try {
						p = Runtime.getRuntime().exec(cmd);
						
						BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

						String s = br.readLine();
						
						boolean readModel = false;
						while (s != null) {
							// System.out.println(s);

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
								if (s.contains("cex:"))
									model += s.substring(s.indexOf("cex:"));
								else if (s.contains("Pure Assigment"))
									model += ";" + s;
								else if (!s.contains("true"))
									model += s;
							}

							s = br.readLine();
						}

						br.close();
						p.waitFor();
					} catch (Exception e) {

					}
				}
			};

			ExecutorService executor = Executors.newSingleThreadExecutor();
			future = executor.submit(check);
			
			int maxTime = MAX_TIME;
			
			String s = c.getProperty("star.max_time");
			if (s != null) {
				maxTime = Integer.parseInt(s);
			}
			
			future.get(maxTime, TimeUnit.SECONDS);

			return ret;
		} catch (Exception e) {
			ret = false; model = "";
			if (p.isAlive()) p.destroyForcibly();
				
			return false;
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
