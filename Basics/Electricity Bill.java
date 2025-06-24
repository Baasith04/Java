Question:
1. Prgm to calculate total electricity bill

for the 1st 50 units: Rs 0.5/Unit
for the next 100 units: Rs 0.75/Unit
for the next 100 units: Rs 1.2/Unit
for units above 250 units: Rs 1.5/Unit

add a subcharge of 20% to final bill

Solution:

package java_YM;
import java.util.Scanner;

public class Prgm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Units: ");
		int units = sc.nextInt();
		float bill;
		if(units<=50) {
			bill = units*0.50f;}
		else if(units<=150) {
			bill = 50*0.50f+((units-50)*0.75f);}
		else if(units<=250) {
			bill = 50*0.50f+100*0.75f+((units-150)*1.20f);}
		else {
			bill = 50*0.50f+100*0.75f+100*1.20f+((units-250)*1.50f);}
		bill+=bill*0.20f;
		System.out.printf("Total Electricity Bill: Rs. %.2f\n", bill);
		sc.close();
	}

}
