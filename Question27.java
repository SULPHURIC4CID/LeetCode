/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 27

*/

public class Question27
{
	public static int removeElement(int[] nums, int val)
	{
		int index = 0;
		for(int i = 0;i<nums.length;i++)
		{
			if(nums[i] != val)
			{
				nums[index++] = nums[i];
			}
		}
		return index;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] arr = {1,2,2,2,3,3,4,5,6,7,8,9,9,9,9};
		int val = 3;
		int k = removeElement(arr,val);
		System.out.println(k);
		System.out.println(arr.length);
		System.out.println(7/3);
		
	}		
}
