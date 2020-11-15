package com.main;

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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

import com.pojo.Compare;

public class CompareMain {
	public static void main(String[] args) throws ParseException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();

		System.out.println(Compare.monthsBetweenDates(str1, str2));

	}
}
