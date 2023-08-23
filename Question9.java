/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 9

*/

public class Question9
{
	
	public static boolean palindrome(int number)
	{
		int temp = number;
		if (number < 0)
			return false;
		if (number/10 == 0)
			return true;
		int palindrome = 0;
		while(number>0)
		{
			palindrome = (palindrome*10)+(number%10);
			number = number/10;				
		}
		if (palindrome == temp)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int x = 12321;
		System.out.println(palindrome(x));
	}
}
