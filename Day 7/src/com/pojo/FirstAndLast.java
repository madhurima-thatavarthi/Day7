package com.pojo;

/**
 * Write a program to read a string and to test whether first and last character
 * are same. The string is said to be be valid if the 1st and last character are
 * the same. Else the string is said to be invalid.
 * 
 * Include a class UserMainCode with a static method checkCharacters which
 * accepts a string as input .
 * 
 * The return type of this method is an int. Output should be 1 if the first
 * character and last character are same . If they are different then return -1
 * as output.
 * 
 * Create a class Main which would get the input as a string and call the static
 * method checkCharacters present in the UserMainCode.
 * 
 * @author Kavya Madhurima
 *
 */

public class FirstAndLast {
	public static int areCornerEqual(String s) 
    { 
        int n = s.length(); 
        if (n < 2) 
           return -1; 
        if (s.charAt(0) == s.charAt(n-1)) 
           return 1; 
        else
           return 0; 
    } 
}
