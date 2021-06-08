package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.PocketMoneyViewer;
import gui.WindowFrame;

public class ButtonViewerListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewerListener (WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		PocketMoneyViewer viewer = frame.getPocketmoneyviewer();
		frame.setupPanel(viewer);
	}

}
