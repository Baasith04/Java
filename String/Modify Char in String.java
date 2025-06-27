package java_YM;
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
        String s = sc.nextLine();
        System.out.print("Enter Index to change: ");
		int i = sc.nextInt();
		System.out.print("Enter Char to replace: ");
        char a = sc.next().charAt(0);
        System.out.println("Original: "+s);
        s = s.substring(0,i)+a+s.substring(i+1);
        System.out.println("Modified: "+s);
	}
}



