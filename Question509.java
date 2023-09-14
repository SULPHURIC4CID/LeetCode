/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 509

Decription:





*/


public class Question509
{
	public static int fib(int n) 
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		int first = 0;
		int second = 1;
		int curval;
		for(int i = 2;i<=n;i++)
		{
			curval = first+second;
			first = second;
			second = curval;
		}
        return curval;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String s1 = "abcd";
		String s2 = "pq";
		
		String s3 = mergeAlternately(s1,s2);
		System.out.println(s3);
		
	}	
		
}
