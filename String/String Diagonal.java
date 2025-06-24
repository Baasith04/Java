package training;

public class StringDiagonal {
	public static void main(String[] args) {
		String a = "HELLO";
		char[] chars = a.toCharArray();
		int n = a.length();
	    if (n % 2 == 0) {
	        System.out.println("Word must have an odd number of letters.");
	        return;
	    }
	    char[][] grid = new char[n][n];
	    for (int i = 0; i < n; i++) {       // Initialize grid with spaces
	        for (int j = 0; j < n; j++) {
	            grid[i][j] = ' ';
	        }
	    }
	    // Place characters on main diagonal and anti-diagonal
	    for (int i = 0; i < n; i++) {
	        grid[i][i] = chars[i]; // Main diagonal
	        grid[i][n - 1 - i] = chars[i]; // Anti-diagonal
	    }
	    for (int i = 0; i < n; i++) {         // Print the grid
	        for (int j = 0; j < n; j++) {
	            System.out.print(grid[i][j]);
	        }
	        System.out.println();
	    }
	}   
}

