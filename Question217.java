/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 217

*/
/*

TestCases-


*/

import java.util.*;

public class Question217
{
	public static boolean containsDuplicate(int[] nums) 
	{
		HashSet set = new HashSet();
		for(int val : nums)
		{
			if(!set.add(val))
				return true;
		}
		return false;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] arr = {1,2,3,4,5,5};
		System.out.println(containsDuplicate(arr));		
	}		
}
