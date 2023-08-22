/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 7

*/

public class Question7
{
	
	public static int reverse(int x)
	{
		boolean sign = false;
		if (x<0)
		{
			x=-x;
			sign = true;
		}
		long reverseNum=0;
		while(x>0)
		{
			reverseNum = (reverseNum*10)+(x%10);
			x/=10;
		}
		if (sign==true)
			reverseNum = -reverseNum;
		if ((reverseNum > 2147483647) || reverseNum < -2147483648)
			return 0;
		return (int)reverseNum;		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int x = 123;
		System.out.println(reverse(x));
	}
}
