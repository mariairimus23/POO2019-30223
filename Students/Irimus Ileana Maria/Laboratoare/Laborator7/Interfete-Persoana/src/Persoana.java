

public class Persoana implements Comparable<Persoana> {

	private String nume;
	private String prenume;
	private int varsta;

	public Persoana(String nume, String prenume, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
	}

	public int compareTo(Persoana p) {

		if (varsta > p.varsta)
			return 1;
		else if (varsta < p.varsta)
			return -1;
		else
			return 0;
	}
	
	public String toString() {
		return nume + " " + prenume + ", in varsta de " + varsta + " ani";
	}
}