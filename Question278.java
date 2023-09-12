/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 278

*/

public class Question278
{
	public static int firstBadVersion(int n) 
	{
        int start = 1;
		int end = n;
		int mid = (start+end)/2;
		while(start<end)
		{
			if(isBadVersion(mid))
				end = mid;
			else
				start = mid+1;
			mid = (start+end)/2;
		}
		return start;
    }
	
	/*
	n=5
	start		 end			mid
	1			5				3
	1			3				2
	
	
	
	
	*/
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
	}
}

