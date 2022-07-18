package com.chainsys.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static boolean checkNumberForParseInt(String data) throws InvalidInputDataException{
        boolean result = false;
        int len = data.length();
        for (int index = 0; index < len; index++) {
        int asc = (int) data.charAt(index);
        if (asc > 47 && asc < 58)
        result = true;
        else
        throw new InvalidInputDataException("Please enter the Integer");
        }

// if data is invalid throw new InvalidInputDataException ("The value in String
        // must contain only numbers")
        return result;
    }

    	public static boolean CheckNumberForGreaterThanZero(int data) throws InvalidInputDataException {
    		if (data < 0) {
    			throw new InvalidInputDataException(" number must be greater than zero");
    		}
			return false;
    	

    	}

    	

    	public static void checkStringOnly(String data) throws InvalidInputDataException {
    		boolean result = false;
    		String pattern = "^[a-zA-Z]+(\\\\s[a-zA-Z]+)?$";
    		Pattern patt = Pattern.compile(pattern);
    		Matcher match = patt.matcher(data);
    		result = match.matches();
    		if (!result)
    			throw new InvalidInputDataException("please enter character only");
    	}

    	public static void CheckNumberForGreaterThanZero(float data) throws InvalidInputDataException {
    		if (data < 0)
    			throw new InvalidInputDataException("please enter value greater than zero");

    	}

    }
    