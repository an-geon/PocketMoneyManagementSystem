package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PocketMoneyViewer extends JFrame{
	
	public PocketMoneyViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Date");
		model.addColumn("Content");
		model.addColumn("Price");
		model.addColumn("Balance");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
