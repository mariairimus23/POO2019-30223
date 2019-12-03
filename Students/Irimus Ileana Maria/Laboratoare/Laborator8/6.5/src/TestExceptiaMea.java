
public class TestExceptiaMea {

	public static void main(String[] args) {

		ExceptiaMea e = new ExceptiaMea("exceptia mea");

		try {
			e.printExceptiaMea(e);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}