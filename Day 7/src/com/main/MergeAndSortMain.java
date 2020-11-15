package com.main;

/**
 * Write a code to read two int array lists of size 5 each as input and to merge the two arrayLists, 
 * sort the merged arraylist in ascending order and fetch the elements at
 *  2nd, 6th and 8th index into a new arrayList and return the final ArrayList.
 *  
 *  Include a class UserMainCode with a static method sortMergedArrayList which accepts 2 ArrayLists.
 *  The return type is an ArrayList with elements from 2,6 and 8th index position .
 *  Array index starts from position 0.
 *  
 *  Create a Main class which gets two array list of size 5 as input and 
 *  call the static method sortMergedArrayList present in the UserMainCode.
 *  
 *  @author Kavya Madhurima

 */

import java.util.ArrayList;
import java.util.Scanner;

import com.pojo.MergeAndSort;

public class MergeAndSortMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
			array1.add(sc.nextInt());
		for (int j = 0; j < 5; j++)
			array2.add(sc.nextInt());
		ans = MergeAndSort.answer(array1, array2);

		for (int k = 0; k < 3; k++)
			System.out.println(ans.get(k));

		sc.close();
	}

}
