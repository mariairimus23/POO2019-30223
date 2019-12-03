
public class Controller {

	public static void main(String[] args) {

		Lucrator l = new Lucrator("Gigel");
		try {
			l.lucreaza("Luni");
			l.lucreaza("Marte");
			l.lucreaza("Duminica");
		} catch (ExceptieZiNelucratoare e) {
			e.printStackTrace();
		}
	}
}