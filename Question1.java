/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 1

*/

public class Question1
{
	
	public static int[] twoSum(int[] nums, int target)
	{
		int[] temp = new int[2];
		for (int i = 0;i<nums.length;i++)
		{
			for(int j = 0;(j<nums.length&&j!=i);j++)
			{
				if(nums[i] + nums[j] == target)
				{
					temp[0] = i;
					temp[1] = j;
					return temp;
				}
			}
		}
		return temp;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] arr = {2,7,11,15};
		int target = 26;
		int[] arr1;
		arr1 = twoSum(arr,target);
		for(int k = 0;k<arr1.length;k++)
		{
			System.out.print(arr1[k]+" ");
		}
	}
}
