/*

Author: Ananthanarayanan R
Section: Algorithms
Question: 922

*/

import java.util.*;

public class Question922
{
	public static int[] sortArrayByParityII(int[] nums) 
	{
        List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		for(int i = 0;i<nums.length;i++)
		{
			if(nums[i] % 2 == 1)
				odd.add(nums[i]);
			else
				even.add(nums[i]);
		}
		int[] result = new int[nums.length];
		int index = 0;
		for(int i = 0;i<odd.size();i++)
		{
			result[index++] = even.get(i);
			result[index++] = odd.get(i);
		}
		return result;
    }
	
	public static void main(String[] args)
	{
		int[] nums = {1,3,5,7,2,4,8,10};
		int[] result = sortArrayByParityII(nums);
		System.out.println(Arrays.toString(result));
		
	}
}