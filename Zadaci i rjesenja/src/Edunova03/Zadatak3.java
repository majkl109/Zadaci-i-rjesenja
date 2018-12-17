package Edunova03;

import javax.swing.JOptionPane;

public class Zadatak3 {

	public static void main(String[] args) {
		
// za primljena dva broja ispiši veći	
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Upisi 1.broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Upisi 2.broj"));
		
		if ( a < b ) {
			System.out.println( b );
		} else if ( a > b ) {
			System.out.println( a );
		 } else {
			 System.out.println(" Isti su ");
		 }
		

	}

}
