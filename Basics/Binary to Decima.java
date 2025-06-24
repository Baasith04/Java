package Programs;
public class Binary { 
	public static void main(String[] args) {
    String binary = "1101";
    int decimal = Integer.parseInt(binary, 2); // Base 2 for binary
    System.out.println("Decimal value: " + decimal);
  }
}
