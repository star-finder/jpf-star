package gov.nasa.jpf.star.formula;

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
	
	public boolean isPrim() {
		if (type.equals("bool") || type.equals("byte") || type.equals("char") ||
				type.equals("double") || type.equals("float") || type.equals("int") ||
				type.equals("long") || type.equals("short"))
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object other) {
		if (this == other)
			return true;
		else if (!(other instanceof Variable)) {
			return false;
		} else {
			Variable otherVar = (Variable) other;
			if (type.equals("") || otherVar.getType().equals("")) {
				return name.equals(otherVar.getName());
			} else {
				return name.equals(otherVar.getName()) &&
						type.equals(otherVar.getType());
			}
		}
	}

}
