package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exceptions.DateFormatException;
import manager.PocketmoneyManager;
import pocketmoney.Income;
import pocketmoney.Pocketmoney;

public class PocketmoneyAdderListener implements ActionListener {

	JTextField fielddate;
	JTextField fieldcontent;
	JTextField fieldprice;
	PocketmoneyManager pocketmoneymanager;
	
	public PocketmoneyAdderListener(JTextField fielddate, JTextField fieldcontent, 
									JTextField fieldprice, PocketmoneyManager pocketmoneymanager) {
		this.fielddate = fielddate;
		this.fieldcontent = fieldcontent;
		this.fieldprice = fieldprice;
		this.pocketmoneymanager = pocketmoneymanager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Pocketmoney pocketmoney = new Income();
		try {
			pocketmoney.setDate(fielddate.getText());
			pocketmoney.setContent(fieldcontent.getText());
			pocketmoney.setPrice(Integer.parseInt(fieldprice.getText()));
			pocketmoneymanager.addPocketmoney(pocketmoney);
			putObject(pocketmoneymanager, "pocketmoneymanager.ser");
			pocketmoney.printinfo();
		} catch (DateFormatException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(PocketmoneyManager pocketmoneymanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(pocketmoneymanager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
