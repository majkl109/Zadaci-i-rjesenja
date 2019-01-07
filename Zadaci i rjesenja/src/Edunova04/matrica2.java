package Edunova04;

public class matrica2 {
	
	public static void main(String[] args) {
		
           int n = 5;		
		
           int [][] spiral = new int [n][n];
           
           int value  = 1;
           
           int minRow = 0;
           
           int maxRow = n- 1;
           
           int minCol = 0;
           
           int maxCol = n-1;
           
           while (value <= n*n)
           {	   
	       
               for( int i = minRow; i <= maxRow; i++ )
               {   
                 spiral [i][maxCol]=value;
                 
                 value++;
               }
                	 
                 
               for( int i = maxCol-1; i>=minCol; i--)
               {
            	   spiral [maxRow][i]=value;
            	   
            	   value++;
               }
               
               for( int i = maxRow-1; i >= minRow; i--)
               {
            	   spiral [i][minCol]=value;
            	   
            	   value++;
               }
               
               for ( int i = minCol; i <= maxCol-1; i++)
               {   
            	   spiral[minRow][i]=value;
                  
                   value++;
               
               }
                   minCol++;
                   minRow++;
                   maxCol--;
                   maxRow--;
                   
               }    
               for (int i = 0; i < spiral.length; i++)
               {  
            	   for( int j = 0; j < spiral.length; j++)
            		   
            	   {
            		   System.out.print(spiral [i][j] + ("\t "));
           	   }
            	   
                       System.out.println();
           
	        }
	        	
	        	
	 
	}

}
