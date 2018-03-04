package testandolista;

public class Produto implements Comparable<Produto>{
	protected String nome;
	protected double preco;
	Produto(String nome,int preco){
		this.nome = nome;
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto:"+this.nome+"\nPreco:"+this.preco;
	}
	@Override
	public int compareTo(Produto a) {
		if(this.preco == a.preco) {
			return 0;
		}
		if(this.preco > a.preco) {
			return 1;
		}
		return -1;
	}
}
