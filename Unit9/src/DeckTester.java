/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rank = {"Ace","King","Queen","Jack","Praneeth"};
		String[] suit = {"Diamonds","Clubs","Hearts","Spades"};
		int[] value = {1,2,3,4,5,6,7,8,9,10};
		
		Deck test = new Deck(rank,suit,value);
		
		System.out.println(test.isEmpty());
		System.out.println(test.deal());
		System.out.println(test.toString());
	}
}
