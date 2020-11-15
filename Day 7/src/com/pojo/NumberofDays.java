package com.pojo;

/**
 * Given two inputs year and month (Month is coded as: Jan=0, Feb=1 ,Mar=2 ...), 
 * write a program to find out total number of days in the given month for the given year.
 * 
 * @author Kavya Madhurima
 */


import java.util.Scanner;

public class NumberofDays {
	public void display() {
		Scanner sc = new Scanner(System.in);

		int days = 0;
		String month = " ";

		System.out.print("Enter the month number: ");
		int monthNumber = sc.nextInt();

		System.out.print("enter the year: ");
		int year = sc.nextInt();

		switch (monthNumber) {
		case 1:
			month = "January";
			days = 31;
			break;
		case 2:
			month = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		case 3:
			month = "March";
			days = 31;
			break;
		case 4:
			month = "April";
			days = 30;
			break;
		case 5:
			month = "May";
			days = 31;
			break;
		case 6:
			month = "June";
			days = 30;
			break;
		case 7:
			month = "July";
			days = 31;
			break;
		case 8:
			month = "August";
			days = 31;
			break;
		case 9:
			month = "September";
			days = 30;
			break;
		case 10:
			month = "October";
			days = 31;
			break;
		case 11:
			month = "November";
			days = 30;
			break;
		case 12:
			month = "December";
			days = 31;
		}
		System.out.print(month + " " + year + " has " + days + " days\n");

		sc.close();
	}
}
