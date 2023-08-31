/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 34

*/

public class Question34
{
	
	public static int[] searchRange(int[] nums, int target) 
	{
		int[] result = {-1,-1};
        if (nums==null || nums.length==0)
			return result;
		boolean flag = false;
		for(int i = 0;i<nums.length;i++)
		{
			if(!flag && nums[i] == target)
			{
				flag = true;
				result[0] = i;
			}
			if(nums[i] == target)
				result[1]=i;				
		}
		return result;
    }
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		//int[] array = Array.generate(30);
		//Array.sort(array,"bubble","asc");
		int[] array = {1,2,3,4,5,6,7,8,26,26,26,26,26,94,99};
		Array.display(array);
		int[] res = searchRange(array,26);
		Array.display(res);
	}		
}
