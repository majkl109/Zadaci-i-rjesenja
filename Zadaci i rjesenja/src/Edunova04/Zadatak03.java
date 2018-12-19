package Edunova04;

import javax.swing.JOptionPane;

public class Zadatak03 {

//Program prima broj i ispisuje taj broj uvećan za 10	
	
	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Insert first number: "));
		
		System.out.println(a + 10);
		
	}

}
