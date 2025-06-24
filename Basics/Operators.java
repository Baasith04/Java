package java_YM;
import java.util.Scanner;

public class prgm {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter a");
		int a = ab.nextInt();
		System.out.println("Enter a");
		int b = ab.nextInt();
		System.out.println("Enter a");
		int c = ab.nextInt();
		if(a>=b && a>=c)
			System.out.println("a is greater");
		else if(b>=a && b>=c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");
}
}
