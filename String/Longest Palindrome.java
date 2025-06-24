package training;

public class LongestPalindrome {
	public static boolean pal(String a, int i, int j) 
	{
		while(i<j) 
		{
			if(a.charAt(i)!=a.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
	public static String LongP(String a) 
	{
		int ml=0, st=0;
		for(int i=0;i<a.length();i++) 
		{
			for(int j=i;j<a.length();j++) 
			{
				if(pal(a,i,j))
				{
					if(j-i+1>ml) {
						ml=j-i+1;
						st=i;
					}
					
				}
			}
		}
		String res = "";
		for(int i=st;i<st+ml;i++) {
			res+=a.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
		String data = "vracecarsy";
		System.out.println(LongP(data));
	}
}
