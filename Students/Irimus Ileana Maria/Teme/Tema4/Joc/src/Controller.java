import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* Nu am folosit interfata OrderedIterator si nici nu am inserat fiecare carte pe pozitia sa finala, 
 dar am inserat toate cartile intr-un ArrayList pe care mai apoi l-am ordonat.
*/

public class Controller
{
	public static void printList(ArrayList<Card> deck)	
	{
		Iterator iterator = deck.iterator();								

		while (iterator.hasNext()) 											
			System.out.println(((Card) iterator.next()).getCardName());		
		System.out.println();
	}
	
	
	public static void main(String[] args)
	{
		ArrayList<Card> deck = new ArrayList<Card>();	
		
		Scanner KeyboardInput1 = new Scanner(System.in);
		System.out.print("Dati numarul de carti: \n ");
		int numberOfCards = KeyboardInput1.nextInt();
		System.out.print("Dati un numar din multimea {2, ..., 10, J, Q, K, A}\n");
		System.out.print("Dati suita/culoarea din multimea {diamonds, clubs, hearts, spades}\n");
		
		
		for (int i = 1; i <= numberOfCards; i++)		
		{
			Scanner KeyboardInput2 = new Scanner(System.in);
			Card card = new Card();
			
			System.out.print("Cartea numarul " + i + ":\n");
			
			System.out.print("Dati numarul cartii: ");
			card.setNumber(KeyboardInput2.nextLine());

			System.out.print("Dati culoarea/suita cartii: ");
			card.setSuit(KeyboardInput2.nextLine());
			
			card.setCardName();		
			deck.add(card);			
		}

		System.out.println("\nPachetul de carti: ");
		printList(deck);
		
		System.out.println("\nPachetul de carti ordonat: ");
		
		ArrayList<Card> orderedDeck = new ArrayList<Card>();
		orderedDeck = Sort.sort(deck);
		printList(orderedDeck);
		
	}
}