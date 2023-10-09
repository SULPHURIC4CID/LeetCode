/*

Author: Anantha Narayanan R

Section: Algorithms
Question: 47
*/

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Question47
{
	public static void repeat(ArrayList<Integer> arr,ArrayList<Integer> nums,Set<List<Integer>> result)
	{
		if(nums.size()==0)
		{
			List<Integer> temp = new ArrayList<Integer>();
			for(int i:arr)
				temp.add(i);
			result.add(temp);
			
		}
		else
			for(int i = 0;i<nums.size();i++)
			{
				arr.add(nums.remove(i));
				repeat(arr,nums,result);				
				nums.add(i,arr.remove(arr.size()-1));		
			}
	}
	
	public static List<List<Integer>> permuteUnique(int[] num)
	{
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i:num)
			nums.add(i);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Set<List<Integer>> result2 = new HashSet<List<Integer>>();
		for(int i = 0;i<nums.size();i++)
		{
			arr.add(nums.remove(i));
			repeat(arr,nums,result2);
			nums.add(i,arr.remove(arr.size()-1));			
		}
		for(List<Integer> i:result2)
			result.add(i);
		return result;
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] nums = {1,2,1};
		List<List<Integer>> res = permute(nums);
		System.out.println("result: "+res);
		
		
	}
}