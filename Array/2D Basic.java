package Programs;
import java.util.*;

public class Array1 { public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter size of array: ");
	int m = sc.nextInt();
	int n = sc.nextInt();
	int[][] arr = new int[m][n];
	System.out.println("Enter Array Elements: ");
	for(int i=0;i<m;i++) 
	{                                               
		for(int j=0;j<n;j++)
		{
		arr[i][j] = sc.nextInt();
		}
	}
	System.out.println("Array Elements are: ");
	for(int i=0;i<m;i++) 
	{
		for(int j=0;j<n;j++)
		{
		System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	sc.close();
}
}
