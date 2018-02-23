//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
		toString();

	}

	public void setNum(int num)
	{

number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		int big =0;	
			if(a>b&&a>c)
				big = a;
			else if(b>a&&b>c)
				big = b;
			else if(c>a&&c>b)
				big =c;
		for(int i = 1; i<big; i++)
			if(a%i == 0 && b%i == 0 && c%i == 0)
				max = i;
		
		return max;
	}

	public String toString()
	{
		int a;
		int b;
		int c;
		String output = "";
		for(int i = 1; i <= number; i++)
		{
			a=i;
				for(int z = 1; z <= number; z++)
					{
						b = z;
					
					for(int l = 1; l <= number; l++)
						{
							c=l;
						
								if(greatestCommonFactor(a,b,c) == 1)
									{
										if((a%2 == 0 && b%2 == 1)||(a%2 == 1 && b%2 == 0)&& c%2 == 1)	
											{
												if((a*a) + (b*b) == (c*c))
													{
													output= output + "\n" + a + " " + b + " " + c + " ";
													}
											}
									}
							
						}
					}
		}
		






		return output+"\n";
	}
}