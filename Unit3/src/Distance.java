//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private double xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{



	}

	public Distance(double x1, double y1, double x2, double y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;

	}



	public void calcDistance()
	{
		distance = Math.sqrt((xTwo -xOne)*(xTwo-xOne) + (yTwo-yOne)*(yTwo-yOne));
	}

	public void print( )
	{

		System.out.println(distance);

	}
}