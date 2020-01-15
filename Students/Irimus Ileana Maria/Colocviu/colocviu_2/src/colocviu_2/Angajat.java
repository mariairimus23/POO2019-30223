package colocviu_2;

public abstract class Angajat implements Comparable<Angajat>, AtributiiAngajat {

	private String nume;
	private int id;
	private String dataAngajarii;
	private double bonusSalariu;

	public Angajat(String nume, int id, String dataAngajarii, double bonusSalariu) {

		this.nume = nume;
		this.id = id;
		this.dataAngajarii = dataAngajarii;
		this.bonusSalariu = bonusSalariu;
	}

	public String getNume() {
		return nume;
	}

	public void setBonusSalariu(double bonusSalariu) {
		this.bonusSalariu = bonusSalariu;
	}

	public double getBonusSalariu() {
		return bonusSalariu;
	}

	@Override
	public int compareTo(Angajat a) {
		if (bonusSalariu > a.bonusSalariu)
			return 1;
		else if (bonusSalariu < a.bonusSalariu)
			return -1;
		else
			return 0;
	}

}