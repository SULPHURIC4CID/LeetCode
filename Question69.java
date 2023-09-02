/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 69

*/

public class Question69      
{
	public static int mySqrt(int x)
	{
		long i = 1;
		while(x>=(i*i))
		{
			i++;
		}
		return (int)(i-1);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");	
		System.out.println(mySqrt(200000));
		
	}		
}
