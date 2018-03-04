package empresa;

public class main {

	public static void main(String[] args) {
		funcionario eng1 = new engenheiro();
		funcionario sec1 = new secretaria();
		diretor di1 = new diretor();
		Dinheirototal din = new Dinheirototal();
		eng1.setName("Ronaldo");
		eng1.setSalario(2000);
		sec1.setName("Anastacio");
		sec1.setSalario(3000);
		di1.setName("Eufucio");
		di1.setSalario(3000);
		di1.setSenha(123);
		din.login(di1, 1234);
		din.login(di1, 123);
		din.getSaca(eng1,1000);
		din.getSaca(sec1, 25000);
		System.out.println(din.retorno(eng1));
		System.out.println(din.retorno(sec1));
		System.out.println(din.retorno(di1));
		System.out.println(eng1.name.toUpperCase());
		din.rescreveString(sec1.name);
		din.rescreveString2(sec1.name);
	}
}
