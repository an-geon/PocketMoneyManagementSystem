package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.PocketMoneyAdder;
import gui.PocketMoneyViewer;
import gui.WindowFrame;

public class ButtonAdderListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonAdderListener (WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		PocketMoneyAdder adder = frame.getPocketmoneyadder();
		frame.setupPanel(adder);
	}

}
