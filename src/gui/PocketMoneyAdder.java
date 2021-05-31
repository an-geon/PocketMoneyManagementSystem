package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class PocketMoneyAdder extends JFrame{
	
	public PocketMoneyAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JButton button1 = new JButton("Save");
		JButton button2 = new JButton("Cancel");
		
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
		panel.add(labelprice);
		panel.add(fieldprice);
		
		panel.add(button1);
		panel.add(button2);
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
