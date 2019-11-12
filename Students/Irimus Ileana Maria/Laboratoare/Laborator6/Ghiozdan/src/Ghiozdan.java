
public class Ghiozdan{

	public Rechizita[] lista = new Rechizita[100];

	private int nrDeRechizite;
	
	public Ghiozdan() {
		this.nrDeRechizite = 0;
	}

	public void add(Caiet caiet) {
		lista[nrDeRechizite] = caiet;
		nrDeRechizite++;
	}

	public void add(Manual manual) {
		lista[nrDeRechizite] = manual;
		nrDeRechizite++;
	}

	public void listItems() {
		for (int i = 0; i < nrDeRechizite; i++) {
			System.out.println(lista[i].getNume());
		}
	}

	public void listManual() {
		for (int i = 0; i < nrDeRechizite; i++) {
			if (lista[i] instanceof Manual)
				System.out.println(lista[i].getNume());
		}
	}

	public void listCaiet() {
		for (int i = 0; i < nrDeRechizite; i++) {
			if (lista[i] instanceof Caiet)
				System.out.println(lista[i].getNume());
		}
	}

	public int getNrRechizite() {
		return nrDeRechizite;
	}

	public int getNrManuale() {
		int nrDeManuale = 0;

		for (int i = 0; i < nrDeRechizite; i++) {
			if (lista[i] instanceof Manual)
				nrDeManuale++;
		}
		return nrDeManuale;
	}

	public int getNrCaiete() {
		int nrDeCaiete = 0;

		for (int i = 0; i < nrDeRechizite; i++) {
			if (lista[i] instanceof Caiet)
				nrDeCaiete++;
		}
		return nrDeCaiete;
	}
}