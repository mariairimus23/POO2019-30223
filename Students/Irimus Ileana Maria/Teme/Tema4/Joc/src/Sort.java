import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sort {
	public static Comparable returnSmallest(Comparable a, Comparable b) {
		if (a != null && a.compare(b) < 0) 
		{
			return b; 
		} else
			return a; 
	}

	public static ArrayList<Card> sort(ArrayList<Card> elements) {
		ArrayList<Card> newList = new ArrayList<Card>(); 
		Iterator<Card> it1 = elements.iterator();
		Iterator<Card> it2 = elements.iterator();

		Comparable minCard;
		Comparable nextCard;

		while (it1.hasNext()) {
			it1 = elements.iterator(); 
			it2 = elements.iterator();
			minCard = ((Card) it1.next()); 

			while (it2.hasNext()) 
			{
				nextCard = ((Card) it2.next());
				minCard = returnSmallest(minCard, nextCard); 
			}
			newList.add((Card) minCard); 
			elements.remove(minCard); 

			if (elements.size() == 2) {
				it1 = elements.iterator();
				it2 = elements.iterator();
				minCard = ((Card) it1.next());
				it2 = it1;
				nextCard = ((Card) it2.next());

				minCard = returnSmallest(minCard, nextCard);

				newList.add((Card) minCard);
				elements.remove(minCard);

				it1 = elements.iterator();
				minCard = ((Card) it1.next());
				newList.add((Card) minCard);
			}
		}
		return newList;
	}
}