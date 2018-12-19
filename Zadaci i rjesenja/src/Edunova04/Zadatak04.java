package Edunova04;

import javax.swing.JOptionPane;

public class Zadatak04 {

// Za dva unesena broja ispiši njihovu razliku u apsolutnoj vrijednosti	
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter 1. number: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter 2. number: "));
		
		
		if ( (a-b) > 0) {
		System.out.println(a - b);
		}else if( (a-b) < 0 ) {
		System.out.println( (a-b)* -1);	
		}else{
		System.out.println(0);	
		}

	}

}
