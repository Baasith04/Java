package training;
import java.util.Scanner;

public class SpiralMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int r,c,p=1;
		r=c=n;
		System.out.println("Enter a");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n/2;i++) {
			for(int j=i;j<c;j++) {
				System.out.print(a[i][j]+" ");
				p++;
			}
			for(int j=i+1;j<r;j++) {
				System.out.print(a[j][c-1]+" ");
				p++;
			}
			for(int j=c-2;j>=i;j--) {
				System.out.print(a[r-1][j]+" ");
				p++;
			}
			for(int k=r-2;k>i;k--) {
				System.out.print(a[k][i]+" ");
				p++;
			}
			c-=1;
			r-=1;
		}
		if(n%2 !=0)
			System.out.print(a[n/2][n/2]);
	}

}
