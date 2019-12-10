import java.util.ArrayList;

public class FacebookAccount {

	private String nume;
	private int varsta;
	private String locatiaCurenta;
	private ArrayList<FacebookAccount> prieteni = new ArrayList<FacebookAccount>();

	public FacebookAccount(String nume, int varsta, String locatiaCurenta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.locatiaCurenta = locatiaCurenta;
	}

	public String getLocatiaCurenta() {
		return this.locatiaCurenta;
	}

	void adauga(FacebookAccount account) {
		prieteni.add(account);
	}

	void sterge(FacebookAccount account) {
		prieteni.remove(account);
	}

	void afisare() {
		for (FacebookAccount i : prieteni) {
			System.out.println(i);
		}
	}
	
	ArrayList<FacebookAccount> prietenii = new ArrayList<FacebookAccount>();
	
	public void cauta(String locatie) {
		for (FacebookAccount i : prieteni) {
			if (i.getLocatiaCurenta().equals(locatie))
				prietenii.add(i);
		}
		afisarePrieteniLocatie();
	}
	
	void afisarePrieteniLocatie() {
		for (FacebookAccount i : prietenii) {
			System.out.println(i.nume);
		}
	}
	
	public String toString() {
		
		return this.nume + " in varsta de " + this.varsta + " ani, se afla in " + this.locatiaCurenta; 
	}
}