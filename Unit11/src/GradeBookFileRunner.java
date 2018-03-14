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

		String className = file.nextLine();
		String sizeString = file.nextLine();
		Scanner string = new Scanner(sizeString);
		int size = string.nextInt();
		Class class1 = new Class(className);
		while (file.hasNextLine()) {
			String name = file.nextLine();
			String grades = file.nextLine();
			class1.addStudent(new Student(name, grades));
		}
		System.out.println("");
		out.println(class1);
		System.out.println("Faliure list : " + class1.getFailureList(70));
		System.out.println("Highest Average : " + class1.getStudentWithHighestAverage());
		System.out.println("Lowest Average : " + class1.getStudentWithLowestAverage());
		System.out.println("Class Average : " + class1.getClassAverage());

	}		
}