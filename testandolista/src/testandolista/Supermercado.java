package testandolista;

import java.util.List;

public class Supermercado {

	protected List<Produto> produtos;
	
	Supermercado(List<Produto> a){
		this.produtos = a;
	}
	
	public void addNaLista(Produto p) {
		this.produtos.add(p);
	}
	public int encontraNaLista(String s) {
		for(int i=0;i<produtos.size();i++) {
			Produto p = (Produto) produtos.get(i);
			if(p.nome==s) {
				return  i;
			}
		}
		return -1;
	}
	public void precoProduto(String s) {
		int id = this.encontraNaLista(s);
		if(id ==-1) {
			System.out.println("Produto inexistente");
		}
		else {
			Produto p = (Produto) produtos.get(id);
			System.out.println("Custa "+p.preco);
		}
	}
	public void removedaLista(String s) {
		int id = this.encontraNaLista(s);
		if(id ==-1) {
			System.out.println("Produto inexistente");
		}
		else {
			produtos.remove(id);
			System.out.println("Produto apagado");
		}	
	}
	public void mostraItem(String s) {
		int id = this.encontraNaLista(s);
		if(id ==-1) {
			System.out.println("Produto inexistente");
		}
		else {
			System.out.println((Produto)produtos.get(id));
		}
	}
	@Override
	public String toString() {
		Produto p;
		for(int i = 0;i<this.produtos.size();i++) {
			p = (Produto)this.produtos.get(i);
			System.out.println(p);
		}
		return "Final da  Lista";

	}
}
