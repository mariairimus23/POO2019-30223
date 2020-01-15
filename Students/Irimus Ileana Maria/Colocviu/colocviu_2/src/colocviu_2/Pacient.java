package colocviu_2;

public class Pacient {

	private String nume;
	private String prenume;
	private int varsta;
	private String sex;
	private double tip;
	private int numarMedicamente;

	public Pacient(String nume, String prenume, int varsta, String sex, int numarMedicamente) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.sex = sex;
		tip = Math.random(); // daca tip = 0, boala este cronica, altfel este acuta
		this.numarMedicamente = numarMedicamente;
	}

	public void calculeazaGradSeveritate() {
		int gradSeveritate = 0;
		if (this.tip == 0) {
			gradSeveritate = gradSeveritate + 1 + numarMedicamente;
		} else {
			gradSeveritate = gradSeveritate + 2 + numarMedicamente;
		}
	}

//	void citireDate() throws IncompleteDataException {
//		if ()
//			throw new IncompleteDataException("Prea putine date");
//		System.out.println("Did it");
//	}

	public void varstaIncorecta() throws WrongAgeFormatException {
		if (varsta > 110)
			throw new WrongAgeFormatException("Varsta incorecta");
		System.out.println("Varsta corecta");
	}

	public double getTip() {
		return tip;
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public String getSex() {
		return sex;
	}

}