package doublelinkedlist;

public class Main {
//	private static final int N = 4;
	
	public void sample(DoubleLinkedList dll, Object o) {
		int N = 4;
		
		dll.addLast(o);
		Object o2 = dll.removeI(N);
		if (o == o2) {
			skip();
			//Analysis.fail();
		}
	}
	
	private void skip() { System.out.println("Error"); }
}
