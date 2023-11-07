/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 349
*/

import java.util.*;

public class Question349
{
	public static int[] intersection(int[] nums1, int[] nums2) 
	{
		List<Integer> set1 = new ArrayList<>();
		for(int i : nums1)
			set1.add(i);
		List<Integer> set2 = new ArrayList<>();
		for(int i : nums2)
			set2.add(i);
		set1.retainAll(set2);
		int[] result = new int[set1.size()];
		int index=0;
		for(int i:set1)
			result[index++] = i;
		return result;
		
    }
	
	public static void main(String[] args)
	{
		int[] num1= {4,9,9,5};
		int[] num2 = {9,4,9,8,4};
		int[] result = intersection(num1,num2);
		System.out.println(Arrays.toString(result));
	}
}