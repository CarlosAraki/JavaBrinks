package teste;

public class Testagerente {

	public static void main(String[] args) {
		gerente novo = new diretor(234);
		novo.setName("Ronaldo");
		novo.autentica(1234);
		novo.autentica(234);
		novo.setSalario(250);
		System.out.println(novo.bonus());
	}

}
