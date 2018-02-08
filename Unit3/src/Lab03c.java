//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
 		Quadratic test = new Quadratic(5,-8,3);	
 		test.setEquation(5,-8, 3);
 		test.calcRoots();
 		test.print();
 		Quadratic Jason = new Quadratic(3,2,-7);
 		Jason.setEquation(3,2,-7);
 		Jason.calcRoots();
 		Jason.print();
 		Quadratic Praneeth = new Quadratic(9,6,1);
 		Jason.setEquation(9,6,1);
 		Jason.calcRoots();
 		Jason.print();
 		
   }
}