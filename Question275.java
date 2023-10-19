/*

Author: Ananthanarayanan R
Section: Algorithms
Question : 275


*/


import java.util.*;

public class Question275
{
	public static int hIndex(int[] citations) 
	{
		if(citations.length==1 && citations[0] > 0)
			return 1;
        int start = 0;
		int end = citations.length-1;
		int mid = (start+end)/2;
		int result = 0;
		int temp = 0;
		while(start<=end)
		{
			System.out.println("-----------------");
			System.out.println("start : "+start);
			System.out.println("end : "+end);
			System.out.println("mid : "+mid);
			System.out.println("citations[mid] : "+citations[mid]);
			System.out.println("-----------------");
			
			//Main Logic
			if(citations[mid]<=citations.length-1-mid+1)
			{
				temp = citations[mid];
				start = mid+1;
			}
			else
			{
				temp = citations.length-mid;
				end = mid-1;
			}	
			mid = (start+end)/2;
			if(temp>result)
				result = temp;
			System.out.println("Result : "+result);
		}
		return result;		
	}
	
	public static void main(String[] args)
	{
		//{11,15,35}
		int[] citations  = {11,15};
		System.out.println(Arrays.toString(citations));
		int result = hIndex(citations);
		System.out.println("hIndex : "+result);		
	}
}
