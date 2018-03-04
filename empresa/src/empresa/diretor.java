package empresa;

public class diretor extends funcionario implements autentica {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autenticaSenha(int senha) {
		if(this.senha==senha) {
			System.out.println("Ok");
			return true;
		}
		System.out.println("Não OK");
		return false;
	}
	
	@Override
	public double getBonificacao() {
		return this.salario = this.salario*1.2;
	}
}
