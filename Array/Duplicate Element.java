package java_YM;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("Enter "+n+" Elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++) 
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
					break;
				}
			}
		}
		sc.close();
	}
}
