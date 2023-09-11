/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 231

*/

public class Question231
{
	public static boolean isPowerOfTwo(int n)
	{
		int count=0;
		if(n == Integer.MIN_VALUE)
			return true;
		for(int i = 0;i<32;i++)
		{
			if((n&1)==1)
			{
				count++;
			}
			n = n >> 1;
		}
		if(count==1)
			return true;
		else
			return false;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int n = -128;
		System.out.println(isPowerOfTwo(n));
	}
}
