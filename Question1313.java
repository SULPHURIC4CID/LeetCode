/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 1313

*/

public class Question1313
{
	public static int[] decompressRLElist(int[] nums) 
	{
		int length = 0;
		for(int i = 0;i<nums.length;i+=2)
			length+=nums[i];
		int[] result = new int[length];
		int index = 0;
		for(int i=0;i<nums.length;i+=2)
		{
			for(int j = 0;j<nums[i];j++)
			{
				result[index++] = nums[i+1];
			}
		}
		return result;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
	}		
}
