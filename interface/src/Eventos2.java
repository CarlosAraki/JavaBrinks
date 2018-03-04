import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Eventos2 extends JFrame{

	public Eventos2(String Titulo) {
		super(Titulo);
		JLabel label = new JLabel("Oloko bixo");
		label.setToolTipText("Apresento o texto!");
		Font font = new Font("serif",Font.BOLD | Font.ITALIC,28);
		label.setFont(font);
		label.setForeground(Color.blue);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		getContentPane().add(label);
	}
	public static void main(String[] args) {
		Eventos2 c = new Eventos2("titulo");
	
	}

}
