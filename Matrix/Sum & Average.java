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
		int sum=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				sum+=a[i][j];
			}	
		}
		System.out.println(sum);
		double avg = (double)sum / m+n;
		System.out.println(avg);
		sc.close();
	}
}
