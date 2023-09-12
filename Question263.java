/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 263

*/

public class Question263
{
	public static boolean isUgly(int num) 
	{
		int count;
		if(num==0)
			return false;
        while(true)
		{
			if(num==1)
				return true;
			count = 0;
			if(num%2==0)
				num=num/2;
			else
				count++;
			if(num%3==0)
				num=num/3;
			else
				count++;
			if(num%5==0)
				num=num/5;
			else
				count++;
			if(count==3)
				return false;
			
		}
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		System.out.println(isUgly(123));
	}
}

