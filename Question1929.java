/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 1929

Decription:


*/


public class Question1929
{	
	public static int[] getConcatenation(int[] nums) 
	{
		if(nums.length==0)
		{
			int[] ans = new int[0];
			return ans;
		}
		int[] ans = new int[nums.length*2]; 
		for(int j = 0;j<nums.length;j++)
	    {
			ans[j] = nums[j];
		    ans[j+nums.length] = nums[j];
	    }
		return ans;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] arr = {};
		int[] arr1 = getConcatenation(arr);
		for(int i = 0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}	
		
}
