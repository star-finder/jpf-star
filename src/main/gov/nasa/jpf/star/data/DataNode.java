package gov.nasa.jpf.star.data;

import gov.nasa.jpf.star.formula.Variable;

public class DataNode {
	
	private String type;
	
	private Variable[] fields;
	
	public DataNode(String type, Variable[] fields) {
		this.type = type;
		this.fields = fields;
	}
	
	public String getType() {
		return type;
	}
	
	public Variable[] getFields() {
		return fields;
	}
	
	@Override
	public String toString() {
		String ret = "";
		ret += "data " + type + "{\n";
		
		for (int i = 0; i < fields.length; i++) {
			ret += fields[i].getType() + " " + fields[i].getName() + ";\n";
		}
		
		ret += "}.";
		
		return ret;
	}
	
	public String toS2SATString() {
		return this.toString();
	}

}
