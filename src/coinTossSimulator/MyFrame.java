package coinTossSimulator;

import javax.swing.*;

import java.awt.*;
import javax.swing.ImageIcon;
import java.io.*;


public class MyFrame extends JFrame {
	
	public void MyFrame(int [] flipResults)	{
		
		//creates JFrame with title, layout, etc.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Coin Toss Simulator");
		this.setLayout(new FlowLayout()); //changed from null
		this.setSize(500, 500);
		this.setVisible(true);
		
		iconSet(flipResults); //calls iconSet w/ array of random numbers
								//to portray images during coin flips
		
		stats(flipResults); //after all coin flip images, calls stats 
							//with the array to provide stats about coin flips
		
	}
		
		
	public void iconSet(int [] flipsArray) {
			
			JLabel label = new JLabel();
		
			
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
						label.setIcon(new ImageIcon("coinFlip.png"));
						JScrollPane scrollPane = new JScrollPane(label);
						scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
						scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
						add(scrollPane,BorderLayout.CENTER);
						pack();
						
						Thread.sleep(1000);
				
						label.setIcon(new ImageIcon("heads2.png"));
				
						Thread.sleep(1500);
						
					}
					catch (InterruptedException e){
						System.err.println(e.getMessage());
		}
		}
		
				else {
					try {
						label.setIcon(new ImageIcon("coinFlip.png"));
						JScrollPane scrollPane = new JScrollPane(label);
						scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
						scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
						add(scrollPane,BorderLayout.CENTER);
						pack();
			
						Thread.sleep(1000);
				
						label.setIcon(new ImageIcon("tails2.png"));
						
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
	

