//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{


	}

	public StringChecker(String s)
	{

setString(s);
	}

   public void setString(String s)
   {
   	word=s;
   }

	public boolean findLetter(char c)
	{
		int index = word.indexOf(c);
		if(index >= 0)
		{
			return true;
		}
		else
		{
		return false;
	}
	}	

	public boolean findSubString(String s)
	{
		if(word.contains(s))
				{
			return true;
				}

		else
		{
		return false;
		}
		}

 	public String toString()
 	{
 		return "\n\n";
	}
}