/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 414
*/

import java.util.*;

public class Question414
{
	public static int thirdMax(int[] nums) 
	{
        Set<Integer> result = new TreeSet<>();
		for(int num:nums)
			result.add(num);
		System.out.println(result);
		List<Integer> temp = new ArrayList<>();
		temp.addAll(result);
		Collections.reverse(temp);
		System.out.println("Temp : "+temp);
		if(temp.size()>=3)
			return temp.get(2);
		else
			return temp.get(0);
    }
	
	public static void main(String[] args)
	{
		int[] nums = {4,4,5,4,4};
		int result = thirdMax(nums);
		System.out.println(result);
	}
}