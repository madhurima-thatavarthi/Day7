package com.pojo;

/**
 * Write a Java program to extract date, time from the date string
 * 
 * @author Kavya Madhurima
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTime2 {
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter date=");
			String str1 = sc.nextLine();
			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str1);
			String str2 = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss").format(date);
			System.out.println("Extracting date and time from the string=" + str2 + "\n");
		} catch (ParseException e) {

			e.printStackTrace();
		}
		sc.close();
	}
	
}

