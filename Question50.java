/*

Author: Anantha Narayanan R

Section: Algorithms
Question: 50
*/

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class Question50
{
	public static double myPow(double x, int n) 
	{
		if(x==0.0 || x==1.0)
			return x;
		if(x!=0.0 && n==0)
			return 1.0;
		boolean edgeFlag = false;
		double xTemp = x;
		
		boolean sign;
		if(n>0)
			sign = true;
		else if(n==Integer.MIN_VALUE)
		{
			edgeFlag = true;
			sign = false;
			n = Integer.MAX_VALUE;
		}
		else
		{
			sign = false;
			n=-n;
		}
		
		double result = 1.0;
		while(n>0)
		{		
			if(n%2==1)
			{
				result*=x;
				n=n-1;
			}
			else
			{
				x=x*x;
				n=n/2;
			}
		}
		if(edgeFlag)
			result*=xTemp;
		if(sign)
			return result;
		else
			return 1/result;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		double x = 2.0000;
		int n = -2147483648;
		double result = myPow(x,n);
		System.out.println(result);
	}
}