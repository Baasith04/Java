package java_YM;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] a = new int[m][n];
		System.out.println("Enter Elements: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0;i<m;i++)
		{
			sum1+=a[i][i];
			sum2+=a[i][m-1-i];
		}
		System.out.println("Primary Diagonal Sum: "+sum1);
		System.out.println("Secondary Diagonal Sum: "+sum1);
		sc.close();
	}
}
