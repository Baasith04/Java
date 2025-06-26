package java_YM;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] a = new int[m][n];
		boolean found = false;
		System.out.println("Enter Elements: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter Element to Search: ");
		int s = sc.nextInt();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(s==a[i][j]) {
					System.out.println("Match Found at:"+i+","+j);
					found = true; }
			}
		}
		if(!found)
			System.out.println("Match not Found!");
		sc.close();
	}
}
