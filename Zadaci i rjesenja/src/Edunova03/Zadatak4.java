package Edunova03;

import javax.swing.JOptionPane;

public class Zadatak4 {

	public static void main(String[] args) {
		
// Program za 3 unesena broja ispisuje najmanji
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi 1.broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi 2.broj"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Unesi 3.broj"));
		
		if ( a > b && b > c ) {
			System.out.println(c);
			return;
		}
		if ( a > c && c > b ) {
			System.out.println( b );
			return;
		}
		if ( b > a && c > a ) {
		    System.out.println( a );
		    return;
		}
		if ( a == b && b == c ) {
			System.out.println(" Isti su ");
		}
		
	}

}
