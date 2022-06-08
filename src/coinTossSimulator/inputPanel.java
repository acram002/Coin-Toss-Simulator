package coinTossSimulator;

import javax.swing.JOptionPane;

public class inputPanel {

	public int timesFlip() {
		
		//Prompts user for number of times to flip coin
		//assigns times2Flip w/ Integer taken from JPane
		//and returns value
		int times2Flip = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of times to flip coin: "));
		
		return times2Flip; 
	}
	
	
}
