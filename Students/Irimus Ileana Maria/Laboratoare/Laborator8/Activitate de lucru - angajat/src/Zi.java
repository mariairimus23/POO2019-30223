
public class Zi {

	private String nume;
	private boolean lucratoare;

	public Zi(String nume, boolean lucratoare) {
		this.nume = nume;
		this.lucratoare = lucratoare;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getNume() {
		return this.nume;
	}

	public void setLucratoare(boolean lucratoare) {
		this.lucratoare = lucratoare;
	}

	public boolean esteLucratoare() {
		return this.lucratoare;
	}
}