package coinTossSimulator;

import javax.swing.JOptionPane;

public class inputPanel {

	public void timesFlip() {
		
		//Prompts user for number of times to flip coin and type of coin
		//assigns times2Flip w/ Integer and typeCoin w/ String
		int times2Flip = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number of Times to Flip Coin (Must be Integer Value): "));
		String typeCoin = JOptionPane.showInputDialog(null,"Enter Type of Coin to Use (Quarter, Dime, Penny): ");
		
		//calls coinTossSim to get coin toss results
		//stores rand num results in array
		coinTossSim cts = new coinTossSim();
		int [] flipResults = cts.coinToss(times2Flip);

		//calls JFrame w/ flipResults array and 
		//String typeCoin to display animation and results
		MyFrame fr = new MyFrame();
		fr.MyFrame(flipResults, typeCoin);	
		
	}
	
	
}
