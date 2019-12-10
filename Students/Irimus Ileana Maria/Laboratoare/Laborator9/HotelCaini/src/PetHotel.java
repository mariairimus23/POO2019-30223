import java.util.ArrayList;

public class PetHotel {

	private ArrayList<Pet> caini = new ArrayList<Pet>();

	void adauga(Pet caine) {
		caini.add(caine);
	}

	void sterge(Pet caine) {
		caini.remove(caine);
	}

	void afiseaza() {
		for (Pet i : caini) {
			System.out.println(i);
		}
	}
}