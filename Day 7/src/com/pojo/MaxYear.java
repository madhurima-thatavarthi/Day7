package com.pojo;

import java.util.Calendar;

/**
 * .Write a Java program to get the maximum value of the year, month, week, date
 * from the current date of a default calendar
 * 
 * @author Kavya Madhurima
 *
 */

public class MaxYear {
	public void display() {
		
	Calendar calendar = Calendar.getInstance();
	System.out.println("\nCurrent Date and Time:" + calendar.getTime());		
	int actualMaxYear = calendar.getActualMaximum(Calendar.YEAR);
	int actualMaxMonth = calendar.getActualMaximum(Calendar.MONTH);
	int actualMaxWeek = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
	int actualMaxDate = calendar.getActualMaximum(Calendar.DATE);
	
	System.out.println("Actual Maximum Year: "+actualMaxYear);
	System.out.println("Actual Maximum Month: "+actualMaxMonth);
	System.out.println("Actual Maximum Week of Year: "+actualMaxWeek);
	System.out.println("Actual Maximum Date: "+actualMaxDate+"\n");
	System.out.println();
	}
}
