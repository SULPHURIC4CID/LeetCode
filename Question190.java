/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 190

*/

public class Question190
{
	public static int reverseBits(int n) 
	{
        int i;
		int temp = 0;
		for(i=0;i<32;i++)
		{
			if((n&1)==1)
			{
				temp = temp<<1;
				temp = temp | 1;
			}
			else
				temp = temp<<1;
			n=n>>>1;
		}
		return temp;
    }

	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int n = -3;
		System.out.println(reverseBits(n));
	}
}
