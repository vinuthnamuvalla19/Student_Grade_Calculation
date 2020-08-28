package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.*;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain 
{
	static	Student s[] = new Student[15];
	static{
		for (int i = 0; i <s.length; i++)  	
			s [i] = new Student ();  	
		s [0] = new Student ("A1", new int [] {72,73,74});
		s [1] = new Student ("B1", new int [] {75,76,77});
		s [2] = new Student ("C1", new int [] {99,99,99});
		s [3] = new Student ("C3", new int [] {100,100,99});
		s [4] = new Student ("B2", new int [] {13,88,13});
		s [5] = new Student ("C3", new int [] {14,14,99});
		s [6] = new Student ("A2", new int [] {77,55,12});
		s [7] = new Student (null, new int [] {13,88,13});
		s [8] = new Student ("A2", null);
		s [9] = null; 
		s [10] = new Student ("S1", new int [] {49,49,49});
		s [11] = new Student ("S2", new int [] {50,50,50});
		s [12] = new Student ("S3", new int [] {0,0,0});
		s [13] = new Student ("S4", new int [] {57,0,60});
		s [14] = new Student ("S5", new int [] {70,50,70});

	
	}
	public static void main (String a []) 	
	{
	 	StudentService studentService = new StudentService ();	
	 	StudentReport studentReport = new StudentReport ();
		System.out.println (" Grades Calculation: ");
		String x = null;
		for (int i = 0; i < s.length; i++) 
		{
			try {
				x = studentReport.validate (s[i]);
			} catch (NullStudentObjectException | NullNameException | NullMarksArrayException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		
			System.out.println("---------------------------------------");
			System.out.println("Student Name  : "+s[i].getName());
			System.out.println("Student Grade : "+x);
		}
	}
}


