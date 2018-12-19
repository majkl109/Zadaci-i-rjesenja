package Edunova04;

import javax.swing.JOptionPane;

//Upiši dva cijela broja
//ispiši
//Zbroj
//Razliku
//Produkt
//Kvocijent
//Aritmetičku sredinu
//zbroj kvadtara brojeva


public class Zadatak06 {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter 1. integer: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter 2. integer: "));
		
		System.out.println("Sum is " + ( a + b ));
		System.out.println("Difference is " + ( a - b ));
		System.out.println("Product is " + ( a * b ));
		System.out.println("Divison is " + ( a - b ));
		System.out.println("Arithmetic mean is " + ((a + b) / 2));
		System.out.println("Sum of squares is " + (( a * a ) + ( b * b )));
		
	}   

}
