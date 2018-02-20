//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
LetterRemover test = new LetterRemover("I am Sam I am", 'a');		
test.toString();

test.setRemover("ssssssssxssssesssssesss", 's');	
test.toString();


test.setRemover("qwertyqwertyqwerty", 'a');	
test.toString();


test.setRemover("abababababa", 'b');	
test.toString();


test.setRemover("abaababababa", 'x');	
test.toString();
											
	}
}