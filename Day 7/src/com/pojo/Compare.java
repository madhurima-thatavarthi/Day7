package com.pojo;

/**
 * .Given a method with two date strings in yyyy-mm-dd format as input.
 *  Write code to find the difference between two dates in months.
 *  
 *  Include a class UserMainCode with a static method getMonthDifference which accepts two 
 *  date strings as input.
 * The return type of the output is an integer which returns the diffenece between two dates in months.
 * 
 * Create a class Main which would get the input and call the static method getMonthDifference
 *  present in the UserMainCode.
 *  
 *  @author Kavya Madhurima
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Compare {
	public static int monthsBetweenDates(String str1, String str2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date day1 = sdf.parse(str1);
		Date day2 = sdf.parse(str2);
		Calendar cal = Calendar.getInstance();

		cal.setTime(day1);
		int months1 = cal.get(Calendar.MONTH);
		int year1 = cal.get(Calendar.YEAR);
		cal.setTime(day2);
		int months2 = cal.get(Calendar.MONTH);
		int year2 = cal.get(Calendar.YEAR);
		int n = ((year2 - year1) * 12) + (months2 - months1);
		return n;
	}

}
