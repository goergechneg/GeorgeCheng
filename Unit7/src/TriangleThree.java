//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let,count);
		toString();
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		int spaces = size - 1;
		int letters = 1;
		for(int i = 0; i<size; i++)
		{
			for(int a=0; a<spaces; a++)
			{
				output = output + " ";
				
			}
			for(int b = 0; b<letters;b++)
				{
				output = output + getLetter();
				}
			spaces--;
			letters++;
			output = output + "\n";
	}
		return output+"\n";
	}
}