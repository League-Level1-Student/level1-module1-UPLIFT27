package _11_binary_converter;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binaryconverter implements ActionListener {

	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JTextField jtext = new JTextField(20);
	JLabel label = new JLabel();
	
	
	
	
	
	JButton button = new JButton();

	button.setText("convert");
	
	button.addActionLIstener(this);
	
	String texts = JOptionPane.showInputMessageDialog(null, "Convert 8 bits to binary")
	
	jtext.setText(texts)
			
	if(button.this)
	{
		convert(texts);
	}
	
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

}