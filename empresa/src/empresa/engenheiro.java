package empresa;

public class engenheiro extends funcionario{

	@Override
	public double getBonificacao() {
		return this.salario = this.salario*1.1;
	}

}
