package gov.nasa.jpf.star.data;

public class DataNode {
	
	private String type;
	
	private String[] paramTypes;
	
	public DataNode(String type, String[] paramTypes) {
		this.type = type;
		this.paramTypes = paramTypes;
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		String ret = "";
		ret += "data " + type + "{\n";
		
		for (int i = 0; i < paramTypes.length; i++) {
			ret += paramTypes[i] + " " + paramTypes[i].toLowerCase() + "_" + i + ";\n";
		}
		
		ret += "}.";
		
		return ret;
	}
	
	public String toS2SATString() {
		return this.toString();
	}

}
