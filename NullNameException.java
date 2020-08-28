package com.mile1.exception;

public class NullNameException extends Exception
{
	public NullNameException()
	{
		super();
	}
	public NullNameException(String err)
	{
		super(err);
	}
	@Override
	public String toString() 
	{
		return "name is null";
	}

}
