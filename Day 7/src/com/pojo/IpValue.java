package com.pojo;

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

import java.util.StringTokenizer;

public class IpValue {
	public static boolean validateIpAddress(String ipAddress) {
		boolean b1 = false;
		StringTokenizer t = new StringTokenizer(ipAddress, ".");
		int a = Integer.parseInt(t.nextToken());
		int b = Integer.parseInt(t.nextToken());
		int c = Integer.parseInt(t.nextToken());
		int d = Integer.parseInt(t.nextToken());
		if ((a >= 0 && a <= 255) && (b >= 0 && b <= 255) && (c >= 0 && c <= 255) && (d >= 0 && d <= 255))
			b1 = true;
		return b1;
	}
}
