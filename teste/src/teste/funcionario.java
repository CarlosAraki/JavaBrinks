package teste;

public abstract class funcionario {
	protected String name;
	protected String cpf;
	protected double salario;
	
	
	public void setName(String name) {
		this.name=name;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public void setSalario(double salario) {
		this.salario=salario;
	}
	public abstract double bonus();
}
