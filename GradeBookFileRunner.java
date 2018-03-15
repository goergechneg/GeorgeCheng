//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		String fileName = System.getProperty("user.dir") + "\\src\\" + "gradebook.dat";
		Scanner file = new Scanner(new File(fileName));

		String Name = file.nextLine();
		int classSize = Integer.parseInt(file.nextLine());
		Class test = new Class(Name,classSize);
		
		int iter = 0;
		while (file.hasNextLine())
		{
			String sName = file.nextLine();
			String sGrades = file.nextLine();
			test.addStudent(iter,new Student(sName,sGrades));
			iter++;
		}
		System.out.print(test);			

	}		
}