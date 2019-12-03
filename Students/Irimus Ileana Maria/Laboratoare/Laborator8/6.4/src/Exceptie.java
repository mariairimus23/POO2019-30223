
public class Exceptie {

	public static void main(String[] args) {

		try {
			Exception e = new Exception("exceptie");
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Am ajuns la final");
		}
	}
}
