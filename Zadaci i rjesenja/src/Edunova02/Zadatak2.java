package Edunova02;

import javax.swing.JOptionPane;

public class Zadatak2 {
	
	public static void main(String[] args) {
	
//Program prima dva cijela broja i jedan decimalni.
//ispisuje prvo decimalni pa razlika primljena dva cijela broja
	
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi 1. cijeli broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi 2. cijeli broj"));
	  float k = Float.parseFloat(JOptionPane.showInputDialog("Unesi 1. decimalni broj"));
	  
	  System.out.println( k );
	  System.out.println( i-j );
	  
				
				
	}
	
	
	
}
