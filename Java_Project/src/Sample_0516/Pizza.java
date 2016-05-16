package Sample_0516;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pizza extends JFrame {
	
	public Pizza() {
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label1 = new JLabel("Welcome to Java Pizza. Choose!");
		panelA.add(label1);
		
		JButton button1 = new JButton("combo");
		JButton button2 = new JButton("potato");
		JButton button3 = new JButton("bulgogi");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		JLabel label2 = new JLabel("°³¼ö");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
		
	}

}
