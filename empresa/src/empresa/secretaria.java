package empresa;

public class secretaria extends funcionario{

	@Override
	public double getBonificacao() {
		return this.salario=this.salario*1.05;
	}
}
