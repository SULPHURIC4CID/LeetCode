/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 2784

Decription:





*/


public class Question2784
{
	public static int maxOfArray(int[] nums)
	{
		int max = Integer.MIN_VALUE;
		for(int i =0;i<nums.length;i++)
		{
			if(nums[i] > max)
				max = num[i];
		}
		return max;
	}

	
	public static boolean isGood(int[] nums)
	{
        if(nums.length==0 || nums.length==1)
			return false;
		int maxVal = maxOfArray(nums)
		if(nums.length != maxVal + 1)
			return false;
		
		int index = 0;
		for(int i =0;i<nums.length;i++)
		{
			index+=nums[i];
		}
		
		if(index == (maxVal*(maxVal+1)/2) + maxVal)
			return true;
		else
			return false;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		
	}	
		
}
