//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		 Word18e Word18es[] = new Word18e[size];
		 
		 int i = 0;
		 while(file.hasNext())
		 {
			 Word18e a = new Word18e(file.next());
			 Word18es[i] = a;
			 i++;
			 
		 }
		for(int a = 0; a < size-1; a++)
		{
			int b = a;
			for(int c = a+1; c< Word18es.length-1; c++)
			{
				if(Word18es[b].compareTo(Word18es[c]) < 0)
				{
					b = c;
				}
			}
			
			Word18e temp = Word18es[a];
			Word18es[a] = Word18es[b];
			Word18es[b] = temp;
			
			System.out.println(Word18es[a].toString());	
		}
	


	}
}