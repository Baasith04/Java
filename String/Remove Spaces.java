package java_YM;
import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		String res = str.replaceAll("\\s","");
		System.out.println("Without Spaces: "+res);
		sc.close();
	}
}
