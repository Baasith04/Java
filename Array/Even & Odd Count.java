package java_YM;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int even=0, odd=0;
		System.out.print("Enter "+n+" Elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Even Count is: "+even);
		System.out.println("Odd Count is: "+odd);
		sc.close();
		
	}
}
