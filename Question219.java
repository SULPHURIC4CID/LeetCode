/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 219


*/
import java.util.*;

public class Question219
{
	public static boolean containsNearbyDuplicate(int[] nums, int k) 
	{
        if (k>=nums.length)
		{
			HashSet<Integer> set  = new HashSet<>();
			for(int i:nums)
				set.add(i);
			if(set.size()<nums.length)
				return true;
		}
		else
		{
			LinkedHashSet<Integer> set = new LinkedHashSet<>();
			int start = nums[0];
			for(int i = 0;i<k+1;i++)
			{
				set.add(nums[i]);
			}
			if(set.size()<k+1)
				return true;
			for(int i = k+1;i<nums.length;i++)
			{
				//remove first element
				set.remove(start);
				for(int number:set)
				{
					start = number;
					break;
				}
				set.add(nums[i]);
				if(set.size()<k+1)
					return true;
			}
		}
		return false;
    }
	
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,1};
		int k = 2;
		boolean result = containsNearbyDuplicate(nums,k);
		System.out.println(result);
	}
}