package Edunova03;

import javax.swing.JOptionPane;

public class Zadatak1 {

	public static void main(String[] args) {

//program učitava dva broja.
//U slučaju da su oba broj pozitivna ispisuje njihov zbroj
//inače ispisuje oba broja jedan pored drugoga odvojeno zarezom

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi 1. broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi 2. broj"));
		
		if ( a > 0 & b > 0) {
			System.out.println( a + b);
		} else {
			System.out.println( a + " , " + b);
		}

	}

}
