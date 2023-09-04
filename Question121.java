/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 121

*/
/*

TestCases-



*/
public class Question121
{	
	public static int maxProfit(int[] prices)
	{
        int i,j;
		int profit = 0;
		for(i = 0;i<prices.length;i++)
		{
			for(j=i+1;j<prices.length;j++)
			{
				if((prices[j]-prices[i])>profit)
					profit = (prices[j]-prices[i]);
			}
		}
		return profit;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] arr = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));
	}		
}
