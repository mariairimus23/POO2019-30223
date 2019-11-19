
public class Hotel {

	private int nrDeAngajati;
	private int nrDeClienti;

	private Angajat[] angajati = new Angajat[100];
	private Client[] clienti = new Client[100];
	private Camera[] camere = new Camera[100];

	public Hotel() {
		this.nrDeAngajati = 0;
		this.nrDeClienti = 0;
	}

	public void adaugaAngajati(Angajat angajat) {
		angajati[nrDeAngajati] = angajat;
		nrDeAngajati++;
	}

	public void adaugaClienti(Client client) {
		clienti[nrDeClienti] = client;
		nrDeClienti++;
	}

	public void listClientiSortati() {
		for (int i = 0; i < nrDeClienti; i++) {
			System.out.println(clienti[i].getNume());
		}
	}

	public void listAngajatiSortati() {
		for (int i = 0; i < nrDeAngajati; i++) {
			System.out.println(angajati[i].getNume());
		}
	}

	public void listCamereLibere(int nrDeCamere, String perioada) {

		for (int i = 0; i < nrDeCamere; i++) {
			if (camere[i].capacitate == 0)
				System.out.println(camere[i].getNrIdentificare());
		}
	}

	public void arataStatistici1(int nrDeCamere) {

		int nrCamereLibere = 0;
		int nrCamereOcupate = 0;
		for (int i = 0; i < nrDeCamere; i++) {
			if (camere[i].capacitate == 0)
				nrCamereLibere++;
			else
				nrCamereOcupate++;
			System.out.println("camere libere: " + nrCamereLibere + ", camere ocupate: " + nrCamereOcupate);
		}
	}
}