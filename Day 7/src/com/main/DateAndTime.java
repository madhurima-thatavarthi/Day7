package com.main;

/**
 * Write a java program to print current date and time in the specified format.
 * 
 * @author Kavya Madhurima
 */
import java.util.Date;
import java.text.SimpleDateFormat;


public class DateAndTime {
	public static void main(String[] args) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date date = new Date();
		System.out.println("Current date and time= "+ simpleDateFormat.format(date));
		
	}
}