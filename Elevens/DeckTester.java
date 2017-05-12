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
		String[] ranks = {"Jack", "Queen", "King"};
		String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
		int[] values = {11, 12, 13};
		
		Deck d = new Deck(ranks, suits, values);
		
		System.out.println(d.deal());
		
	}
}
