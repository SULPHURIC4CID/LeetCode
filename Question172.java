/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 172
*/

import java.util.*;

public class Question172
{
	public static int trailingZeroes(int n) 
	{
		int div5 = 0;
		int div2 = 0;
		int div10 = 0;
		for(int i = 1;i<=n;i++)
		{
			System.out.print(i + " ");
			int num = i;
			while(num>=2)
			{
				if(num%10==0)
				{
					div10++;
					num/=10;
				}
				else if(num%5==0)
				{
					div5++;
					num/=5;
				}
				else if(num%2==0)
				{
					div2++;
					num/=2;
				}
				else
				{
					break;
				}
			}
		}
		
        return div10 + Math.min(div5,div2);
    }
	
	public static void main(String[] args)
	{
		int n = 3;
		int result = trailingZeroes(n);
		System.out.println(result);
	}
}