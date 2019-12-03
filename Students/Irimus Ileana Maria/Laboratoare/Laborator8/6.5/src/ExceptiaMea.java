
public class ExceptiaMea extends Exception {

	public ExceptiaMea(String sir) {

		super(sir);
	}

	public void printExceptiaMea(ExceptiaMea e) {
		e.printStackTrace();
	}
}