/*

Author: Anantha Narayanan R

Section: Algorithms
Question: 89
*/

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class Question89
{
	public static void reverseAndAdd(ArrayList<List<Integer>> result)
	{
		int s = result.size();
		ArrayList<List<Integer>> temp= new ArrayList<List<Integer>>();
		temp = (ArrayList)result.clone();
		for(List<Integer> i:temp)
			result.add(s,i);
	}
	
	public static void prefix(ArrayList<List<Integer>> result)
	{
		
		for(int i = 0;i<result.size();i++)
		{
			ArrayList<Integer> temp = (ArrayList)result.get(i);
			ArrayList<Integer> temp2 = (ArrayList)temp.clone();
			if(i<(result.size()/2))
				temp2.add(0,0);
			else
				temp2.add(0,1);
			result.set(i,temp2);
		}
	}
	
	public static List<Integer> grayCode(int n) 
	{
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> gc = new ArrayList<Integer>();
		boolean flag = true;
        for(int i = 0;i<n;i++)
		{
			if(flag)
			{
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(0);
				result.add(temp);
				List<Integer> temp1 = new ArrayList<Integer>();
				temp1.add(1);
				result.add(temp1);				
				flag = false;
			}
			else
			{
				reverseAndAdd(result);
				prefix(result);
			}
		}
		for(List<Integer> o:result)
		{
			int power = o.size()-1;
			int sum=0;
			for(int i:o)
				sum = sum + (int)(i*Math.pow(2,power--));
			gc.add(sum);
		}
		return gc;
    }
	
	
	public static void main(String[] args)
	{
		
		
		System.out.println("Main Method starts");
		int n = 16;
		List<Integer> result = grayCode(n);
		System.out.println("RESULT: "+result);
	}
}