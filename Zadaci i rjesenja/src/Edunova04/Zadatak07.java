package Edunova04;

import javax.swing.JOptionPane;

//Napišite program koi izračunava volumen kocke

public class Zadatak07 {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog(" Insert the 1 side of a cube: "));
		
		System.out.println("Volume of a cube is " + (a * a * a));
	}

}
