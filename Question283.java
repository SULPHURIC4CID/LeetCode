/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 283

*/

public class Question283
{
	public static void display(int[] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	public static void moveZeroes(int[] nums) 
	{
        int i,j;
		for(i=0;i<nums.length;i++)
		{
			for(j=0;j<nums.length-i-1;j++)
			{
				if(nums[j] == 0)
				{
					nums[j] = nums[j]^nums[j+1];
					nums[j+1] = nums[j]^nums[j+1];
					nums[j] = nums[j]^nums[j+1];
				}
			}
		}
		display(nums);
    }
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] arr = {0,1,0,3,12};
		display(arr);
		moveZeroes(arr);
	}
}

