import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Eventos extends JFrame implements ActionListener{
	JButton button1;
	JLabel label = new JLabel("Oloko bixo");
	public Eventos(String Titulo) {
		super(Titulo);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		button1 = new JButton("Botao 1");
		getContentPane().add(button1);
		button1.addActionListener(this);
	}
	public static void main(String[] args) {
		Eventos c = new Eventos("titulo");
	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Oi");
		button1.setText("ola");
	
	}
}
