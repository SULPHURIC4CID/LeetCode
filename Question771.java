/*

Author: Ananthanarayanan R
Section: Algorthms
Question: 771

*/

public class Question771
{
	public static int numJewelsInStones(String jewels, String stones) 
	{
        int count = 0;
		for(int i = 0;i<stones.length();i++)
		{
			if(jewels.indexOf(stones.charAt(i))>=0)
				count++;
		}
		return count;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
	}
}
