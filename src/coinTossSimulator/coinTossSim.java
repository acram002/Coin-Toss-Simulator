/*
 * Alexander Cramer
 * SENG 210
 * Coin Toss Simulator
 */
package coinTossSimulator;
import java.util.Random;
import java.util.Scanner;


public class coinTossSim {

	//number of times Heads or Tails
	public static int h = 0;
	public static int t = 0;
	
	public static void main(String[] args) {
	
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
					h++;
				}
				else {
					System.out.println("Tails!");
					t++;
				}
		}
		
	}
	
	public static void stats(int numTimes) {
		
			//prints stats about coin flips
		System.out.println();
		System.out.println("Statistics");
		System.out.println("Number of times Heads: " + h);
		System.out.println("Number of times Tails: " + t);
		System.out.println("Percentage Heads: " + (((double) h / (double) numTimes) * 100) + "%");
		System.out.println("Percentage Tails: " + (((double) t / (double) numTimes) * 100) + "%");
	}

}

