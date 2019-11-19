
public class Angajat extends Persoana {

	private int nrClienti;
	private String dataAngajare;

	public Angajat(int NrClienti, String dataAngajare) {
		super();
		this.nrClienti = nrClienti;
		this.dataAngajare = dataAngajare;
	}

	public int getNrClienti() {
		return nrClienti;
	}

	public String getDataAngajare() {
		return dataAngajare;
	}

	@Override
	public String toString() {
		return "nr clienti serviti: " + nrClienti + ", data angajarii : " + dataAngajare;
	}
}