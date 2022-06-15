package coinTossSimulator;

import javax.swing.*;

import java.awt.*;
import javax.swing.ImageIcon;
import java.io.*;


public class MyFrame extends JFrame {
	
	//variable declarations to be used in methods
	public int coinTypeNum;
	ImageIcon heads; 
	ImageIcon tails; 
	ImageIcon coinFlip = new ImageIcon("coinFlip.png");
	JLabel label = new JLabel();
	
	
	public void MyFrame(int [] flipResults, String coinType, String skipAnim)	{
		
		skipAnim = skipAnim.toLowerCase();
		
		//creates JFrame with title, layout, etc.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Coin Toss Simulator");
		this.setLayout(new FlowLayout()); //changed from null
		this.setSize(500, 500);
		this.setVisible(true);
		
		//calls iconSet to display animation based on 
		//array of rand num (coin flips) and coinType selected
		//by user
		if (skipAnim.equals("play")) {
		iconSet(flipResults, coinType.toLowerCase(), skipAnim); 
		}
		else if (skipAnim.equals("skip")) {	
		}
		else {
			System.out.println("Invalid Input Choice for Animation!!! (Ensure Spelling is the Same and Do Not Include Spaces)");
			System.exit(0);
		}
		
		//calls stats method to display stats
		//based on rand num array (coin flips)
		stats(flipResults); 
	}
		
		
	public void iconSet(int [] flipsArray, String coinType, String skipAnim) {
			
		
			//switch case to set the image that will
			//be displayed as the coin in animation, based
			//upon which coin type the user selected
			switch (coinType) {
			
			case "quarter": heads = new ImageIcon("heads2.png");
							tails = new ImageIcon("tails2.png");
					break;
					
			case "dime": heads = new ImageIcon("headsDime.png");
						tails = new ImageIcon("tailsDime.jpeg");
					break;
					
			case "penny": heads = new ImageIcon("headsPenny.jpeg");
						tails = new ImageIcon("tailsPenny.png");
					break;
			case "special": heads = new ImageIcon("specHeads.png");
						tails = new ImageIcon("specTails.png");
						break;
			default: 
					System.out.println("Invalid Input for Coin Type!!! (Ensure Spelling is the Same and Do Not Include Spaces)");
					System.exit(0);
			}
		
			//iterates through array of random numbers
			for (int i = 0; i < flipsArray.length; i++) {
			
				//if rand num == 1 (or heads) will
				//first display coin flip image and pause the thread for 1 sec,
				//then will display heads coin image and pause thread for 1.5 sec.
				//same process for 0 (or tails).
				//for loop will continue to iterate thru all numbers (or flips)
				//unless exception caught 
				if (flipsArray[i] == 1) {
					try {
						label.setIcon(coinFlip);
						JScrollPane scrollPane = new JScrollPane(label);
						scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
						scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
						add(scrollPane,BorderLayout.CENTER);
						pack();
						
						Thread.sleep(1000);
				
						label.setIcon(heads);
				
						Thread.sleep(1500);
						
					}
					catch (InterruptedException e){
						System.err.println(e.getMessage());
		}
		}
		
				else {
					try {
						label.setIcon(coinFlip);
						JScrollPane scrollPane = new JScrollPane(label);
						scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
						scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
						add(scrollPane,BorderLayout.CENTER);
						pack();
			
						Thread.sleep(1000);
				
						label.setIcon(tails);
						
						Thread.sleep(1500);
						

					}
					catch (InterruptedException e){
						System.err.println(e.getMessage());
					}
				}
		}
			
			
		}	
	
	public void stats(int [] flipsArray) {
		
		int h = 0;
		int t = 0;
		JLabel textLabel = new JLabel();
		
		//iterates thru arrray of random numbers
		// if 1 (or heads) h++, same for 0 (or tails)
		for (int i = 0; i < flipsArray.length; i++) {
			
			if (flipsArray[i] == 1) {
				h++;
			}
			else {
				t++;
			}
			
			//displays stats text in JLabel
			//gives # heads, tails, and %'s 
			//printed with html format
			textLabel.setText("<html>Statistics<br>Number of Times Heads: " + h + "<br>Number of Times Tails: " + t + "<br>Percentage Heads: " + (((double) h / (double) flipsArray.length) * 100) + "%<br>Percentage Tails: " + (((double) t / (double) flipsArray.length) * 100) + "%</html>");
			textLabel.setFont(new Font("Serif", Font.PLAIN, 30));
			JScrollPane scrollPane = new JScrollPane(textLabel);
			scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			add(scrollPane,BorderLayout.CENTER);
			pack();
			
	}
	}
}
	
	/*
	public void setCoinType(String coinType) {
		
		if (coinType.toLowerCase().equals("quarter")) {
			coinTypeNum = 0;
		}
		else if (coinType.toLowerCase().equals("dime")) {
			coinTypeNum = 1;
		}
		else if (coinType.toLowerCase().equals("penny")) {
			coinTypeNum = 2;
		}
		else {
			coinTypeNum = -1;
		}
	}

	}
	*/
	
//old, unused code

	/* Button on JFrame
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(e -> main.startProgram());
		button.setText("button text");
		button.setFocusable(false);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		
		ImageIcon heads = new ImageIcon();
		ImageIcon tails = new ImageIcon();
		
		this.addButton(); ?
		*/
		
		/* Resize Image
		 * //new ImageIcon(new ImageIcon("heads2.png").getImage().getScaledInstance(width, height, hints);
		 */

//prints stats about coin flips
/*System.out.println();
System.out.println("Statistics");
System.out.println("Number of times Heads: " + h);
System.out.println("Number of times Tails: " + t);
System.out.println("Percentage Heads: " + (((double) h / (double) flipsArray.length) * 100) + "%");
System.out.println("Percentage Tails: " + (((double) t / (double) flipsArray.length) * 100) + "%");
*/
	

