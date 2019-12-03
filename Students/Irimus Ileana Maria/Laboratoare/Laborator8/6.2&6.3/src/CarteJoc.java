
public class CarteJoc {

	String numar = new String();
	String culoare = new String();

	public CarteJoc(String numar, String culoare) {
		this.culoare = culoare;
		this.numar = numar;
	}

	public String getNumar() {
		return numar;
	}

	public String getCuloare() {
		return culoare;
	}

	public static void main(String[] args) {

		CarteJoc carte = null;

		try {
			carte.getNumar();
			carte.getCuloare();
		} catch (NullPointerException e1) {
			e1.printStackTrace();
		}

		CarteJoc[] pachet = new CarteJoc[5];

		pachet[0] = new CarteJoc("A", "hearts");
		pachet[1] = new CarteJoc("2", "hearts");
		pachet[2] = new CarteJoc("10", "spades");

		try {
			pachet[11].getNumar();
			pachet[11].getCuloare();
		} catch (ArrayIndexOutOfBoundsException e2) {
			e2.printStackTrace();
		}
	}
}
