/*

Author: Ananthanarayanan R
Section: Algorthms
Question: 1221

*/

public class Question1221
{
	public static  int balancedStringSplit(String s) 
	{
        int lCount = 0;
		int rCount = 0;
		int substringCount = 0;
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) == 'L')
				lCount++;
			else
				rCount++;
			if(lCount==rCount)
			{
				lCount=0;
				rCount=0;
				substringCount++;
			}
		}
		return substringCount;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
	}
}
