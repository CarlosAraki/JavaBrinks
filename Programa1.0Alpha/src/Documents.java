
public class Documents {
	
	
	protected String name;
	protected String[] dado;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDado(String[] dado) {
		this.dado = dado;
	}

	public boolean equals(String name) {
		if(this.name.matches(name)) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return this.name;
	}
	
	
}
