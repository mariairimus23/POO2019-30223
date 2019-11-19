import java.math.BigInteger;

public class BoabeGrau {

	public static void main(String[] args) {
		// v1

		BigInteger sumaFinala;
		sumaFinala = BigInteger.valueOf(1);

		BigInteger termenIntermediar;
		termenIntermediar = BigInteger.valueOf(1);

		for (int putere = 1; putere <= 63; putere++) {
			termenIntermediar = termenIntermediar.multiply(BigInteger.valueOf(2));
			sumaFinala = sumaFinala.add(termenIntermediar);
		}
		System.out.println("In total sunt " + sumaFinala + " boabe de grau pe tabla de sah.");

		// v2

		BigInteger sumaFinala1 = BigInteger.valueOf(2);
		System.out.println("In total sunt " + sumaFinala1.pow(64).subtract(BigInteger.valueOf(1))
				+ " boabe de grau pe tabla de sah.");
	}

}