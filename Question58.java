/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 58

*/
/*

TestCases-


*/
public class Question58
{	

	public int lengthOfLastWord(String s)
	{
        s = s.trim();
		String[] sa;
		sa = s.split(" ");
		if(sa.length>0)
		{
			return sa[sa.length-1].length();
		}
		else
			return 0;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
	}		
}
