//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{

		count = new ArrayList<Integer> ();
		letters = new ArrayList<Character> ();


	}

	public Histogram(char[] values, String fName)
	{

		count = new ArrayList<Integer> ();
		letters = new ArrayList<Character> ();
		
		for(int i = 0; i < values.length; i++)
		{
			letters.add(values[i]);
		}
		
		fileName = System.getProperty("user.dir") + "\\src\\" + fName;
		
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		
		
		
		
		for(int i = 0; i < letters.size(); i++)
		{
			Scanner fileReader = null;
			
			try
			{
				fileReader = new Scanner(new File(fileName));
			}
			catch(Exception e)
			{
				System.out.println("can't find file");
			}
			
			int sum = 0;
			while(fileReader.hasNext())
			{
				String b = fileReader.next();
				for(int a = 0; a < b.length(); a++)
				{
					if(b.charAt(a) == letters.get(i))
					{
						sum +=1;
					}
				}
			}
			count.add(i,sum);
		}


	}
	
	public char mostFrequent()
	{
	int max = 0;
	int index = 0;
		for(int i = 0; i < count.size(); i ++)
		{
			if(count.get(i)>max)
				{
				max = count.get(i);
				index = i;
				}
			
		}
	
		return letters.get(index);
	}

	public int max()
	{
		int max = 0;
			for(int i = 0; i < count.size(); i ++)
			{
				if(count.get(i)>max)
					{
					max = count.get(i);
					
					}
				
			}
		
			return max;
	}
	public char leastFrequent()
	{
		int min = max();
		int index = 0;
			for(int i = 0; i < count.size(); i ++)
			{
				if(count.get(i)<min)
					{
					min = count.get(i);
					index = i;
					}
				
			}
		
			return letters.get(index);

			}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}