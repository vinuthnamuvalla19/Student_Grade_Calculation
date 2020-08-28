package com.mile1.exception;

public class NullMarksArrayException extends Exception 
{
	public NullMarksArrayException()
	{
		super();
	}
	public NullMarksArrayException(String err)
	{
		super(err);
	}
	@Override
	public String toString() 
	{
		return "mark array is null";
	}

}
