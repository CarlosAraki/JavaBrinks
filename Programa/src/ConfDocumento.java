import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JOptionPane;

public class ConfDocumento {

	private String endereco;
	public Collection<Documento> doc;
	ConfDocumento(String end){
		this.endereco = end;
	}
	public void setHashInicial() throws IOException{
		Set<Documento> doc = new HashSet<Documento>();
		InputStream is = new FileInputStream(this.endereco);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader isrr = new BufferedReader(isr);
		String s = isrr.readLine(); // primeira linha
		while (s != null) {
			Documento d = new Documento();
			d.setName(s);
			s = isrr.readLine();
			d.setDado(s);
			doc.add	(d);
			s = isrr.readLine();
		}
		isrr.close();
		
		this.doc = doc;
	}
	
	public void salvaHash() throws IOException{
		FileOutputStream is = new FileOutputStream(this.endereco);
		OutputStreamWriter isr = new OutputStreamWriter(is);
		BufferedWriter isrr = new BufferedWriter(isr);
		Iterator<Documento> i = this.doc.iterator();
		while (i.hasNext()) {
			Documento d = i.next();
			isrr.write(d.name+"\n");
			isrr.write(d.dado+"\n");
		}
		isrr.close();
		System.out.println("Criou Documento!");

	}
	public void adicionaElemento(Documento d) {
		this.doc.add(d);
	}
	public Documento encontraDoc(String nome) {
		Iterator<Documento> i = this.doc.iterator();
		while (i.hasNext()) {
			Documento d = i.next();
			if(d.equals(nome)) {
				return d;
			}
		}
		return null;
	}
	public void printaTudo() {
		Iterator<Documento> i = this.doc.iterator();
		int j,tam = this.doc.size();
		String[] s=new String[tam];
		j=0;
		while (i.hasNext()) {
			Documento palavra =i.next();
			s[j] = palavra.name;
			j++;
		}
		System.out.print(s);
		JOptionPane.showMessageDialog(null,s);
	}
	public boolean removerDoc(String nome) {//aqui
		Iterator<Documento> i = this.doc.iterator();
		while (i.hasNext()) {
			Documento d = i.next();
			if(d.equals(nome)) {
				i.remove();
				return true;
			}
		}
		return false;
	}
	
}

/*import java.io.BufferedReader; com listas ...
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;


public class ConfDocumento {

	private String endereco;
	public List<Documento> doc;
	ConfDocumento(String end){
		this.endereco = end;
	}
	public void setHashInicial() throws IOException{
		List<Documento> doc = new ArrayList<Documento>();
		InputStream is = new FileInputStream(this.endereco);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader isrr = new BufferedReader(isr);
		String s = isrr.readLine(); // primeira linha
		while (s != null) {
			Documento d = new Documento();
			d.setName(s);
			s = isrr.readLine();
			d.setDado(s);
			doc.add	(d);
			s = isrr.readLine();
		}
		isrr.close();
		
		this.doc = doc;
	}
	
	public void salvaHash() throws IOException{
		FileOutputStream is = new FileOutputStream(this.endereco);
		OutputStreamWriter isr = new OutputStreamWriter(is);
		BufferedWriter isrr = new BufferedWriter(isr);
		for(int i=0;i<this.doc.size();i++) {
			Documento d = (Documento) this.doc.get(i);
			isrr.write(d.name+"\n");
			isrr.write(d.dado+"\n");
		}
		isrr.close();
		System.out.println("Criou Documento!");

	}
	public void adicionaElemento(Documento d) {
		this.doc.add(d);
	}
	/*
	public Documento encontraDoc(String nome) {
		Iterator<Documento> i = this.doc.iterator();
		Documento d= new Documento();
		String s;
		while (i.hasNext()) {
			 d= i.next();
			 s = d.toString();
			 System.out.println(s+nome);
			 if(s==nome) {
				 break;
			 }
		}
		return d;
	}
	
	
	
	public Documento encontraNaLista(String s) {
		Documento p;
		String s2;
		for(int i=0;i<this.doc.size();i++) {
			p = (Documento) this.doc.get(i);
			System.out.println(p.toString()+" "+s);
			s2 = (String)p.name;
			if(s2.matches(s)) {
				System.out.println("Entrou");
				return  p;
			}
		}
		p= null;
		return p;
	}
	public void printaTudo() {
		for(int i=0;i<this.doc.size();i++)  {
		// recebe a palavra
			Documento palavra =(Documento) this.doc.get(i);
			System.out.println(palavra.name);
		}
	}
	
	

}
*/
