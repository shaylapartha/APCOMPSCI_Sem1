/**
 * This is a class that tests the Deck class.
 */
public class DeckTester 
{

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Deck one = new Deck("3", "Hearts", 3);
 		Deck two = new Deck("2", "Spades",3);
  		Deck three = new Deck("3", "Hearts", 3);
  
  		System.out.println("One matches two?" + one.matches(two));
 		System.out.println("One matches three?" + one.matches(three));    
 		System.out.println("Suit of Card One: " + one.suit());
  		System.out.println("Card one: " + one.toString());
	}
}
