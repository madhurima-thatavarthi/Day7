package com.pojo;

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
import java.util.Collections;

public class MergeAndSort {
	public static ArrayList<Integer> answer(ArrayList<Integer> array1, ArrayList<Integer> array2) {
		array1.addAll(array2);
		Collections.sort(array1);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(array1.get(2));
		ans.add(array1.get(6));
		ans.add(array1.get(8));
		return ans;
	}
}
