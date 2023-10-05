package _07_duck;

import javax.swing.JOptionPane;

public class Duck
{
	String favoriteFood="";
	int numberOfFriends=0;
	
	void Duckquestions(String favoriteFood, int numberOfFriends)
	{
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
		
		
		JOptionPane.showMessageDialog(null, favoriteFood+ " is cool");
		if(numberOfFriends>6)
		{
			JOptionPane.showMessageDialog(null, "your have more friends than me");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "your need to socialize more");
		}
	}
	void Quacks(String quack)
		{
			
			if(quack.equals("yes"))
			{
				JOptionPane.showMessageDialog(null, "quaaaaack");
			}
			
			
			
		}
	
	
	
	
	
	
	
}

 class Cow
{
	 String favoriteColor="";
		int age=0;
	 
	 
	void Cowquestions(String favoriteColor, int age)
	{
		this.favoriteColor = favoriteColor;
	    this.age = age;
	    
		JOptionPane.showMessageDialog(null, favoriteColor+ " is cool");
		if(age>20)
		{
			JOptionPane.showMessageDialog(null, "your older than me");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "your young");
		}
	
	}
	void Moo(String WanttoMoo)
	{
		
		if(WanttoMoo.equals("yes"))
		{
			JOptionPane.showMessageDialog(null, "Mooooo");
		}
		
		
		
	}
		
	
	
}