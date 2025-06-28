package java_YM;

public class Calc {
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	void sum(double a, double b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.sum(12.5, 13.5);
		obj.sum(2, 3);
	}
}
