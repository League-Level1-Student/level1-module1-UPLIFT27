package _07_duck;
import javax.swing.JOptionPane;

public class DuckRunner {
public static void main(String[] args)
{
	Duck duck = new Duck();
	Cow cow = new Cow();
	
	String favfood = JOptionPane.showInputDialog("What is your favorite food");
	String friends = JOptionPane.showInputDialog("How many friends");
	
	int friend = Integer.parseInt(friends);
	
	duck.Duckquestions(favfood, friend);
	
	
	String color = JOptionPane.showInputDialog("What is your favorite color");
	String ages = JOptionPane.showInputDialog("How old are you");
	
	int age = Integer.parseInt(ages);
	
	cow.Cowquestions(color, age);
	
	String WanttoMoo = JOptionPane.showInputDialog("Do you want the Cow to Moo (yes or no)");
	String WanttoQuack = JOptionPane.showInputDialog("Do you want the Duck to Quack (yes or no)");

	
	duck.Quacks(WanttoQuack);
	
	cow.Moo(WanttoMoo);;
}
	
}
