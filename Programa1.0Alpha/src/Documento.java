
public class Documento {
	protected String name;
	protected String[] dado;
	public void setName(String name) {
		this.name = name;
	}
	public void setDado(String[] dado) {
		this.dado = dado;
	}

	public boolean equals(String s) {
		if(this.name.matches(s)) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return this.name;
	}
}
