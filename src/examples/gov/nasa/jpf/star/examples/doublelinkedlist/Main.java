package gov.nasa.jpf.star.examples.doublelinkedlist;

public class Main {
	private static final int N = 4;
	
	public void sample(DoubleLinkedList dll, Object o) {
		dll.addLast(o);
		Object o2 = dll.removeI(N);
		if (o == o2) {
			skip();
			//Analysis.fail();
		}
	}
	
	private void skip() { System.out.println("Error"); }
}
