package Edunova04;

import javax.swing.JOptionPane;

//U programu omogućite unos broja sekundi i ispišite 
//odgovarajuće vrijeme u satima, minutama i sekundama

public class Zadatak09 {
	
	public static void main(String[] args) {
		
	
	
	int a = Integer.parseInt(JOptionPane.showInputDialog("Insert number of seconds: "));
	
	
	
	System.out.println( (a/3600)+" hours "+ (a/60)%60 + " min " + a%60 + " sec" );
	
	}
}
