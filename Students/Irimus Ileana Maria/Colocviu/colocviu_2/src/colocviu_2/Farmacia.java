package colocviu_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Farmacia implements Cloneable {

	private String denumire;
	private String adresa;
	private String numarTelefon;
	private String website;

	ArrayList<Angajat> angajati;
	Map<String, Integer> medMap;
	Map<Angajat, Integer> angajatMap;

	public Farmacia(String denumire, String adresa, String numarTelefon, String website) {

		this.denumire = denumire;
		this.adresa = adresa;
		this.numarTelefon = numarTelefon;
		this.website = website;
		angajati = new ArrayList<Angajat>();
		medMap = new HashMap<String, Integer>();
		angajatMap = new HashMap<Angajat, Integer>();

	}

	@SuppressWarnings("unchecked")
	public Farmacia deepCopy() throws CloneNotSupportedException {
		Farmacia farmaciaToBeCloned = (Farmacia) super.clone();
		farmaciaToBeCloned.setAngajati((ArrayList<Angajat>) farmaciaToBeCloned.getAngajati().clone());
		// farmaciaToBeCloned.setAngajatMap((Map<Angajat, Integer>)
		// farmaciaToBeCloned.getAngajatMap().clone());
		// farmaciaToBeCloned.setMedMap((Map<String, Integer>)
		// farmaciaToBeCloned.getMedMap().clone());
		return farmaciaToBeCloned;
	}

	public ArrayList<Angajat> getAngajati() {
		return angajati;
	}

	public void setAngajati(ArrayList<Angajat> angajati) {
		this.angajati = angajati;
	}

	public Map<String, Integer> getMedMap() {
		return medMap;
	}

	public void setMedMap(Map<String, Integer> medMap) {
		this.medMap = medMap;
	}

	public Map<Angajat, Integer> getAngajatMap() {
		return angajatMap;
	}

	public void setAngajatMap(Map<Angajat, Integer> angajatMap) {
		this.angajatMap = angajatMap;
	}

	public void afiseazaAngajatiSortati() {
		Collections.sort(angajati);
		System.out.print("Angajatii sortati in functie de bonusul salarial sunt: ");

		for (Angajat a : angajati) {
			System.out.println(a.getNume() + " are un bonus salarial de " + a.getBonusSalariu() + " lei.");
		}
	}
}