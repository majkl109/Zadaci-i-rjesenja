package Edunova05;

import java.util.Arrays;

import javax.swing.JOptionPane;

//program učitava 5 brojeva i 
//ispisje ih od najmanjeg do najvećeg

public class Zadatak02 {
	
	public static void main(String[] args) {
		
	int[] a = new int [5];
	
	for(int i=0; i<5; i++) {
		
		a[i]=Integer.parseInt(JOptionPane.showInputDialog("Insert number: "));
	}
	    Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
	}
	
}
