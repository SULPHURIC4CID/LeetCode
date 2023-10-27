/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 78
*/

import java.util.*;

public class Question78
{	
	public static void next(List<List<Integer>> result, List<Integer> temp, int k,int[] nums, int i)
	{
		if(temp.size()==k)
		{
			List<Integer> temp2 = new ArrayList<>();
			for(int number:temp)
				temp2.add(number);
			result.add(temp2);
		}
		else
		{
			for(int j=i;j<nums.length;j++)
			{
				temp.add(nums[j]);
				next(result,temp,k,nums,j+1);
				temp.remove(temp.size()-1);
			}
		}
	}
	
	public static void find(List<List<Integer>> result, int k, int[] nums)
	{
		//Declaring a temp List<Integer>
		List<Integer> temp = new ArrayList<>();
		
		for(int i =0;i<nums.length;i++)
		{
			temp.add(nums[i]);
			next(result,temp,k,nums,i+1);
			temp.remove(temp.size()-1);
		}
			
	}
	
	public static List<List<Integer>> subsets(int[] nums) 
	{
        /*
		Pseudo Code-
		1. Find the length of nums.
		2. We need to find sets of size 0,1,2,3,...,nums.length.
		3. Solve for each number separately and append the results.
		*/
		
		//Declaring a result List<List<Integer>>
		List<List<Integer>> result = new ArrayList<>();
		
		//Adding the NULL sets
		List<Integer> emptyList = new ArrayList<>();
		result.add(emptyList);		
		
		//Finding all sets of size 1,2,3,...,nums.length
		for(int i = 1;i<=nums.length;i++)
			find(result,i,nums);
		
		return result;		
    }
	
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,4};
		List<List<Integer>> result = subsets(nums);
		System.out.println("Result : "+result);
	}
}