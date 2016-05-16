package Sample_0516;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Dimension;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300, 200);
		setLocation(screenSize.width/2, screenSize.height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
		
		setLayout(new FlowLayout());
		JButton button1 = new JButton("button1");
		JButton button2 = new JButton("button2");
		this.add(button1);
		this.add(button2);
		setVisible(true);
	}

}