package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentService 
{
	public int findNumberOfNullMarksArray(Student s []) {
	    int c=0;
	    
	    int len = s.length;
	    
	    for(int i=0;i<len;i++)
	    {
	     try
	     {
	     if(s[i].getMarks()==null)
	     {
	            throw new NullMarksArrayException();
	         }
	     }
	     catch(Exception e)
	        {
	        c = c + 1;
	        }
	     
	    }	    
	    return c;
	  }
	  public int findNumberOfNullName(Student s []) 
	  {
	    int c1=0;
	    int len = s.length;
	    for(int i=0;i<len;i++)
	    {
	     try
	     {
	     if(s[i].getName()==null)
	     {
	            throw new NullNameException();
	         }
	     }
	     catch(Exception e)
	        {
	        c1 = c1 + 1;
	        }
	     
	    }
	    return c1;
	  }
	  public int findNumberOfNullObjects(Student s []) {
	   int len = s.length;
	   int c2=0;
	     for(int i=0;i<len;i++)
	     {
	   try
	   {
	   if(s[i]==null)
	   {
	          throw new NullStudentObjectException();
	       
	   }
	    }
	   catch(Exception e)
	      {
	      c2 = c2 + 1;
	      }
	     }
	  return c2;
	}
}
