package gov.nasa.jpf.formula;

public class Variable {
	
	private String name;
	
	private String type;
	
	public Variable(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public Variable(Variable var) {
		this.name = var.getName();
		this.type = var.getType();
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
