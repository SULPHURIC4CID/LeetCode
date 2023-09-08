/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 162

*/

public class Question162
{
	public static int findPeakElement(int[] nums) 
	{
        if(nums.length==1)
			return 0;
		if(nums[0]>nums[1] && nums.length>=2)
			return 0;
		if(nums[nums.length-1]>nums[nums.length-2] && nums.length>=2)
			return nums.length-1;
		for(int i = 1;i<nums.length-1;i++)
		{
			if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
				return i;
		}
		return -1;
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] array = Array.generate(30);
		Array.display(array);
		int res = findPeakElement(array);
		System.out.println(res);
	}		
}
