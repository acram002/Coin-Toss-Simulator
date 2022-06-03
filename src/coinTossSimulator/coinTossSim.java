/*
 * Alexander Cramer
 * SENG 210
 * Coin Toss Simulator
 */
package coinTossSimulator;
import java.util.Random;
import java.util.Scanner;


public class coinTossSim {

	public static void main(String[] args) {
	
		Scanner scnr = new Scanner(System.in);
				//prompts user for # of times to flip coin, then 
				//calls coinToss w/ # of times
		System.out.println("Enter number of times to flip coin: ");
		int flips = scnr.nextInt();
		
		coinToss(flips);
		
		scnr.close();
	}
	
			//method for coin toss
	public static void coinToss(int numTimes) {
		
		//loops amount of times specified by user
		for(int i = 0; i < numTimes; i++) {
			
			//declares and generates Random Number 1 or 0 (Heads or Tails)
			Random coin = new Random();
			int result = coin.nextInt(2);
		
			//if 1 then heads, if 0 then tails
				if (result == 1) {
					System.out.println("Heads!");
				}
				else {
					System.out.println("Tails!");
				}
		}
		
	}

}

