/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 204
*/

import java.util.*;

public class Question204
{
	public static int countPrimes(int n) 
	{
		if (n<2)
			return 0;
		boolean[] isPrime = new boolean[n];
		for(int i = 0;i<isPrime.length;i++)
			isPrime[i] = true;
		//Make the first 2 entries false
		isPrime[0] = false;
		isPrime[1] = false;
		
		for(int i = 2;i<n;i++)
		{
			for(int j = 2*i;j<n;j+=i)
			{
				isPrime[j] = false;
			}
		}
		int count = 0;
		for(int i = 0;i<n;i++)
			if(isPrime[i])
				count++;
	
		return count;
    }
	
	public static void main(String[] args)
	{
		int n = 400000;
		int result = countPrimes(n);
		System.out.println(result);
	}
}