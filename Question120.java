/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 120
*/

import java.util.*;

public class Question120
{
	
	public static void move(int[] result, int[] sum, int rowNumber, int position, List<List<Integer>> triangle)
	{
		if(rowNumber == triangle.size()-1)
		{
			if(sum[0]<result[0])
				result[0] = sum[0];
		}
		else
		{
			int[] options = new int[2];
			options[0] = triangle.get(rowNumber+1).get(position);
			options[1] = triangle.get(rowNumber+1).get(position+1);
			for(int j = 0;j<2;j++)
			{
				sum[0]+= options[j];
				move(result,sum,rowNumber+1,position+j,triangle);
				sum[0] -= options[j];
			}
		}
	}
	public static int minimumTotal(List<List<Integer>> triangle) 
	{
		int[] sum = {0};
		int[] result = {Integer.MAX_VALUE};
		
		sum[0] += triangle.get(0).get(0); // root element
		
		move(result,sum,0,0,triangle);
		
        return result[0];
    }
	
	public static void main(String[] args)
	{
		List<Integer> l1 = new ArrayList<>();
		l1.add(2);
		
		List<Integer> l2 = new ArrayList<>();
		l2.add(3);
		l2.add(4);
		
		List<Integer> l3 = new ArrayList<>();
		l3.add(6);
		l3.add(5);
		l3.add(7);
		
		List<Integer> l4 = new ArrayList<>();
		l4.add(4);
		l4.add(1);
		l4.add(8);
		l4.add(3);
		
		List<List<Integer>> finalList = new ArrayList<>();
		finalList.add(l1);
		finalList.add(l2);
		finalList.add(l3);
		finalList.add(l4);
		
		System.out.println(finalList);
		
		int result = minimumTotal(finalList);
		System.out.println("Result : "+result);
		
		
	}
}