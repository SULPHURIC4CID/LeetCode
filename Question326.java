/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 326

*/

public class Question326
{
	public boolean isPowerOfThree(int n) 
	{
		if(n==0)
			return false;
        while(true)
		{
			if(n==1)
				return true;
			if(n%3==0)
				n=n/3;
			else
				return false;
		}
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
	}
}

