package java_YM;
import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		int[] freq = new int[256];
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			freq[ch]++;
		}
		System.out.println("Character frquencies in string: ");
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
				System.out.println((char)i+":"+freq[i]);
			}
		}
 	}
}
