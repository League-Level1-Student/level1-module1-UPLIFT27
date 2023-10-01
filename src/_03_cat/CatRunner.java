package _03_cat;

public class CatRunner {
	public static void main(String[] args)
	{
	Cat cat = new Cat("george");
	
	cat.meow();
	cat.printName();
	
	int LivesKilled = 0;
	while(LivesKilled<9)
	{
	cat.kill();
	LivesKilled++;
	}
	
	
	}
	
	
	
}
