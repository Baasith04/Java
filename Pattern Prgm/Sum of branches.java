package training;

public class Pattern2 {
	    public static void main(String[] args) {
	        int r = 5;
	        for (int i = 0; i < r; i++) 
	        {
	        	
	            for (int j= 0; j < r - i - 1; j++) 
	            {
	                System.out.print(" ");
	            }
	            int n = 1;
	            for (int j = 0; j <= i; j++) {
	                System.out.print(n + " ");
	                n = n * (i - j) / (j + 1);
	            }

	            System.out.println(); 
	        }
	    }
	}


