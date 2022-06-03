package coinTossSimulator;
import java.util.Random;


public class coinTossSim {

	public static void main(String[] args) {
	
			//calls coinToss method to get result
		int result = coinToss();
		
			//if 1 then heads, if 0 then tails
		if (result == 1) {
			System.out.println("Heads!");
		}
		else {
			System.out.println("Tails!");
		}
		
	}
	
			//method for coin toss
	public static int coinToss() {
		
			//declares and generates Random Number 1 or 0 (Heads or Tails)
		Random coin = new Random();
		int heads = coin.nextInt(2);
	
		return heads;
	}

}

