/*

Author: Anantha Narayanan R

Section: Algorithms
Question: 46
*/

import java.util.List;
import java.util.ArrayList;

public class Question46
{
	public static void repeat(ArrayList<Integer> arr,ArrayList<Integer> nums,List<List<Integer>> result)
	{
		if(nums.size()==0)
			result.add(arr);
		else
			for(int i = 0;i<nums.size();i++)
			{
				arr.add(nums.remove(i));
				repeat(arr,nums,result);				
				nums.add(i,arr.remove(arr.size()-1));		
			}
	}
	
	public static List<List<Integer>> permute(ArrayList<Integer> nums)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for(int i = 0;i<nums.size();i++)
		{
			arr.add(nums.remove(i));
			repeat(arr,nums,result);
			nums.add(i,arr.remove(arr.size()-1));			
		}	
		return result;
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		List<List<Integer>> res = permute(nums);
		System.out.println("result: "+res);
		
		
	}
}