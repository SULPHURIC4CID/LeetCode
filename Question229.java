/*

Author: Ananthanarayanan R
Section: Algorithms
Question : 229


*/

import java.util.*;

public class Question229
{
	public static List<Integer> majorityElement(int[] nums) 
	{
		Map<Integer,Integer> map = new HashMap<>();
		Integer oldVal;
		
		for(int num:nums)
			if((oldVal= map.put(num,1)) !=null)
				map.put(num,oldVal+1);
		
		List<Integer> result = new ArrayList<>();
		int count = 0;
		int threshold = (int)Math.floor(nums.length/3);
		for(Map.Entry<Integer,Integer> entry : map.entrySet())
		{
			if(entry.getValue()>threshold)
			{
				count++;
				result.add(entry.getKey());
			}
			if(count==2)
				break;
		}
		return result;
    }
	
	public static void main(String[] args)
	{
		int[] nums = {1,2};
		List<Integer> result = majorityElement(nums);
		System.out.println(result);
	}
}