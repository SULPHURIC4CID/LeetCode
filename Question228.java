/*

Author: Ananthanarayanan R
Section: Algorithms
Question : 228


*/

import java.util.*;

public class Question228
{
	public static List<String> summaryRanges(int[] nums) 
	{
        List<String> result = new ArrayList<>();
		if(nums.length==0)
			return result;
		if(nums.length==1)
		{
			result.add(""+nums[0]);
			return result;			
		}
		int currValue = nums[0];
		int startValue = currValue;
		for(int i = 1;i<nums.length;i++)
			if(nums[i]==currValue+1)
				currValue++;
			else
			{
				if(startValue==currValue)
					result.add(""+startValue);
				else
					result.add(""+startValue+"->"+currValue);
				startValue = nums[i];
				currValue = startValue;
			}
		if(startValue==currValue)
			result.add(""+startValue);
		else
			result.add(""+startValue+"->"+currValue);
		return result;
    }
	
	public static void main(String[] args)
	{
		int[] nums = {0,1,2,3,5,6,8,9,10,12,13};
		List<String> result = summaryRanges(nums);
		System.out.println(result);
	}
}