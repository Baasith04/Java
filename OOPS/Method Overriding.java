class Vehicle {
	void run() {
		System.out.println("Vehicle");
	}
}

class bike extends Vehicle {
	void run() {
		System.out.println("Bike");
	}
}
 public class Main {
     public static void main(String[] args) {
         Vehicle v = new bike();
         v.run();
     }
 }
