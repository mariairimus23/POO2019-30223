
public class Caiet extends Rechizita {

	public Caiet(String eticheta) {
		this.eticheta = eticheta;
	}

	public String getNume() {
		return "Caiet de " + this.eticheta;
	}
}