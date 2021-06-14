package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.PocketmoneyManager;

public class WindowFrame extends JFrame{
	
	PocketmoneyManager pocketmoneymanager;
	PocketMoneyAdder pocketmoneyadder;
	PocketMoneyViewer pocketmoneyviewer;
	MenuSelection menuselection;
	
	public WindowFrame (PocketmoneyManager pocketmoneymanager) {
		this.pocketmoneymanager = pocketmoneymanager;
		pocketmoneyadder = new PocketMoneyAdder(this, this.pocketmoneymanager);
		pocketmoneyviewer = new PocketMoneyViewer(this, this.pocketmoneymanager);
		menuselection = new MenuSelection(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public PocketMoneyAdder getPocketmoneyadder() {
		return pocketmoneyadder;
	}

	public void setPocketmoneyadder(PocketMoneyAdder pocketmoneyadder) {
		this.pocketmoneyadder = pocketmoneyadder;
	}

	public PocketMoneyViewer getPocketmoneyviewer() {
		return pocketmoneyviewer;
	}

	public void setPocketmoneyviewer(PocketMoneyViewer pocketmoneyviewer) {
		this.pocketmoneyviewer = pocketmoneyviewer;
	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

}
