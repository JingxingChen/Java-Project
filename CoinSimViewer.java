package My.cs455.homework1;
//Name:Jingxing Cheng
//USC NetID:chen642
//CS 455 PA1
//Spring 2018
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

import javax.swing.JFrame;
//This class is to initial and test the component and show it on the JFrame.
public class CoinSimViewer {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of trials:");
		//Input the number of trials.
		int trials=input.nextInt();
		while(trials<=0) {
			System.out.println("ERROR: Number entered must be greater than 0.");
			System.out.print("Enter number of trials:");
			trials=input.nextInt();
		}
		JFrame frame=new JFrame();
		frame.setSize(800, 500);
		CoinSimComponent component=new CoinSimComponent(trials);
		Graphics g2=frame.getGraphics();
		frame.setTitle("CoinSim");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(component);
		frame.setVisible(true);
		CoinTossSimulator simulator=component.getCoinTossSimulator();
	}
}
