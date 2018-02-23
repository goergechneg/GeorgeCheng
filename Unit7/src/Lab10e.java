//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		
	while(1 != 2)
	{
		System.out.println("\n" + "How many numbers?");
		Scanner keyboard = new Scanner(System.in);
		if(keyboard.hasNextInt())
		{
		GuessingGame test = new GuessingGame(keyboard.nextInt());	   
		}
		else
		{
		System.out.println("Enter a number");
		}


	}

	}
}