
public class Client extends Persoana {

	private int nrCamera;
	private String dataIn;
	private String dataOut;

	public Client(int nrCamera, String dataIn, String dataOut) {
		super();
		this.nrCamera = nrCamera;
		this.dataIn = dataIn;
		this.dataOut = dataOut;
	}

	public int nrCamera() {
		return nrCamera;
	}

	public String getDataIn() {
		return dataIn;
	}

	public String getDataOut() {
		return dataOut;
	}

	@Override
	public String toString() {
		return "nr camera client: " + nrCamera + ", data check-in: " + dataIn + ", data check-out: " + dataOut;
	}
}