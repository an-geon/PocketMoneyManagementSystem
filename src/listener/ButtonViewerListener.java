package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.PocketMoneyViewer;
import gui.WindowFrame;
import manager.PocketmoneyManager;

public class ButtonViewerListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewerListener (WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		PocketMoneyViewer pocektmoneyviewer = frame.getPocketmoneyviewer();
		PocketmoneyManager pocketmoneymanager = getObject("pocketmoneymanager.ser");
		pocektmoneyviewer.getPocketmoneymanager();
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(pocektmoneyviewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static PocketmoneyManager getObject(String filename) {
		PocketmoneyManager pocketmoneymanager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			pocketmoneymanager = (PocketmoneyManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) { 
			return pocketmoneymanager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return pocketmoneymanager;
	}
}
