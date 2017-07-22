package gov.nasa.jpf.star.examples.sample;

public class Main {
	private static final int N = 6;
	
	public void sample(LinkedList<Object> dll, Object o) {
		dll.addLast(o);
		Object o2 = dll.remove(N);
		if (o == o2) {
			skip();
			//Analysis.fail();
		}
	}
	
	private void skip() { System.out.println("Error"); }
}
