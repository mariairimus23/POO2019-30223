
public class PredatPeTabla {

	public static void main(String[] args) {
		try {

			String value;
			value = "1.4358568";
			int intNr = Integer.parseInt(value);
			double doubleNr = Double.parseDouble(value);

		} catch (NumberFormatException exception) {
			System.out.println("exceptie");
		}

		Object value2 = 17;
		Object value1 = 5;
		if (value1 == value2) // compara adresele
			System.out.println("true");
		else
			System.out.println("false");

		if (value1.equals(value2))// compara valorile
			System.out.println("true");
		else
			System.out.println("false");
	}
}