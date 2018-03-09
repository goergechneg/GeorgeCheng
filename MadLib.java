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

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
verbs = new ArrayList<String> ();
nouns = new ArrayList<String> ();
adjectives = new ArrayList<String> ();

	}

	public MadLib(String fileName)
	{
		this();
		loadVerbs();
		loadNouns();
		loadAdjectives();
		
		try{
			Scanner file = new Scanner(new File(fileName));
				while(file.hasNext())
				{
					String test = file.next();
					
					if(test.equals("#"))
							{
						out.print(getRandomNoun() + " ");
							}
					else if(test.equals("@"))
					{
						out.print(getRandomVerb()+" ");
					}
					else if(test.equals("&"))
					{
						out.print(getRandomAdjective()+" ");
					}
					else
						System.out.print(test + " ");
				}
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
		
		Scanner fileNouns = new Scanner(new File("C:\\Users\\chengg9102\\Desktop\\nouns.dat"));
			while(fileNouns.hasNext())
			{
				nouns.add(fileNouns.next());
			}
		
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
	
	Scanner fileVerbs = new Scanner(new File("C:\\Users\\chengg9102\\Desktop\\verbs.dat"));
	while(fileVerbs.hasNext())
	{
		verbs.add(fileVerbs.next());
	}
	
	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
	
	Scanner fileAdj = new Scanner ( new File ("C:\\Users\\chengg9102\\Desktop\\Adjectives.dat"));
	while(fileAdj.hasNext())
	{
		adjectives.add(fileAdj.next());
	}
	
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
	
		int num = (int)(Math.random() * (verbs.size()-1));
		String s = verbs.get(num);
		return s;
	}
	
	public String getRandomNoun()
	{

		int num = (int)(Math.random() * (nouns.size()-1));
		String s = nouns.get(num);
		return s;
	}
	
	public String getRandomAdjective()
	{

		int num = (int)(Math.random() * (adjectives.size()-1));
		String s = adjectives.get(num);
		return s;
		
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}