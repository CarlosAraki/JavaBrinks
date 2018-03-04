import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class JanelaPrincipal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<JButton> botoes;
	private List<JTextField> textos;
	private ConfDocumento doc;
	
	JanelaPrincipal(Container c1,Container c2,Container c3,List<JButton> botoes,List<JTextField>textos,ConfDocumento d){
		super("janelinha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(BorderLayout.WEST,c1);
		c.add(BorderLayout.CENTER,c2);
		c.add(BorderLayout.EAST,c3);
		
		for(int i = 0;i < botoes.size();i++) {
			botoes.get(i).addActionListener(this);
		}
		setButtonText(botoes,textos);
		this.doc = d;
	}
	
	public  void setButtonText( List<JButton> botoes,List<JTextField>textos){
		this.botoes = botoes;
		this.textos = textos;
	}
	@Override
	public void actionPerformed(ActionEvent arg) {
		if(arg.getSource() == this.botoes.get(0)) {//load
			Documento d = this.doc.encontraDoc(this.textos.get(0).getText());
			String s = "Arquivo inexistente";
			if(d==null) {
				JOptionPane.showMessageDialog(null,s);
			}
			else {
				s = "Nome:"+d.name
					+"\nDado:"+d.dado;
				JOptionPane.showMessageDialog(null,s);
			}
		}
		else if(arg.getSource() == this.botoes.get(1)) {//Salva
			Documento d = new Documento();
			
			if(this.doc.encontraDoc(this.textos.get(0).getText())==null) {
				d.setName(this.textos.get(0).getText());
				d.setDado(this.textos.get(1).getText());
				this.doc.adicionaElemento(d);
				try {
					this.doc.salvaHash();
				} catch (IOException e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"Elemento Adicionado");
			}
			else {
				JOptionPane.showMessageDialog(null,"Dado existente");
			}
		}
		
		else if(arg.getSource() == this.botoes.get(2)) {//Deleta
			Documento d = this.doc.encontraDoc(this.textos.get(0).getText());
			String s = "Arquivo inexistente";
			if(d==null) {
				JOptionPane.showMessageDialog(null,s);
			}
			else {
				s = "Nome:"+d.name
					+"\nDado:"+d.dado+"Foi Apagado do Registro!";
				JOptionPane.showMessageDialog(null,s);
				this.doc.removerDoc(this.textos.get(0).getText());
			}
		}
		
		else if(arg.getSource() == this.botoes.get(3)) {//Mostratudo
			this.doc.printaTudo();
		}
		
		else if(arg.getSource() == this.botoes.get(4)) {//Edita
			Documento d = this.doc.encontraDoc(this.textos.get(0).getText());
			String s = "Arquivo inexistente use Salvar";
			if(d==null) {
				JOptionPane.showMessageDialog(null,s);
			}
			else {
				JOptionPane.showMessageDialog(null,"Valor Atualizado!");
				this.doc.removerDoc(this.textos.get(0).getText());
				Documento d2= new Documento();
				d2.setName(this.textos.get(0).getText());
				d2.setDado(this.textos.get(1).getText());
				this.doc.adicionaElemento(d2);
				try {
					this.doc.salvaHash();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			}
		}
		else {
			
		}
		
		
	}


}
