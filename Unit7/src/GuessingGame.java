//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	private int number;
	
	private double accuracy;
	
	private int games = 0;
	
	private int tries;
	
	private int totalTries=0;
	
	public GuessingGame(int stop)
	{

upperBound  = stop;

playGame();
	}

	public void playGame()
	{
	number = (int)Math.round(Math.random()*(upperBound-1)+1);
	
	int guess = 0;
	tries = 0;
	while(guess != number)
	{
	System.out.println("Enter a number between 1 and " + upperBound);
	Scanner keyboard = new Scanner(System.in);
	guess = keyboard.nextInt();
	if(guess>upperBound)
	{
		System.out.println("Enter a number within the range");
	}
	tries += 1;
	
	}	
games = 1;
accuracy = (double)((double)games/(double)tries)*100;	
System.out.println(toString());	

	}

	public String toString()
	{
		String output="It took you " + tries + " tries to guess the number, you have guessed correctly " + 
	accuracy + " percent of the time";
		return output;
	}
}