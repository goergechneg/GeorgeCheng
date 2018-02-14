//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{


	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{

		if(Character.isUpperCase(theChar))
			return true;
		else
			return false;
	}

	public boolean isLower( )
	{

		if(Character.isLowerCase(theChar))
			return true;
		else
			return false;
	}
	
	public boolean isNumber( )
	{
		if(Character.isDigit(theChar))
			return true;
		else	
			return false;
	}	

	public int getASCII( )
	{
		int ascii = (int) theChar;
		return ascii;
	}

	public String toString()
	{
	if(isLower() == true)
		return ""+getChar() + " is a lowercase number " + "ASCII == " + getASCII() + "\n";	  
	else if(isUpper() == true)
		return ""+getChar() + " is an uppercase number " + "ASCII == " + getASCII() + "\n";	  
	else if(isNumber() == true)		
		return ""+getChar() + " is a number " + "ASCII == " + getASCII() + "\n";
	else
		return "not a char";
	}
}