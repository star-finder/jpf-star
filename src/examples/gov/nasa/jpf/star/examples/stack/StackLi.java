package gov.nasa.jpf.star.examples.stack;

// StackLi class
//
// CONSTRUCTION: with no initializer
//
// ******************PUBLIC OPERATIONS*********************
// void push( x )         --> Insert x
// void pop( )            --> Remove most recently inserted item
// Object top( )          --> Return most recently inserted item
// Object topAndPop( )    --> Return and remove most recent item
// boolean isEmpty( )     --> Return true if empty; else false
// boolean isFull( )      --> Always returns false
// void makeEmpty( )      --> Remove all items
// ******************ERRORS********************************
// pop on empty stack

/**
 * List-based implementation of the stack.
 * 
 * @author Mark Allen Weiss
 */
public class StackLi {
	
	// @ invariant isAcyclic();

	/**
	 * Construct the stack.
	 */
	public StackLi() {
		topOfStack = null;
	}

	/**
	 * Test if the stack is logically full.
	 * 
	 * @return false always, in this implementation.
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Test if the stack is logically empty.
	 * 
	 * @return true if empty, false otherwise.
	 */
	public boolean isEmpty() {
		return topOfStack == null;
	}

	/**
	 * Make the stack logically empty.
	 */
	public void makeEmpty() {
		topOfStack = null;
	}

	public boolean contains(Object e) {
		ListNode temp = topOfStack;
		while (temp != null) {
			if (e == temp.element) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public boolean isAcyclic() {
		StackLi ll = new StackLi();
		ListNode temp = topOfStack;
		while (temp != null) {
			if (ll.contains(temp)) {
				return false;
			}
			ll.topOfStack = new ListNode(temp, ll.topOfStack);
			temp = temp.next;
		}
		return true;
	}

	/**
	 * Get the most recently inserted item in the stack. Does not alter the
	 * stack.
	 * 
	 * @return the most recently inserted item in the stack, or null, if empty.
	 */
	public Object top() {
		if (isEmpty())
			return null;
		return topOfStack.element;
	}

	/**
	 * Remove the most recently inserted item from the stack.
	 * 
	 * @exception Underflow
	 *                if the stack is empty.
	 */
	public void pop() throws Underflow {
		if (isEmpty())
			throw new Underflow();
		topOfStack = topOfStack.next;
	}

	/**
	 * Return and remove the most recently inserted item from the stack.
	 * 
	 * @return the most recently inserted item in the stack, or null, if empty.
	 */
	public Object topAndPop() {
		if (isEmpty())
			return null;

		Object topItem = topOfStack.element;
		topOfStack = topOfStack.next;
		return topItem;
	}

	/**
	 * Insert a new item into the stack.
	 * 
	 * @param x
	 *            the item to insert.
	 */
	// @ ensures topOfStack.element == x;
	public void push(Object x) {
		topOfStack = new ListNode(x, topOfStack);
	}

	ListNode topOfStack;

	public static void main(String[] args) {
		StackLi s = new StackLi();

		for (int i = 0; i < 10; i++)
			s.push(new Integer(i));

		while (!s.isEmpty())
			System.out.println(s.topAndPop());
	}
}
