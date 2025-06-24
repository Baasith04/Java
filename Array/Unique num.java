package Programs;

public class Array3_Qs { public static void main(String[] args) {
	//Finding Unique Number
	
	int[] n = new int[10];
	int num =292, count=0;
	while(num != 0) {
		n[num%10]++;
		num/=10;
	}
	for(int i=0;i<10;i++) {
		if(n[i]!=0) 
		{ 
		count++;
		}
	}
	System.out.println(count);
}

}
