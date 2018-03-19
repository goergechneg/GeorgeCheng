//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18d.dat"));

		int size = file.nextInt();
		ArrayList<String> words = new ArrayList<String>();
			
			while(file.hasNext())
			{
				words.add(file.next());
			}
		if(words.size() == 1)
			System.out.println(words.toString());
		else
		{
			
			for(int i = 0; i < words.size() - 1; i++)
				{
			Word test = new Word(words.get(i));
			Word test2 = new Word(words.get(i+1));
				if(test.compareTo(test2) != -1)
					{
						String s = test.toString();
						words.set(i,words.get(i+1));
						words.set(i+1,s);
					}
				}
	
			}

		for(String word : words)
		{
			System.out.println(word);
		}
	}
}