/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 80
*/

import java.util.*;

public class Question80
{
	public static int removeDuplicates(int[] nums) 
	{
        int count = 1;
		int start = nums[0];
		int index = 1;
		int numberOfShifts = 0;
		while(index<nums.length-numberOfShifts)
		{
			if(nums[index] == start)
			{
				count++;
				if(count>2)
				{
					//left shift all suceeding elements by 1 position
					numberOfShifts++;
					for(int j=index;j<nums.length-1;j++)
					{
						nums[j] = nums[j+1];
					}
					
					//Decrement Count
					count--;
					
					//Dont incement Index
					
				}
				else
				{
					index++;
				}
			}
			else
			{
				start = nums[index];
				count = 1;
				index++;
			}
		}		
		return nums.length-numberOfShifts;
    }
	
	public static void main(String[] args)
	{
		int[] nums = {0,0,1,1,1,1,2,3,3};
		int result = removeDuplicates(nums);
		System.out.println(" K : "+result);
		System.out.println("After removing : "+Arrays.toString(nums));
	}
}