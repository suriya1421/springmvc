package com.chainsys.jspproject.commonutil;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	
public static void checkStringForParseInt(String data) throws InvalidInputDataException{
		boolean result=false;
		String pattern="^[0-9]+$";
		Pattern patt=Pattern.compile(pattern);
		Matcher match = patt.matcher(data);
		result=match.matches();
		if(!result) throw new InvalidInputDataException("please enter Integer");
	}
	public static void CheckNumberForGreaterThanZero(int data) throws InvalidInputDataException {
		if(data<0) {
			throw new InvalidInputDataException("please enter number greater than zero");
		}
	
	}
	public static void checklengthOfString(String data) throws InvalidInputDataException{
		
		int len=data.length();
		if(len<15 && len>3) ;
		else throw new InvalidInputDataException("length does meet required length");
		
	}
	
	public static void checkStringOnly(String data) throws InvalidInputDataException {
		boolean result=false;
		String pattern="^[a-zA-Z]+(\\s[a-zA-Z]+)?$";
		Pattern patt=Pattern.compile(pattern);
		Matcher match = patt.matcher(data);
		result=match.matches();
		if(!result) throw new InvalidInputDataException("please enter character only");
	}
	
	
	public static void CheckNumberForGreaterThanZero(float data) throws InvalidInputDataException {
		if(data<0) 
			throw new InvalidInputDataException("please enter value greater than zero");
		
	}
	public static void checkEmail(String data) throws InvalidInputDataException{
		boolean result=false;
	    String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
	        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	    Pattern patt=Pattern.compile(regexPattern);
		Matcher match = patt.matcher(data);
		result=match.matches();
	    if(!result) throw new InvalidInputDataException("your email does not meet required length or complex");
	}
	public static void checkJobId(String data) throws InvalidInputDataException{
		boolean result=false;
		String pattern="^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
		Pattern patt=Pattern.compile(pattern);
		Matcher match = patt.matcher(data);
		result=match.matches();
		if(!result) throw new InvalidInputDataException("wrong pattern for job id");
	}
	public static boolean checkStringForParsefloat(float fees) {
		boolean result=false;
		if(fees>0) {
			return true;
		}
	return result;
		
	}
	 public static void checkDate(String data) throws InvalidInputDataException{
         boolean bool = false;
         String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(data);
          bool = matcher.matches();
          if(!bool) {
              throw new InvalidInputDataException("Date is not valid");
          }
	 }
		public static boolean checkStringForGreaterThanZero1(float fees) throws InvalidInputDataException{
	        boolean result = false;
	        
	        if(fees >0){
	            return true;
	        }
	        //if data is invalid throw new InvalidInputDataException("The  value must be greater than zero"); 
	        return result;
	        
	    }
		
		
	}