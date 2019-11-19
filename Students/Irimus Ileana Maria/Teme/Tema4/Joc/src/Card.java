
public class Card implements Comparable
{
	String number = new String();
	String suit = new String();
	String cardName = new String();

	public void setNumber(String number)
	{
		this.number = number;
	}

	public void setSuit(String suit)
	{
		this.suit = suit;
	}

	public void setCardName()
	{
		this.cardName = this.number + " of " + this.suit;
	}

	public String getNumber()
	{
		return number;
	}

	public String getSuit()
	{
		return suit;
	}

	public String getCardName()
	{
		return cardName;
	}

	@Override
	public int compare(Comparable comparable)
	{
		if (comparable == null)	
		{
			return 0;
		}
		if (comparable instanceof Card) 
		{
			Card cardToCompareTo = ((Card) comparable); 	
																

			if (this.cardName == null || cardToCompareTo.getCardName() == null)
																				
			{
				if (cardToCompareTo.getCardName() == null)
				{
					return 0;
				}
				else
				{
					return -1;
				}
			}
			
			if (this.cardName.startsWith("A") && (cardToCompareTo.getCardName().startsWith("J") || cardToCompareTo.getCardName().startsWith("Q") || cardToCompareTo.getCardName().startsWith("K")))
			{
					return -1;
			}
			
			if (this.cardName.startsWith("J") && (cardToCompareTo.getCardName().startsWith("Q") || cardToCompareTo.getCardName().startsWith("K") || cardToCompareTo.getCardName().startsWith("A")))
			{
					return 1;
			}
			
			if (this.cardName.startsWith("Q"))
			{
				if (cardToCompareTo.getCardName().startsWith("K") || cardToCompareTo.getCardName().startsWith("A"))
				{
					return 1;
				}
				if (cardToCompareTo.getCardName().startsWith("J"))
				{
					return -1;
				}	
			}
			
			if (this.cardName.startsWith("K"))
			{
				if (cardToCompareTo.getCardName().startsWith("J") || cardToCompareTo.getCardName().startsWith("Q"))
				{
					return -1;
				}
				if (cardToCompareTo.getCardName().startsWith("A"))
				{
					return 1;
				}	
			}
			return 0 - this.cardName.compareTo(cardToCompareTo.getCardName());
		}
		return 0;
	}

}