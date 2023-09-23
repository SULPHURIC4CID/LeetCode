/*

Author: Ananthanarayanan R
Section: Algorthms
Question: 1662

*/

public class Question1662
{
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) 
	{
        String s1 = "";
		String s2 = "";
		for(int i = 0;i<word1.length;i++)
			s1+=word1[i];
		for(int i = 0;i<word2.length;i++)
			s2+=word2[i];
		if(s1.equals(s2))
			return true;
		else
			return false;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");		
	}
}
