import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import javax.swing.*;

public class Janela extends JFrame implements ActionListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Collection<String> documento;
	private JTextField jtexto;
	private JButton botao;
	Janela(){
		Collection<String> doc = new ArrayList<>();
		documento = doc;
		jtexto = new JTextField();
		botao = new JButton("Botao");
		setDefaultCloseOperation(Janela.EXIT_ON_CLOSE); //Botao fechar
		setSize(500,200);								//tamanho em px
		setVisible(true);								//Visivel
		Container c = getContentPane();
		c.setLayout(new GridLayout(2,2));
		c.add(new JLabel("login:"));
		c.add(jtexto);
		c.add(botao);
		botao.addActionListener(this);		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String txt = this.jtexto.getText();
		if(txt == "") {//bug aqui
			JOptionPane.showMessageDialog(null,"Está vazio");
		}
		else {
			if(this.documento.add(txt)) {
				JOptionPane.showMessageDialog(null,"Está adicionado");
			}
			else {
				JOptionPane.showMessageDialog(null,"Está repetido");
			}
			this.jtexto.setText("");
		}
	}
}
