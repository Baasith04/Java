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
		int b = a[0];
		for(int i=0;i<n-1;i++)
		{
			a[i] = a[i+1];
		}
		a[n-1] = b;
		System.out.println("After Left Rotation");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}
