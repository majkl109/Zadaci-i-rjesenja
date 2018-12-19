package Edunova04;

import javax.swing.JOptionPane;

public class Zadatak11 {

// Program prima 4 broja
// ispisuje zbroj svih parnih primljenih brojeva
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Insert 1. number "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Insert 2. number "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Insert 3. number "));
		int d = Integer.parseInt(JOptionPane.showInputDialog("Insert 4. number "));
		
		int sum = 0;
		if (a%2 == 0) {
			sum = sum + a;
		}
		if (b%2 == 0) {
			sum = sum + b;
		}
		if (c%2 == 0) {
			sum = sum + c;
		}
		if (d%2 == 0) {
			sum = sum + d;
		}
		System.out.println(sum);
	}
}
