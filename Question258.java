/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 258

*/

public class Question258
{
	public static int addDigits(int num) 
	{
        int sum = 11;		
		while(sum>=10)
		{
			sum = 0;
			while(num>0)
			{
				sum+=(num%10);
				num/=10;
			}
			num = sum;
		}
		return sum;
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		System.out.println(addDigits(123));
	}
}

