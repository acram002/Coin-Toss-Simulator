/*
 * Alexander Cramer
 * Coin Toss Simulator
 */
package coinTossSimulator;

import java.util.Random;
import java.util.Scanner;


public class coinTossSim {

	
	public static void main(String[] args) {
	
		//enables prgrm to make call to JPanel
		inputPanel input = new inputPanel(); 
		
		input.timesFlip(); //calls JPanel and method calls from there will finish
							//prgrm, Jpanel will gather user input, call coinToss method,
							//and call JFrame to display coin toss animation and results
		
	}
	
	
	
			//method for coin toss
	public static int [] coinToss(int numTimes) {
		
		int [] flipsArray = new int[numTimes];
		
		//loops amount of times specified by user
		for(int i = 0; i < numTimes; i++) {
			
			//declares and generates Random Number 1 or 0 (Heads or Tails); puts random number into array
			Random coin = new Random();
			flipsArray[i] = coin.nextInt(2);
		
			}
		//returns array of random numbers
		return flipsArray;
		
	}
	
}


//old, unused code

/*
	public static void startProgram() {
		
		Scanner scnr = new Scanner(System.in);
				//prompts user for # of times to flip coin, then 
				//calls coinToss w/ # of times, then
				//calls stats to print statistics
		System.out.println("Enter number of times to flip coin: ");
		int flips = scnr.nextInt();

		coinToss(flips);
		stats(flips);

		scnr.close();
	}
	*/

/*
public static void stats(int numTimes) {
	
		//prints stats about coin flips
	System.out.println();
	System.out.println("Statistics");
	System.out.println("Number of times Heads: " + h);
	System.out.println("Number of times Tails: " + t);
	System.out.println("Percentage Heads: " + (((double) h / (double) numTimes) * 100) + "%");
	System.out.println("Percentage Tails: " + (((double) t / (double) numTimes) * 100) + "%");
}
*/

//MyFrame frame = new MyFrame();
		//int [] flipResults = coinToss(times2Flip); //calls coinToss w/ returned int from JPanel
													//assigns returned int array to flipResults
		
		//frame.MyFrame(flipResults); //calls JFrame w/ array from coinToss
