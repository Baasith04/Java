package java_YM;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter "+n+" Elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0], min = arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
				max = arr[i];
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println("Largest Element is: "+max);
		System.out.println("Smallest Element is: "+min);
		sc.close();
		
	}
}
