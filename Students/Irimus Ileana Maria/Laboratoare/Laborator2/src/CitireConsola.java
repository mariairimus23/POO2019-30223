import java.util.Scanner;

public class CitireConsola {

	public static void main(String[] args) {
		System.out.println("Hello world");

		Scanner keyboardInput = new Scanner(System.in);
		int integerNr;
		double doubleNr;

		System.out.println("Introduceti intregul ");
		integerNr = keyboardInput.nextInt();

		System.out.println("Introduceti realul ");
		doubleNr = keyboardInput.nextDouble();

		System.out.println("Numerele introduse sunt:  " + integerNr + ", " + doubleNr);
	}
}