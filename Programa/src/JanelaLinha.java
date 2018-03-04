
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class JanelaLinha extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4321591957045072763L;

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

}
