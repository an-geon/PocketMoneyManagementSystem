package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAdderListener;
import listener.ButtonViewerListener;

public class MenuSelection extends JPanel{
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		
		this.frame = frame;
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Pocketmoney");
		JButton button2 = new JButton("Edit Pocketmoney");
		JButton button3 = new JButton("View Pocketmoney");
		JButton button4 = new JButton("Exit");
		
		button1.addActionListener(new ButtonAdderListener(frame));
		button3.addActionListener(new ButtonViewerListener(frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	}
}
