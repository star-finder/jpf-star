package gov.nasa.jpf.star.examples.tll;

public class Tll {
	
	public Tree bt2tll(Tree x, Tree p, Tree t) {
		x.parent = p;
		if (x.right == null) {
			x.next = t;
			return x;
		} else {
			Tree lm = bt2tll(x.right, x, t);
			return bt2tll(x.left, x, lm);
		} 
	}

}
