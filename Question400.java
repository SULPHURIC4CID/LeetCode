/*

Author: Ananthanarayanan R
Section: Algorithms
Question: 400


*/

public class Question400
{
	public static int digitCount(int num)
	{
		return (""+num).length();
	}
	
	public static int findNthDigit(int n) 
	{
        int index = 0;
		int num = 1;
		int digitCount = 0;
		while(true)
		{
			digitCount+=digitCount(num);
			if(n<=digitCount)
			{
				String temp = ""+num;
				return (int)(temp.charAt(temp.length()-1-(digitCount-n)))-48;
			}
			num++;
		}
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int n = 3;
		int result = findNthDigit(n);
		System.out.println(result);
		
	}
}