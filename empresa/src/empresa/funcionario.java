package empresa;

public abstract class funcionario {
	protected String name;
	protected double salario;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
		
	@Override
	public boolean equals(Object ob) {
		if (ob==null) {
			return false;
		}
		funcionario f = (funcionario) ob;
		if(this.name == f.name) {
			return true;
		}
		return false;
	}
	public abstract double getBonificacao();
}
