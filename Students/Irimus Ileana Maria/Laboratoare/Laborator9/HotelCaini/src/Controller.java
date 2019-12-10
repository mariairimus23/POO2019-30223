
public class Controller {

	public static void main(String[] args) {

		Pet caine1 = new Pet("Tomita", "pug", 12, "maro");
		Pet caine2 = new Pet("Max", "bulldog", 25, "negru");
		Pet caine3 = new Pet("Bella", "bichon", 7, "alb");
		Pet caine4 = new Pet("Tucker", "buhund norvegian", 10, "bej");

		PetHotel hotel = new PetHotel();

		hotel.adauga(caine1);
		hotel.adauga(caine2);
		hotel.adauga(caine3);
		hotel.adauga(caine4);
		hotel.sterge(caine2);
		hotel.sterge(caine1);
		hotel.afiseaza();

		System.out.println(" 			----- ");

		hotel.adauga(caine2);
		hotel.afiseaza();
	}
}