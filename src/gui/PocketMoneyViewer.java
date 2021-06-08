package gui;

import java.awt.Component;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.PocketmoneyManager;
import pocketmoney.Pocketmoney;



public class PocketMoneyViewer extends JPanel{
	
	PocketmoneyManager pocketmoneymanager;
	WindowFrame frame;
	
	public PocketMoneyViewer(WindowFrame frame, PocketmoneyManager pocketmoneymanager) {
		this.frame = frame;
		this.pocketmoneymanager = pocketmoneymanager;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Date");
		model.addColumn("Content");
		model.addColumn("Price");
		model.addColumn("Balance");
		
		for(int i = 0; i <  pocketmoneymanager.size(); i++) {
			Vector row = new Vector();
			Pocketmoney pm = pocketmoneymanager.get(i);
			row.add(pm.getDate());
			row.add(pm.getContent());
			row.add(pm.getPrice());
			row.add(pm.getBalance());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
