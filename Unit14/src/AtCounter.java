//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
	   atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
							{'@','@','@','-','@','@','-','@','-','@'},
							{'-','-','-','-','-','-','-','@','@','@'},
							{'-','@','@','@','@','@','-','@','-','@'},
							{'-','@','-','@','-','@','-','@','-','@'},
							{'@','@','@','@','@','@','-','@','@','@'},
							{'-','@','-','@','-','@','-','-','-','@'},
							{'-','@','@','@','-','@','-','-','-','-'},
							{'-','@','-','@','-','@','-','@','@','@'},
							{'-','@','@','@','@','@','-','@','@','@'}};

							toString();
	}

	public int countAts(int r, int c)
	{
		
		if(r >= 0 && c >= 0 && r <= atMat.length-1 && c <= atMat.length-1)
		{
			if(atMat[r][c] == '@')
			{
				atMat[r][c] = 'x';
				atCount +=1;
				countAts(r+1,c);
				countAts(r,c+1);
				countAts(r-1,c);
				countAts(r,c-1);
			}
			return 0;
		}						

		return atCount;
		
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}