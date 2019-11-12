
public class TestGhiozdan {

	public static void main(String[] args) {

		Ghiozdan ghiozdan = new Ghiozdan();

		Caiet caiet1 = new Caiet("POO");
		Caiet caiet2 = new Caiet("AF");

		Manual manual1 = new Manual("POO");
		Manual manual2 = new Manual("AF");

		ghiozdan.add(caiet1);
		ghiozdan.add(caiet2);
		ghiozdan.add(manual1);
		ghiozdan.add(manual2);

		System.out.println("nr total rechizite = " + ghiozdan.getNrRechizite());
		System.out.println("nr caiete = " + ghiozdan.getNrCaiete());
		System.out.println("nr manuale = " + ghiozdan.getNrManuale());

		System.out.println("toate rechizitele:");
		ghiozdan.listItems();

		System.out.println("rechizite de tip caiet:");
		ghiozdan.listCaiet();

		System.out.println("rechizite de tip manual:");
		ghiozdan.listManual();
	}
}