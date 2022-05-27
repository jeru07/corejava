package com.chainsys.miniproject.commonutil;

import com.chainsys.miniproject.commonutil.Validator;
public class InvalidInputDataException extends Exception
{ 
    public InvalidInputDataException()
    {
    	super("The Input Data is not valid ");
    }
    public InvalidInputDataException(String message) {
    	super(message);
    }
}



