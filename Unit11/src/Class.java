//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String n, int stuCount)
	{
		name = n;
		studentList = new Student[stuCount];
	
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;
		
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
			for(int i = 0; i<studentList.length; i++)
			{
				classAverage += studentList[i].getAverage();
			}
			
			classAverage /= studentList.length;
		
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		double average = 0;
		for(int i = 0; i<studentList.length; i++)
		{
			if(stuName == studentList[i].getName())
				{
					average = studentList[i].getAverage();
				}
		}

		return average;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";

		for(int i = 0; i < studentList.length; i++)
		{
		if(studentList[i].getAverage() > high)	
		{
			high = studentList[i].getAverage();
			hName = studentList[i].getName();
		}
		}

		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		

		for(int i = 0; i < studentList.length; i++)
		{
		if(studentList[i].getAverage() <low)	
		{
			low = studentList[i].getAverage();
			hName = studentList[i].getName();
		}
		}
		
		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(int i = 0; i < studentList.length; i++)
		{
			if(studentList[i].getAverage() < failingGrade)
				output = output + studentList[i].getName() + " ";
				
		}
		
		
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		
		for(int i = 0; i< studentList.length; i++)
		{
			output = output + String.format(getStudentName(i) + "\'s average = %.2f",getStudentAverage(i)) + "\n";
		}

		output = output + "Failure List = " + getFailureList(70) + "\n"
		+ "Highest Average = " + getStudentWithHighestAverage() + "\n"
		+ "Lowest Average = " + getStudentWithLowestAverage() + "\n"
		+ String.format("Class Average = %.2f",getClassAverage());
		
		
		return output;
	}  	
}