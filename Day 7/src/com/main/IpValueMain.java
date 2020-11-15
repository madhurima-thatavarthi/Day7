package com.main;

/**
 * Write a program to read a string and validate the IP address. 
 * Print “Valid” if the IP address is valid, else print “Invalid”.
 * 
 * Include a class UserMainCode with a static method ipValidator which accepts a string. 
 * The return type (integer) should return 1 if it is a valid IP address else return 2.
 * 
 * Create a Class Main which would be used to accept Input String and call the static method 
 * present in UserMainCode.
 * 
 * @author Kavya Madhurima
 */

import java.util.Scanner;

import com.pojo.IpValue;

public class IpValueMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ip adress=");
		String ipAddress = sc.nextLine();
		boolean b = IpValue.validateIpAddress(ipAddress);
		if (b == true)
			System.out.println("Valid");
		else
			System.out.println("Invalid");

		sc.close();
	}
}