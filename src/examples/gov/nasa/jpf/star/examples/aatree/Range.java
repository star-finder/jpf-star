package gov.nasa.jpf.star.examples.aatree;

public class Range {
	final int lower;
	final int upper;
	final boolean isPositiveInfinity;
	final boolean isNegativeInfinity;

	public Range() {
		this(0, 0, true, true);
	}

	private Range(final int u, final int l, final boolean ip, final boolean in) {
		this.upper = u;
		this.lower = l;
		this.isPositiveInfinity = ip;
		this.isNegativeInfinity = in;
	}

	public boolean inRange(final int value) {
		boolean ret = true;
		if (!this.isPositiveInfinity) {
			ret = value < this.upper;
		}
		if (!this.isNegativeInfinity) {
			ret = ret && (value > this.lower);
		}
		return ret;
	}

	public Range setLower(final int l) {
		assert this.isNegativeInfinity || (l > this.lower);
		return new Range(this.upper, l, this.isPositiveInfinity, false);
	}

	public Range setUpper(final int u) {
		assert this.isPositiveInfinity || (u < this.upper);
		return new Range(u, this.lower, false, this.isNegativeInfinity);
	}
}
