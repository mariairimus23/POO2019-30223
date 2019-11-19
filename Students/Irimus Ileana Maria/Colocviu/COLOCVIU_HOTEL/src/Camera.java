
public class Camera {
	private int nrIdentificare;
	protected int capacitate;
	private double pret;
	private double pretSpecial;

	protected Client[] oaspeti = new Client[100];

	public Camera(int nrIdentificare, int capacitate, double pret, double pretSpecial) {
		this.nrIdentificare = nrIdentificare;
		this.capacitate = capacitate;
		this.pret = pret;
		this.pretSpecial = pretSpecial;
	}

	public double calculeazaPret(int numarNopti, String tip_camera) {

		double pretTotal = 0;

		if (tip_camera.equals("SINGLE"))
			if (numarNopti > 1)
				pretTotal = numarNopti * (0.1 * pret);
			else
				pretTotal = numarNopti * pret;

		else if (tip_camera.equals("NORMAL"))
			if (numarNopti > 1)
				pretTotal = numarNopti * (0.1 * pretSpecial);
			else
				pretTotal = numarNopti * pretSpecial;

		return pretTotal;
	}

	public boolean verificaOcupatComplet(int nrOaspeti) {
		if (nrOaspeti == capacitate)
			return true;
		else
			return false;
	}

	public int getNrIdentificare() {
		return nrIdentificare;
	}
}