package Edunova04;

import javax.swing.JOptionPane;

//Napiši program koji pročita jedan broj. 
//Nakon toga ako je broj veći od 10 program 
//izračuna površinu kruga i ispiše rezultat. 
//U suprotno program izračuna opseg kruga i ispiše ga. 
//U oba slučaja radijus je jednak upisanom broju.

public class Zadatak10 {
	
	

	

	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Insert 1. number: "));
		
		if ( a > 10) {
			System.out.println("Surface area of a circle is " + (a * a) * Math.PI  );
		}else{
			System.out.println("Circumference of a circle is " + ((2 * Math.PI) * a));
		}
		
	}

}
