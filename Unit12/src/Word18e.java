//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word18e implements Comparable<Word18e>
{
	private String word;

	public Word18e( String s)
	{
		word = s;

	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		
		for(int i = 0; i < vowels.length(); i++)
		{
			for(int k = 0; k < word.length(); k++)
			{
				if(word.charAt(k) == vowels.charAt(i))
					vowelCount += 1;
			}
			
		}

		return vowelCount;
	}

	public int compareTo(Word18e rhs)
	{
		if(numVowels() < rhs.numVowels())
			return 1;
		else if(numVowels() > rhs.numVowels())
			return -1;
		else if(numVowels() == rhs.numVowels())
		{
			if(rhs.toString().compareTo(word.toString()) < 0)
				return -1;
			else if(rhs.toString().compareTo(word.toString()) >0)
				return 1;
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}