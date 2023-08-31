/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 35

*/
/*

TestCases-



*/
public class Question35
{		
	public static int searchInsert(int[] nums, int target) 
	{
		int start = 0;
		int end = nums.length-1;
		int mid = (start+end)/2;
		if(nums[nums.length-1]<target)
			return nums.length;
		if(nums[0]>target)
			return 0;
		while(start<=end)
		{	
			if(nums[mid] == target)
				return mid;
			if(target<nums[mid])
			{
				if(target==nums[mid-1])
					return (mid-1);
				else if(target>nums[mid-1])
					return mid;
				else
				{
					start = start;
					end = mid-1;
					mid = (start+end)/2;
				}
			}
			if(target>nums[mid])
			{
				if(target == nums[mid+1])
					return (mid+1);
				else if(target<nums[mid+1])
					return (mid+1);
				else
				{
					start = mid+1;
					end = end;
					mid = (start+end)/2;
				}
			}
		}
		return mid;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] arr = {1,3,5,6,8,10,12,13,14,15,16,17,23,27,38,39,43,44};
		int target = 4;
		System.out.println(searchInsert(arr,4));
		System.out.println(searchInsert(arr,12));
		System.out.println(searchInsert(arr,67));
		System.out.println(searchInsert(arr,5));
		System.out.println(searchInsert(arr,6));
		System.out.println(searchInsert(arr,7));
		System.out.println(searchInsert(arr,8));
		System.out.println(searchInsert(arr,9));
		System.out.println(searchInsert(arr,10));
		System.out.println(searchInsert(arr,111));
		
	}		
}
