package Edunova02;

import javax.swing.JOptionPane;

public class Zadatak1 {

	public static void main(String[] args) {
		
//napisati program koji za tri unesena decimalna broja ispisuje
// zbroj prva dva umanjen za treći broj
		
		float a = Float.parseFloat(JOptionPane.showInputDialog("Unesi 1. broj"));
		float b = Float.parseFloat(JOptionPane.showInputDialog("Unesi 2. broj"));
		float c = Float.parseFloat(JOptionPane.showInputDialog("Unesi 3. broj"));
		
		System.out.println((a + b)-c);
		

	}

}
