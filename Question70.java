/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 70

*/
/*

TestCases-


*/
public class Question70 
{
	public static int nCr(int n,int r)
	{	
		double mulValue = 1.0;
		boolean flag = true;
		for(int i = (n-r+1);i<=n;i++)
		{
			mulValue*=i;
			//System.out.println(mulValue);
			if(flag == true && mulValue>fact(r))
			{
				flag = false;
				mulValue = mulValue/fact(r);
			}
			
		}
		//System.out.println(mulValue);
		//System.out.println(fact(r));
		//return (int)(mulValue/fact(r));	
		return (int)(Math.round(mulValue));
		
		//return (int)(fact(n)/(fact(n-r)*fact(r)));
	}
	
	public static double fact(int n)
	{
		if(n==0 || n==1)
			return 1.0;
		double mul = 1.0;
		for(int i = 1;i<=n;i++)
			mul*=i;
		return mul;
	}
	public static int climbStairs(int n)
	{
		int ways = 0;		
		int numberOfOnes = n;
		int numberOfTwos = 0;
		int totalPositions; 
		int min;
		while(numberOfOnes>=0)
		{
			totalPositions = numberOfOnes + numberOfTwos;
			min = numberOfOnes<numberOfTwos?numberOfOnes:numberOfTwos;
			ways += nCr(totalPositions,min);
			//System.out.println("Number of 1s : "+numberOfOnes);
			//System.out.println("Number of 2s : "+numberOfTwos);
			//System.out.println("Total Positions: "+totalPositions);
			//System.out.println(totalPositions+" C "+min+" = "+nCr(totalPositions,min));
			//System.out.println("Total number of ways: "+ways);
			
			numberOfOnes-=2;
			numberOfTwos+=1;
		}
		return ways;		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");	
		System.out.println(climbStairs(45));
		//System.out.println(fact(34)/fact(33));
		//System.out.println(fact(33));
		//System.out.println(nCr(25,5));
		System.out.println(nCr(25,20));
		
	}		
}
