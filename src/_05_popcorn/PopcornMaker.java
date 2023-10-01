package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args)
	{
		Microwave wave = new Microwave();
		
	String flavor =	JOptionPane.showInputDialog("What flavor do you want the popcorn");
	String minutes = JOptionPane.showInputDialog("How many minutes do you want the popcorn to cook");	
	int mins = Integer.parseInt(minutes);
	
		Popcorn corn = new Popcorn(flavor);
		wave.putInMicrowave(corn);
		wave.setTime(mins);
		wave.startMicrowave();
		
		
		
		
	}
	
}
