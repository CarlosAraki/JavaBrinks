import  javax.swing.*;
import java.awt.*;
public class Janela extends JFrame {

	public Janela() {
		
		super("janelinha");
		
		JFrame f = new JFrame();
		Container c = getContentPane();
		Container c2 = new JPanel();
		c.setLayout(new BorderLayout());
		c2.setLayout(new GridLayout(4,1));
		c2.add(new JButton("1"));
		c2.add(new JButton("2"));
		c2.add(new JButton("3"));
		c2.add(new JButton("4"));
		c.add(BorderLayout.CENTER,new JButton("Botao"));
		c.add(BorderLayout.EAST,c2);


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	
	}
	public static void main(String[] args) {
		
		new Janela();
		
		
	}
}
