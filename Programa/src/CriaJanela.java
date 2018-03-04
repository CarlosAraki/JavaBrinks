
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CriaJanela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -486143070602411039L;
	
	CriaJanela(ConfDocumento d){
		//listas
		List<JComponent> comp1=new ArrayList<JComponent>();
		List<JComponent> comp2=new ArrayList<JComponent>();
		List<JComponent> comp3=new ArrayList<JComponent>();
		List<JButton>botoes = new ArrayList<JButton>();
		List<JTextField>textos = new ArrayList<JTextField>();
		//botoes
		botoes.add(new JButton("Load"));
		botoes.add(new JButton("Salvar"));
		botoes.add(new JButton("Deletar"));
		botoes.add(new JButton("Mostrar Tudo"));
		botoes.add(new JButton("Editar"));
		//textos
		textos.add(new JTextField());
		textos.add(new JTextField());
		textos.add(new JTextField());
		textos.add(new JTextField());
		textos.add(new JTextField());
		textos.add(new JTextField());
		//juntar layout
		comp1.add(this.NegritoSerif("Nome:"));
		comp1.add(new JLabel());
		comp1.add(this.NegritoSerif("T.Ciclo:"));
		comp1.add(new JLabel());
		comp1.add(this.NegritoSerif("T.Bloqueio:"));
		comp1.add(new JLabel());
		comp1.add(this.NegritoSerif("T.Pausa:"));
		comp1.add(new JLabel());
		comp1.add(this.NegritoSerif("Pres.Inj.:"));
		comp1.add(new JLabel());
		comp1.add(this.NegritoSerif("Vel.Inj.:"));
		comp1.add(new JLabel());
		comp2.add(textos.get(0));
	
		comp2.add(textos.get(1));
		comp2.add(textos.get(2));
		comp2.add(textos.get(3));
		comp2.add(textos.get(4));
		comp2.add(textos.get(5));
		comp3.add(botoes.get(0));
		comp3.add(botoes.get(1));
		comp3.add(botoes.get(2));
		comp3.add(botoes.get(3));
		comp3.add(botoes.get(4));
		comp3.add(new JLabel());
		
		new JanelaPrincipal(this.JanelaColuna(comp1),this.JanelaColuna(comp2),this.JanelaColuna(comp3),botoes,textos,d);
	}
	
	public Container JanelaColuna(List<JComponent> j){
		int tam = j.size();
		Container cont = new JPanel();
		cont.setLayout(new GridLayout(tam,1));
		for(int i = 0;i < tam;i++) {
			cont.add(j.get(i));
		}
		System.out.println("Criou!");
		return cont;
	}
	
	public Container JanelaLinha (List<JComponent> j){
		int tam = j.size();
		Container cont = new JPanel();
		cont.setLayout(new GridLayout(1,tam));
		for(int i = 0;i < tam;i++) {
			cont.add(j.get(i));
		}
		System.out.println("Criou!");
		return cont;
	}
	
	public JLabel NegritoSerif(String s) {
		JLabel label = new JLabel(s);
		Font font = new Font("serif",Font.BOLD | Font.ITALIC,20);
		label.setFont(font);
		label.setForeground(Color.blue);
		return label;
	}


}
