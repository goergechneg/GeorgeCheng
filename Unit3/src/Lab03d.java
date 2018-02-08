//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Distance Praneeth = new Distance(1,1,2,1);
		Praneeth.calcDistance();
		Praneeth.print();
		Distance Jason = new Distance(1,1,-2,2);
		Jason.calcDistance();
		Jason.print();
		Distance Ash = new Distance(1,1,0,0);
		Ash.calcDistance();
		Ash.print();
	}
}