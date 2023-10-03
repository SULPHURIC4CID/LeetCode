/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 233

*/
/*

TestCases-



*/
public class Question233
{		
	public static int findOnes(int n)
	{
		int count=  0;
		while(n>0)
		{
			if(n%10 == 1)
				count++;
			n/=10;
		}
		return count;
	}
	
	public static int countDigitOne(int n) 
	{
		int count = 0;
		for(int i = n;i>0;i--)
		{
			count+=findOnes(i);
		}
		return count;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int n = 13;
		System.out.println("Number of 1s : "+countDigitOne(n));
		
	}		
}
