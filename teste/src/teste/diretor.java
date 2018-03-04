package teste;

public class diretor extends gerente {
	

	
	diretor(int senha) {
		super(senha);
	}

	@Override
	public  double bonus() {
		return this.salario*1000;
	}
}
