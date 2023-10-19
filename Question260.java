/*

Author: Ananthanarayanan R
Section: Algorithms
Question : 260


*/


import java.util.*;

public class Question260
{
	public static int[] singleNumber(int[] nums) 
	{
        if(nums.length==2)
			return nums;
		HashMap<Integer,Integer> map = new HashMap<>();
		int[] result = new int[2];
		Integer oldValue;
		for(int num:nums)
		{
			if((oldValue = map.put(num,1))!=null)
				map.put(num,oldValue+1);
		}
		int index = 0;
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
				result[index++] = entry.getKey();
			if(index==2)
				break;
		}
		return result;
    }
	
	public static void main(String[] args)
	{
		int[] nums = {1,1,2,3,4,5,6,7,8,9,9};
		int[] result = singleNumber(nums);
		System.out.println(result[0] + " and "+result[1]);
	}
}