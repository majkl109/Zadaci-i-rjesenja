package Edunova03;

import javax.swing.JOptionPane;

public class Zadatak2 {

	public static void main(String[] args) {
		
//Napišite program za provjeru parnosti broja
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi jedan broj"));
		
		if ( a%2 == 0 && a != 0) {
			System.out.println("Broj je paran");
		} else if ( a == 0) {
			System.out.println("Broj je nula");
		} else {
			System.out.println("Broj je neparan");
			
		}

	}

}
