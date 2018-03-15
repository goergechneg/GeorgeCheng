//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class ClassTester
{
   public static void main( String args[] )
   {
		Class test = new Class("Comp Sci 1",3);
		test.addStudent(0,new Student("Jimmy","4 - 100 90 80 60"));
		test.addStudent(1,new Student("Sandy","4 - 100 100 80 70"));
		test.addStudent(2,new Student("Fred","4 - 50 50 70 68"));				
		out.println(test);
		
						
	}		
}