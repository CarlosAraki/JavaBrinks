import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener{
	
	JButton loga,cancela;
	JTextField login ;
	JPasswordField senha;
	public login() {
		Container c = getContentPane();

		loga =new JButton("jogar");
		cancela = new JButton("Cancela");
		login = new JTextField();
		senha = new JPasswordField();
		c.setLayout(new GridLayout(3,2));
		c.add(new JLabel("login:"));
		c.add(login);
		c.add(new JLabel("senha:"));
		c.add(senha);
		c.add(loga);
		c.add(cancela);
		loga.addActionListener(this);
		cancela.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		login n = new login();
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == loga) {
			String s = "login : " + login.getText() +
					 "\nsenha :"+ new String(senha.getPassword());
					JOptionPane.showMessageDialog(null,s);
		}
		else if(arg0.getSource()==cancela) {
			login.setText("");
			senha.setText("");
		}
		}

}
