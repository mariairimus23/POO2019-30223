
public class Student implements Cloneable {

	private String nume;
	private String prenume;
	private Masina masina;

	public Student(String nume, String prenume, Masina masina) {
		this.nume = nume;
		this.prenume = prenume;
		this.masina = masina;
	}

	public String getNume() {
		return this.nume;
	}

	public String getPrenume() {
		return this.prenume;
	}

	public Masina getMasina() {
		return masina;
	}

	public void setMasina(Masina masina) {
		this.masina = masina;
	}

	public void revopsesteMasina(String culoare) {
		this.masina.setCuloare(culoare);
	}

	public Student shallowCopy() throws CloneNotSupportedException {
		return (Student) super.clone();
	}

	public Student deepCopy() throws CloneNotSupportedException {
		Student studentToBeCloned = (Student) super.clone();
		studentToBeCloned.setMasina((Masina) studentToBeCloned.getMasina().clone());
		return studentToBeCloned;
	}

	public String toString() {
		return this.nume + " " + this.prenume + ", " + this.masina.getMarca() + " " + this.masina.getCuloare();
	}
}