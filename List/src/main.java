import java.util.Random;

public class main {
	public static void main(String[] args) {
		casa c = new casa();
		Random g=  new Random();
		int tam = g.nextInt(10)+1;
		c.portas = new Porta[tam];
		while(tam>0) {
			c.adicionaPorta(new Porta());
			tam--;
		}
		c.portas[g.nextInt(c.portas.length)].fechaPorta();
		c.portas[g.nextInt(c.portas.length)].fechaPorta();
		c.cor = "verde";
		System.out.println(c.quantasPortasAbertas());
		System.out.println(c.totalPortas());
		
	
	}
}
