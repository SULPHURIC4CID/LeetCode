/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 77
*/

import java.util.*;

public class Question77
{
	public static void next(List<List<Integer>> result, List<Integer> temp, int i,int[] numbers, int k)
	{
		if(temp.size() == k)
		{
			List<Integer> temp2 = new ArrayList<>();
			for(int num:temp)
				temp2.add(num);
			result.add(temp2);
		}
		else
		{
			for(int j=i;j<numbers.length;j++)
			{
				temp.add(numbers[j]);
				next(result,temp,j+1,numbers,k);
				temp.remove(temp.size()-1);
			}
		}
	}
	public static List<List<Integer>> combine(int n, int k) 
	{
		//Declaring a numbers array
        int[] numbers = new int[n];
		
		//Populating the new array with [1,n]
		for(int i = 1;i<=n;i++)
			numbers[i-1] = i;
		
		//Declaring the List<List<Integer>> result collection
		List<List<Integer>> result = new ArrayList<>();
		
		//Temporary List
		List<Integer> temp = new ArrayList<>();
		//Main Logic
		for(int i = 0;i<numbers.length;i++)
		{
			temp.add(numbers[i]);
			next(result,temp,i+1,numbers,k);
			temp.remove(temp.size()-1);
		}		
		return result;
		
    }
	
	public static void main(String[] args)
	{
		int n = 4;
		int k = 2;
		List<List<Integer>> result = combine(n,k);
	}
}