/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if(statement.indexOf("Dog") >= 0 || statement.indexOf("Cat") >= 0)
		{
			response = "Tell me about your pets";
		}
		else if(statement.indexOf("Mr.Mauro") >=0)
		{
			response = "I love mr mauro haha!!!";
		}
		else if(statement.indexOf("George") >= 0)
			response = "omg i love george haha me too";
		else if(statement.indexOf("Miguel") >= 0)
			response = "miguel smells of elderberries";
		else if(statement.indexOf("Kevin Li") >= 0)
			response = "To be fair, you have to have a very high IQ to understand Kevin Li. "
					+ "His intellect is extremely subtle, "
					+ "and without a solid grasp of kantian metaphysics "
					+ "most of the jokes will go over a typical listener’s head. "
					+ "There’s also Kevin’s nihilistic outlook, "
					+ "which is deftly woven into his debate- "
					+ "his personal philosophy draws heavily from Lacanian literature, for instance. "
					+ "The LD debaters understand this stuff; "
					+ "they have the intellectual capacity to "
					+ "truly appreciate the depths of these jokes, "
					+ "to realise that they’re not just funny- "
					+ "they say something deep about LIFE. "
					+ "As a consequence people who dislike Kevin Li truly ARE idiots- "
					+ "of course they wouldn’t appreciate, for instance, "
					+ "the humour in Kevin’s existential catchphrase "
					+ "“I have so much bloodlust right now,” "
					+ "which itself is a cryptic reference to Oda's One Piece. "
					+ "I’m smirking right now just imagining one of those addlepated simpletons "
					+ "scratching their heads in confusion as kevin li’s genius "
					+ "wit unfolds itself on the debate floor. "
					+ "What fools.. how I pity them. 😂 And yes, by the way, "
					+ "i DO have a Kevin tattoo. And no, you cannot see it. "
					+ "It’s for the ladies’ eyes only- "
					+ "and even then they have to demonstrate that they’re within 5 IQ points of my own "
					+ "(preferably lower) beforehand. Nothin personnel kid 😎";
		
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
}
