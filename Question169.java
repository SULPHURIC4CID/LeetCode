/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 169

*/

public class Question169
{
	public static boolean check(int[] arr,int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == num)
				return true;
		}
		return false;
	}
	
	public static int findIndex(int[] arr,int num)
	{
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] == num)
				return i;
		}
		return 0;
	}
	public static int majorityElement(int[] nums) 
	{
		int[] temp = new int[nums.length];
		int[] count = new int[nums.length];
		int index=0;
		int i,j;
		for(i=0;i<nums.length;i++)
		{
			if(!check(temp,nums[i]))
			{
				temp[index] = nums[i];
				count[index] = 1;
				index++;
			}
			else
			{
				count[findIndex(temp,nums[i])]++;
			}
		}
		int max = Integer.MIN_VALUE;
		int maxIndex = 0;
		for(i=0;i<index;i++)
		{
			if(count[i]>max)
			{
				max = count[i];
				maxIndex = i;
			}
		}
		return temp[maxIndex];
        
    }

	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] nums = {1,1,1,1,1,2,2,2};
		System.out.println(majorityElement(nums));
	}
}
