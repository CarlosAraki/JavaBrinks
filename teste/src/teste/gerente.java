package teste;

public class gerente extends funcionario{
	private int senha;
	protected int numeroDeFuncionarios;
	
	gerente(int senha){
		this.senha=senha;
	}
	
	public boolean autentica(int senha) {
		if(senha == this.senha) {
			System.out.println("Acesso Permitido!");
			return true;
		}
		else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	public void setNumeroDeFuncionarios(int num) {
		this.numeroDeFuncionarios= num;
	}
	@Override
	public double bonus() {
		return this.salario =  this.salario*1.2;
	}
	
}
