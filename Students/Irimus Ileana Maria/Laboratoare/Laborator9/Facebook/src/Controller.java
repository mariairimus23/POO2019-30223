
public class Controller {

	public static void main(String[] args) {
		
		FacebookAccount account1 = new FacebookAccount("Pop Andreea", 17, "Baia Mare");
		FacebookAccount account2 = new FacebookAccount("Vlad Mihai", 21, "Baia Sprie");
		FacebookAccount account3 = new FacebookAccount("Andrei Paul", 17, "Brasov");
		FacebookAccount account4 = new FacebookAccount("Man Mihaela", 20, "Brasov");
		FacebookAccount account5 = new FacebookAccount("Man Mihai", 19, "Brasov");

		account1.adauga(account2);
		account1.adauga(account3);
		account1.adauga(account4);
		account1.adauga(account5);
		account1.sterge(account4);
		
		System.out.println("Prietenii sunt: ");
		account1.afisare();
		
		System.out.println("Prietenii care se afla in Brasov sunt: ");
		account1.cauta("Brasov");
		
	}
}