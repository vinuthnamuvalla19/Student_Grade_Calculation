package com.mile1.exception;

public class NullStudentObjectException extends Exception 
{
	public NullStudentObjectException()
	{
		super();
	}
	public NullStudentObjectException(String err)
	{
		super(err);
	}
	@Override
	public String toString() 
	{
		return "object is null";
	}
}
