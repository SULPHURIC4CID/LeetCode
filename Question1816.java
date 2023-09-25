/*

Author: Ananthanarayanan R
Section: Algorthms
Question: 1816

*/

public class Question1816
{
	public static String truncateSentence(String s, int k) 
	{
		int spaceCount = 0;
		int i;
		for(i = 0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				spaceCount++;
			if(spaceCount==k)
				break;
		}
		return s.substring(0,i);
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");	
		String s = "Java is a nice language";
		int k = 3;
		
		String result = truncateSentence(s,k);
		System.out.println(result);
	}
}
