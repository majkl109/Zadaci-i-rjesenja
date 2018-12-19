package Edunova05;

import javax.swing.JOptionPane;

public class Zadatak01 {

//program prima dva broj i ispisuje 
//zbroj svih brojeva između ta dva broja
//i=2
//j=4
// 2+3+4
// out 9
	
  public static void main(String[] args) {
	
	  
	  int i=Integer.parseInt(JOptionPane.showInputDialog("Insert 1. number"));
	  int j=Integer.parseInt(JOptionPane.showInputDialog("Insert 2. number"));	
      int r=0;
      for (int t=i; t<=j; t++){
          r+=t;
      } 
      System.out.println(r);
  
  }
}
