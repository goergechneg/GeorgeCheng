//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		 Word Words[] = new Word[size];
		 
		 int i = 0;
		 while(file.hasNext())
		 {
			 Word a = new Word(file.next());
			 Words[i] = a;
			 i++;
			 
		 }
		for(int a = 0; a < size-1; a++)
		{
			int b = a;
			for(int c = a+1; c< Words.length-1; c++)
			{
				if(Words[b].compareTo(Words[c]) < 0)
				{
					b = c;
				}
			}
			
			Word temp = Words[a];
			Words[a] = Words[b];
			Words[b] = temp;
			
			System.out.println(Words[a].toString());	
		}
	

	}
}