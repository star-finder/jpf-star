package star.examples.doublelinkedlist;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;
import star.examples.Utilities;
import star.examples.doublelinkedlist.DoubleLinkedList.Entry;

public class DoubleLinkedList_repOK1Step extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = null;
		obj.modCount = 0;
		obj.size = 0;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

}

