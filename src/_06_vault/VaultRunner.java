package _06_vault;

import javax.swing.JOptionPane;

public class VaultRunner {
	public static void main(String[] args)
	{
		Vault vault = new Vault();
		SecretAgent agent = new SecretAgent();
		
		
String numgues = JOptionPane.showInputDialog("Guess a number for the code");
	int guess =	Integer.parseInt(numgues);
		
		System.out.println(vault.tryCode(guess)+" the guess is incorrect");
		
		agent.findCode(vault);
	}
	
	
}
