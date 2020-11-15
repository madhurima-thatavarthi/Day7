package com.main;

/**
 * Include a class UserMainCode with a static method “getNumberOfDays”
 *  that accepts 2 integers as arguments and returns an integer.
 *   The first argument corresponds to the year and the second argument corresponds to the month code. 
 *   The method returns an integer corresponding to the number of days in the month.
 *   
 *  Create a class Main which would get 2 integers as input 
 *  and call the static method getNumberOfDays present in the UserMainCode.
 *  
 *  @author Kavya Madhurima
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DaysMain {
	public static int getNumberOfDays(int year, int month) {
		GregorianCalendar gc = new GregorianCalendar(year, month, 1);
		int days = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
		return days;
	}
}
