
public class Pet {

	private String nume;
	private String rasa;
	private int varsta;
	private String culoare;

	public Pet(String nume, String rasa, int varsta, String culoare) {
		this.nume = nume;
		this.rasa = rasa;
		this.varsta = varsta;
		this.culoare = culoare;
	}

	public String toString() {
		return nume + " este rasa " + rasa + ", are " + varsta + " luni si are blana " + culoare ;
	}
}