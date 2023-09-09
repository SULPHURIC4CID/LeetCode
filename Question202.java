/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 202

*/

public class Question202
{
	public static boolean isHappy(int n)
	{		
		int sum=0;
		int rem;
        while(true)
		{
			if(n==1)
				return true;
			if(n==4)
				return false;
			sum = 0;
			while(n>0)
			{
				rem = n%10;
				sum+=(rem*rem);
				n=n/10;
			}
			n = sum;
		}
    }

	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int n = 3;
		System.out.println(isHappy(n));
	}
}
