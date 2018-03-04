package testandolista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		Supermercado s  = new Supermercado(new LinkedList());
		s.addNaLista(new Produto("Soja",30));
		s.addNaLista(new Produto("Sal",40));
		s.addNaLista(new Produto("Saque",30));
		s.addNaLista(new Produto("Sujo",60));
		s.addNaLista(new Produto("Sapo",50));
		System.out.println(s);
		Collections.sort(s.produtos);
		System.out.println(s);
		
	}
	

}
