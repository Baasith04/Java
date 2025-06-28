package java_YM;
import java.util.Scanner;

public class Student {
	private int age, marks, rollno;
	private String name;
	
	void set() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Roll Number:");
		int n = sc.nextInt();
		sc.nextLine();
		rollno = n;
		System.out.println("Enter your name:");
		String a = sc.nextLine();
		name = a;
		System.out.println("Enter your age:");
		int b = sc.nextInt();
		age = b;
		System.out.println("Enter your marks:");
		int c = sc.nextInt();
		marks = c;
	}
	void display() {
		System.out.println("Student Details");
		System.out.println("Roll No: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Marks: "+marks);
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		s.display();
	}
}
