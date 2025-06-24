package Programs;

public class sum_digits { public static void main(String[] args) {
	
	//582109 = (5+8+2+1+0+9)+(8+2+1+0+9)+(2+1+0+9)+(1+0+9)+(0+9)+(9)
	// 		   	  (25)		    +    (20)		+   (12)	+   (10) +(9) +(9) = 85
	
	int a = 582109;
	int sum = 0, pre=0;
	while(a!=0)
	{
		pre += a%10;
		sum += pre;
		a /=10;
	}
	System.out.println(a+sum);
	
}

}
