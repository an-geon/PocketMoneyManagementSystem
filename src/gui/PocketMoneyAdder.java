package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.ButtonCancelListener;
import listener.PocketmoneyAdderListener;
import manager.PocketmoneyManager;

public class PocketMoneyAdder extends JPanel{
	
	PocketmoneyManager pocketmoneymanager;
	WindowFrame frame;
	
	public PocketMoneyAdder(WindowFrame frame, PocketmoneyManager pocketmoneymanager) {
		this.frame = frame;
		this.pocketmoneymanager = pocketmoneymanager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labeldate = new JLabel("Date :", JLabel.TRAILING);
		JTextField fielddate = new JTextField(10);
		labeldate.setLabelFor(fielddate);
		panel.add(labeldate);
		panel.add(fielddate);
		
		JLabel labelcontent = new JLabel("Content :", JLabel.TRAILING);
		JTextField fieldcontent = new JTextField(10);
		labelcontent.setLabelFor(fieldcontent);
		panel.add(labelcontent);
		panel.add(fieldcontent);
		
		JLabel labelprice = new JLabel("Price :", JLabel.TRAILING);
		JTextField fieldprice = new JTextField(10);
		labeldate.setLabelFor(fieldprice);
		
		JButton button1 = new JButton("Save");
		button1.addActionListener(new PocketmoneyAdderListener(fielddate, fieldcontent, fieldprice, pocketmoneymanager));
		
		JButton button2 = new JButton("Cancel");
		button2.addActionListener(new ButtonCancelListener(frame));
		
		panel.add(labelprice);
		panel.add(fieldprice);
		
		panel.add(button1);
		panel.add(button2);
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
