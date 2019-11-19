import java.util.Scanner;

public class LargestPalindrome {

	public static long isPal(int nrCifre)

	{
		long longPalindrom;
		long longInvers = 0;
		long longCopie;
		long longMaxim = 0;
		int limitaInferioara = 0;
		int limitaSuperioara = 0;

		if (nrCifre == 3) {
			limitaInferioara = 99;
			limitaSuperioara = 999;
		} else if (nrCifre == 4) {
			limitaInferioara = 999;
			limitaSuperioara = 9999;
		}

		for (int i = limitaSuperioara; i > limitaInferioara; i--) {
			for (int j = i; j > 99; j--)

			{
				longPalindrom = i * j;

				longInvers = 0;
				longCopie = longPalindrom;

				while (longPalindrom > 0) {
					longInvers = (longInvers * 10) + (longPalindrom % 10);
					longPalindrom = longPalindrom / 10;
				}

				if (longCopie == longInvers)
					if (longCopie > longMaxim)
						longMaxim = longCopie;
			}
		}
		return longMaxim;

	}

	public static void main(String[] args) {

		Scanner keyboardInput = new Scanner(System.in);
		int nrCifre;

		System.out.println("Dati numarul de cifre - 3 sau 4: ");
		nrCifre = keyboardInput.nextInt();

		System.out.print("Cel mai mare palindrom este " + isPal(nrCifre));
	}
}