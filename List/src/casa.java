
public class casa implements contrato{

	protected String cor;
	protected int numPortas;
	protected Porta[] portas;
	
	public void pinta(String s) {
		this.cor = s;
	}
	public int quantasPortasAbertas() {
		int cont=0,i;
		for(i=0;i<this.portas.length;i++) {
			if(this.portas[i].estaAberta()) {
				cont++;
			}
		}
		return cont;
	}
	public void adicionaPorta(Porta p) {
		int i = 0;
		while(this.portas[i]!=null) {
			i++;
		}
		this.portas[i]=p;
	}
	public int totalPortas() {
		return portas.length;
	}
	@Override
	public void abrirPorta(Porta p) {
		p.abrePorta();		
	}
	@Override
	public void fechaPorta(Porta p) {
		p.fechaPorta();		
	}

	
}
