//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Lab08i
{
	public static void main ( String[] args )
	{
Prime test = new Prime(24);
test.isPrime();
System.out.println(test.toString());

test.setPrime(7);
test.isPrime();
System.out.println(test.toString());

test.setPrime(100);
test.isPrime();
System.out.println(test.toString());
		
test.setPrime(113);
test.isPrime();
System.out.println(test.toString());
		
test.setPrime(65535);
test.isPrime();
System.out.println(test.toString());
		
test.setPrime(2);
test.isPrime();
System.out.println(test.toString());
		
test.setPrime(7334);
test.isPrime();
System.out.println(test.toString());
		
test.setPrime(7919);
test.isPrime();
System.out.println(test.toString());
		
test.setPrime(1115125003);
test.isPrime();
System.out.println(test.toString());
	}	
}