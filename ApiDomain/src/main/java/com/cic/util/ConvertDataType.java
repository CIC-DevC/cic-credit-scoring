package com.cic.util;

import java.sql.Timestamp;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDataType {
	public static Integer convertStringToInt(String input) {
		try {
			Integer result = (int) Double.parseDouble(input);
			return result;
		} catch (NumberFormatException e) {
			System.err.println("Unable to convert input string :" + input + " to int");
		}
		return null;
	}
	
	public static Long convertStringToLong(String input) {
		try {
			Long result = (long) Double.parseDouble(input);
			return result;
		} catch (NumberFormatException e) {
			System.err.println("Unable to convert input string :" + input + " to long");
		}
		return null;
	}
	
	public static Double convertStringToDecimal(String input) {
		try {
			Double result = Double.parseDouble(input);
			return result;
		} catch (NumberFormatException e) {
			System.err.println("Unable to convert input string :" + input + " to decimal");
		}
		return null;
	}
	
	public static Timestamp convertStringToTimestamp(String input) {
		try {
			input = input.substring(0,10).concat(" ").concat(input.substring(11, 23));
			Timestamp result = Timestamp.valueOf(input);
			return result;
		} catch (NumberFormatException e) {
			System.err.println("Unable to convert input string :" + input + " to timestamp");
		}
		return null;
	}
	
	public static Timestamp convertStringLongtoTimestamp(String input){
		Long time = (long) Double.parseDouble(input);
	    Date date = new Date(time);
	    Format format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String timeInput = format.format(date);
	    Timestamp result = Timestamp.valueOf(timeInput);
	    return result;
	}

}
