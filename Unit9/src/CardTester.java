/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card Jason = new Card("3","Diamonds",3);
		Card Praneeth = new Card("3","Diamonds",3);
	Jason.matches(Praneeth);
	
	System.out.println(Jason.matches(Praneeth) + Jason.rank() + Jason.suit() + Jason.pointValue());
	}
}
