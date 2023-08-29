/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 26

*/

public class Question26
{
	public static int removeDuplicates(int[] nums)
	{
		int index = 1;
		int initialElement = nums[0];
		for(int i = 1;i<nums.length;i++)
		{
			if(nums[i] == initialElement)
			{
				continue;
			}
			else
			{
				nums[index++] = nums[i];
				initialElement = nums[i];
			}
		}
		return(index);
		
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] arr = {1,2,2,2,3,3,4,5,6,7,8,9,9,9,9};
		int k = removeDuplicates(arr);
		System.out.println(k);
	}		
}
