package empresa;

public class Dinheirototal {
	private static double gasto;
	
	public double retorno(funcionario a) {
		return Dinheirototal.gasto = Dinheirototal.gasto+a.salario;
	}
	
	public void login(autentica a,int senha) {
		a.autenticaSenha(senha);
	}
	
	public void getSaca(funcionario f,int dinheiro) {
		try {
			if(dinheiro>f.salario) {
				throw new IllegalArgumentException("Voce está pobre");
			}
			else {
				f.salario -=dinheiro;
				System.out.println("vc tem "+f.salario+"moneys");
			}
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());			
		}
	}
	
	public void rescreveString(String a) {
		int tam = a.length();
		int i;
		for(i=0;i<tam;i++) {
			System.out.print(a.charAt(i));
		}
	}
	
	public void rescreveString2(String a) {
		int tam = a.length();
		int i;
		for(i=--tam;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
	}
	
	
	@Override
	public String toString() {
		return "O gasto total foi de:"+this.gasto  ;
	}
}
