
import java.util.Arrays;

public class Controller {

	public static void main(String[] args) {

		Persoana[] persoane = new Persoana[6];

		persoane[0] = new Persoana("Pop", "Andreea", 14);
		persoane[1] = new Persoana("Stan", "Mihai", 21);
		persoane[2] = new Persoana("Pop", "Amalia", 56);
		persoane[3] = new Persoana("Stanescu", "Mihail", 12);
		persoane[4] = new Persoana("State", "Mircea", 22);
		persoane[5] = new Persoana("Popescu", "Anda", 21);

		Arrays.sort(persoane);

		for (int i = 0; i < persoane.length; i++) {
			System.out.println(persoane[i].toString());
		}
	}
}