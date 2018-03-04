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

import javax.swing.JOptionPane;

public class ConfDocumento {

	private String endereco;
	public Collection<Documento> doc;
	protected int quantDados = 5;
	ConfDocumento(String end){
		this.endereco = end;
	}
	public void setHashInicial() throws IOException{
		Collection<Documento> doc = new HashSet<Documento>();
		InputStream is = new FileInputStream(this.endereco);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader isrr = new BufferedReader(isr);
		
		String[] Dados = new String[this.quantDados];
		String s = isrr.readLine(); // primeira linha
		while (s != null) {
			Documento d = new Documento();
			d.setName(s);
			for(int i = 0;i<this.quantDados;i++) {
				s = isrr.readLine();
				Dados[i]=s;
			}
			
			d.setDado(Dados);
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
			for(int i1 = 0;i1<this.quantDados;i1++) {
				isrr.write(d.dado[i1]+"\n");
			}
		}
		isrr.close();
		//System.out.println("Criou Documento!");

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