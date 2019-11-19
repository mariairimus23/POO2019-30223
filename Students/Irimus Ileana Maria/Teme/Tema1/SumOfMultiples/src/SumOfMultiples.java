import java.util.Scanner;

public class SumOfMultiples {

	public static void main(String[] args) {

		// int sumaMultiplii = 0;
		long sumaMultiplii = 0;

		Scanner keyboardInput = new Scanner(System.in);
		int numarDat;

		System.out.println("Introduceti numarul ");
		numarDat = keyboardInput.nextInt();

		for (int index = 3; index < numarDat; index++)
			if (index % 3 == 0 || index % 5 == 0)
				sumaMultiplii = sumaMultiplii + index;

		if (numarDat == 3)
			System.out.println("Suma multiplilor de 3 sau 5 este 3");
		else
			System.out.println("Suma multiplilor de 3 sau 5 este " + sumaMultiplii);
	}
}