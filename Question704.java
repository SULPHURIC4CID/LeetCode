/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 704

Decription:





*/


public class Question704
{
	//{2,7,10,16,36,44,64,88,95}-> Value
	// 0 1 2  3  4  5  6  7  8  -> Index
	public static int search(int[] nums, int target)
	{
		if(nums.length==0)
			return -1;
		if(nums.length==1 && target==nums[0])
			return 0;
		if(nums.length==1 && target != nums[0])
			return -1;
        int start = 0;
		int end = nums.length-1;
		int mid;
		while(start<=end)
		{
			mid = (start+end)/2;
			//System.out.println("start : "+start+" end : "+end+" mid : "+mid);
			if(target == nums[mid])
				return mid;
			if(target<nums[mid])
				end = mid-1;
			else
				start = start+1;			
		}
		return -1;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int target = 2;
		int[] arr = {9};//{2,7,10,16,36,44,64,88,95};
		System.out.println("The array is : ");
		for(int i = 0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println("The target is : "+target);
		int answer = search(arr,target);
		System.out.println("The answer is : "+answer);
		
	}	
		
}
