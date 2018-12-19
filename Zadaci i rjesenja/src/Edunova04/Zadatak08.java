package Edunova04;

import javax.swing.JOptionPane;

//U programu omogućite unos dvije stranice pravokutnika 
//i izračunajte njegovu površinu i opseg

public class Zadatak08 {

	  public static void main(String[] args) {
		
		  float a = Float.parseFloat(JOptionPane.showInputDialog("Insert 1. side rectangle")); 
		  float b = Float.parseFloat(JOptionPane.showInputDialog("Insert 2. side rectangle"));
		  
		  System.out.println(" Surface is: " + (a * b));
		  System.out.println(" Perimeter is: " + ( 2 * (a + b)));
	  }
}
