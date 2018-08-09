package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks 
{
static String check(int[] stuGrades)   //	CHANGED TO STATIC
	{
		int len=stuGrades.length;
		try
		{
			for(int i=0;i<len;i++)
			{
				if(stuGrades[i]>100||stuGrades[i]<0)
				{
					throw new Exception("grades outside range");
				}
			}
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
		return ("grades within range");
	}
	public static void main(String[] args)
	{
		int numOfStudents;
		Scanner sc=new Scanner(System.in);  
		System.out.println("enter number of students");
		numOfStudents=sc.nextInt();
		int[] stuGrades=new int[numOfStudents];
		for(int i=0;i<numOfStudents;i++)
		{
			System.out.println("enter grades");
			stuGrades[i]=sc.nextInt();
		}
		System.out.println(check(stuGrades));
	}
}