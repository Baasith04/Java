package Programs;

public class String1 { public static void main(String[] args) {
	String s1 = "MDBaaSith";
	char[] a = s1.toCharArray();
	String s2="";
	for(int i=0;i<a.length;i++) 
	{
		if(a[i] >= 'a' && a[i] <= 'z') 
		{
		a[i]=(char)(a[i]-32);
		s2=s2+a[i];
		}
		else
		{
		a[i]=(char)(a[i]+32);
		s2=s2+a[i];
		}
	}
	System.out.println(a);
}

}
