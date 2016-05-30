package Homework1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = { 
			"Backspace", "", "=", 
			"7", "8", "9", 
			"4", "5", "6", 
			"1", "2", "3", 
			"0", "+", "-", 
			"*", "/", "%", };

	public Calculator() {
		tField = new JTextField(30);
		panel = new JPanel();
		tField.setText("0.");
		tField.setEnabled(false);

		panel.setLayout(new GridLayout(0, 3, 3, 3));
		buttons = new JButton[18];
		int index = 0;
		for (int rows = 0; rows < 6; rows++) {
			for (int cols = 0; cols < 3; cols++) {
				buttons[index] = new JButton(labels[index]);
				if (cols >= 3)
					buttons[index].setForeground(Color.white);
				else
					buttons[index].setForeground(Color.pink);
				buttons[index].setBackground(Color.blue);
				panel.add(buttons[index]);
				index++;
			}
		}
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator s = new Calculator();
	}

}