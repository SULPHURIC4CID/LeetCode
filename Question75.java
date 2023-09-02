/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 75

Decription:

Given an array nums with n objects colored red, white, or blue, 
sort them in-place so that objects of the same color are adjacent, 
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.


*/


public class Question75
{	
	public static void sortColors(int[] nums) 
	{
        int red = 0;
		int white = 0;
		int blue = 0;
		for(int i = 0;i<nums.length;i++)
		{
			if(nums[i] == 0)
				red++;
			else if(nums[i] == 1)
				white++;
			else
				blue++;
		}
		for(int i = 0;i<nums.length;i++)
		{
			if(i<red)
				nums[i] = 0;
			else if(i>=red && i<red+white)
				nums[i] = 1;
			else
				nums[i] = 2;
		}
    }	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] nums = {1,1,1,2,2,2,0,1,0,0,0,0,1,2,2,1,2,2,0};
		for(int i = 0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
		System.out.println();
		sortColors(nums);
		for(int i = 0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
		System.out.println();
	}	
		
}
