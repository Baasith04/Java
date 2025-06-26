package java_YM;
import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		String a = "listen";
		String b = "silent";
		if(a.length()!=b.length())
			System.out.println("Not Anagrams");
		else {
			char[] a1 = a.toCharArray();
			char[] b1 = b.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(b1);
			if(Arrays.equals(a1, b1))
				System.out.println("Given String is Anagram");
			else
				System.out.println("Given string is not an Anagram");
		}
	}
}
