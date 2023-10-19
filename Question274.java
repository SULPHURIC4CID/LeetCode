/*

Author: Ananthanarayanan R
Section: Algorithms
Question : 274


*/


import java.util.*;

public class Question274
{
	public static int hIndex(int[] citations) 
	{
        ArrayList<Integer> list = new ArrayList<>();
		for(int citation:citations)
			list.add(citation);
		
		Collections.sort(list);
		Collections.reverse(list);
		int max=0;
		int number;
		for(int i = 1;i<=citations.length;i++)
		{
			number = i;
			int index = 0;
			int count = 0;
			for(int citation:list)
			{
				if(index++<number)
				{					
					if(citation>=i)
						count++;
				}
			}
			if(count==i)
				max=i;
			else
				break;
		}
		return max;
		
    }
	
	public static void main(String[] args)
	{
		int nums[] = {1,3,1};
		int result = hIndex(nums);
		System.out.println(result);
	}
}
