
public class Persoana {

	private int ID;
	private String nume;
	private String nrTel;

	public Persoana(int ID, String nume, String nrTel) {
		this.ID = ID;
		this.nume = nume;
		this.nrTel = nrTel;
	}

	public Persoana() {
	}

	public int getId() {
		return ID;
	}

	public String getNume() {
		return nume;
	}

	public String getNrTel() {
		return nrTel;
	}

	public String toString() {
		return "Nume persoana: " + nume + ", ID persoana: " + ID + ", nr de telefon: " + nrTel;
	}

	public final void print() {
		System.out.println(toString());
	}

}