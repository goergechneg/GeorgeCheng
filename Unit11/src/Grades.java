//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
		toString();
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);	
		toString();
	}
	
	public void setGrades(String gradeList)
	{

		Scanner reader = new Scanner(gradeList).useDelimiter("\\s");
		int numGrades = 0;
		if(reader.hasNextInt())
		{
			numGrades = reader.nextInt();
		}
		
		grades = new double[numGrades];
		
		reader.next();
		String myReader = reader.nextLine();
		Scanner reader2 = new Scanner(myReader).useDelimiter("\\s");
		for(int i = 0; i < numGrades; i++)
		{

			double GPA = reader2.nextDouble();
			grades[i] = GPA;
			}
		
	}
	
	public void setGrade(int spot, double grade)
	{



	}
	
	public double getSum()
	{
		double sum=0.0;

		for(int i = 0; i < grades.length; i++)
		{
			sum += grades[i];
		}


		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;

		for(int i = 0; i < grades.length; i++)
		{
			if(low>grades[i])
				low = grades[i];
			
		}
		
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		
		for(int i = 0; i < grades.length; i++)
		{
			if(high<grades[i])
				high=grades[i];
		}

		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output=(Arrays.toString(grades));

		return output;
	}	
}