
public class TestAllMatrix {
	public static void main(String[] args) {

		Integer[][] m1 = new Integer[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 1, 1, 1 } };
		Integer[][] m2 = new Integer[][] { { 1, 1, 1 }, { 2, 2, 2 }, { 0, 0, 0 } };

		IntegerMatrix integerMatrix = new IntegerMatrix();

		System.out.println("\nm1 + m2 is ");
		GenericMatrix.printResult(m1, m2, integerMatrix.addMatrix(m1, m2), '+');

		System.out.println("\nm1 * m2 is ");
		GenericMatrix.printResult(m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');

		Double[][] m3 = new Double[][] { { 1.1, 2.2, 3.3 }, { 4.4, 5.5, 6.6 }, { 1.1, 1.1, 1.1 } };
		Double[][] m4 = new Double[][] { { 1.1, 1.1, 1.1 }, { 2.2, 2.2, 2.2 }, { 0.5, 0.7, 0.3 } };

		DoubleMatrix doubleMatrix = new DoubleMatrix();

		System.out.println("\nm3 + m4 is ");
		GenericMatrix.printResult(m3, m4, doubleMatrix.addMatrix(m3, m4), '+');

		System.out.println("\nm3 * m4 is ");
		GenericMatrix.printResult(m3, m4, doubleMatrix.multiplyMatrix(m3, m4), '*');

		Long[][] m5 = new Long[][] { { (long) 11, (long) 22, (long) 33 }, { (long) 44, (long) 55, (long) 66 },
				{ (long) 111, (long) 111, (long) 111 } };
		Long[][] m6 = new Long[][] { { (long) 11, (long) 11, (long) 11 }, { (long) 222, (long) 222, (long) 222 },
				{ (long) 0, (long) 0, (long) 0 } };

		LongMatrix longMatrix = new LongMatrix();

		System.out.println("\nm5 + m6 is ");
		GenericMatrix.printResult(m5, m6, longMatrix.addMatrix(m5, m6), '+');

		System.out.println("\nm5 * m6 is ");
		GenericMatrix.printResult(m5, m6, longMatrix.multiplyMatrix(m5, m6), '*');
	}
}