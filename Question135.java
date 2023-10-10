/*

Author: Anantha Narayanan R

Section: Algorithms
Question: 135
*/

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class Question135
{
	public static int candy(int[] ratings) 
	{
		if(ratings.length==1)
			return 1;
		int[] count = new int[ratings.length];
        //Give one candy to each child
		for(int i = 0;i<ratings.length;i++)
			count[i]++;
		//forward iteration
		for(int i = 0;i<ratings.length;i++)
		{
			if(i==0)
			{
				if(ratings[i+1]<ratings[i])
					count[i] = count[i+1]+1;
			}
			else if(i==ratings.length-1)
			{
				if(ratings[i-1]<ratings[i])
					count[i] = count[i-1]+1;
			}
			else
			{
				if(ratings[i]>ratings[i-1] && ratings[i]>ratings[i+1])
					count[i] = Math.max(count[i-1],count[i+1])+1;
				else if(ratings[i]>ratings[i-1] && ratings[i] <= ratings[i+1])
					count[i] = count[i-1]+1;
				else if(ratings[i]<=ratings[i-1] && ratings[i] > ratings[i+1])
					count[i] = count[i+1]+1;
			}
		}
		//backward iteration
		for(int i = ratings.length-1;i>=0;i--)
		{
			if(i==0)
			{
				if(ratings[i+1]<ratings[i])
					count[i] = count[i+1]+1;
			}
			else if(i==ratings.length-1)
			{
				if(ratings[i-1]<ratings[i])
					count[i] = count[i-1]+1;
			}
			else
			{
				if(ratings[i]>ratings[i-1] && ratings[i]>ratings[i+1])
					count[i] = Math.max(count[i-1],count[i+1])+1;
				else if(ratings[i]>ratings[i-1] && ratings[i] <= ratings[i+1])
					count[i] = count[i-1]+1;
				else if(ratings[i]<=ratings[i-1] && ratings[i] > ratings[i+1])
					count[i] = count[i+1]+1;
			}
		}
		
		int sum = 0;
		for(int i = 0;i<ratings.length;i++)
		{
			sum+=count[i];
			System.out.println(count[i]);
		}
		return sum;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] ratings = {1,2,87,87,87,2,1};
		int result = candy(ratings);
		System.out.println(result);
	}
}