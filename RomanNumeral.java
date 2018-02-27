//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -


import static java.lang.System.*;


public class RomanNumeral
{
	
private Integer number;
	private String roman;


	private final static int[] NUMBERS= {1000,900,500,400,100,90,50,40,10,9,5,4,1};


	private final static String[] LETTERS = "L","XL","X","IX","V","IV","I"};


	public RomanNumeral(String str)
	
{


setRoman(str);

	
}

	
public RomanNumeral(Integer orig)

	{


setNumber(orig);



	}

	
public void setNumber(Integer num)

	{


number = num;


	
}

	
public void setRoman(String rom)

	{


roman = rom;

	
}

	
public Integer getNumber()

	{

	  String newRoman = roman;

	  int sum = 0;
	    
for(int i = 0; i < LETTERS.length; i++)
	
      {
	      
 if(roman.startsWith(LETTERS[i]))
	
        {
	  
      sum += NUMBERS[i];

	        newRoman = newRoman.replaceFirst(LETTERS[i],"");

	        }

	          
	        }

		return number;
	
}

	public String toString()

	{
	  
for(int i = 0; i < NUMBERS.length; i++)
	 
   {
	     
 if(NUMBERS[i] < number)
	 
     {
	      
number -=   NUMBERS[i];
	 
     roman =  roman + LETTERS[i];

	   
 }
	
}
		
return roman + "\n";
	
}

}