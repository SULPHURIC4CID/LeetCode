/*

Author: Ananthanarayanan R
Section: Algorithms
Question: 357


*/

public class Question357
{
	/*
	public static boolean isUnique(int number)
	{
		if(number==0)
			return true;
		int[] count = {0,0,0,0,0,0,0,0,0,0};
		//Array.display(count);
		while(number>0)
		{
			count[number%10]++;			
			if(count[number%10] > 1)
			{
				//Array.display(count);
				//System.out.println("Breaking");
				return false;
			}
			number = number/10;
		}
		//Array.display(count);
		return true;
	}
	
	public static int countNumbersWithUniqueDigits(int n) 
	{
		int count=0;
		for(int i = 0;i<Math.pow(10,n);i++)
		{
			if(isUnique(i))
				count++;
		}
        return count;
    }
	*/
	public static int countNumbersWithUniqueDigits(int n) 
	{
		int count = 9;
		int sum=0;
		int mul = 9;
		if(n==0)
			return 1;
		if(n==1)
			return 10;
		sum = 10;
		for(int i = 2;i<=n;i++)
		{
			count*=mul;
			sum+=count;
			mul--;
		}
		return sum;	
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int n = 2;
		int result = countNumbersWithUniqueDigits(n);
		System.out.println(result);
		
	}
}