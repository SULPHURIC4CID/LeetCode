/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 392

*/
/*

TestCases-


*/
public class Question392
{	

	public static boolean isSubsequence(String s, String t) 
	{
        if(s.length()>t.length())
			return false;
		int pos=-1;
		for(int i=0;i<s.length();i++)
		{			
			pos = t.indexOf(s.charAt(i),pos+1);
			if(pos<0)
				return false;
		}
		return true;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String s = "leetcode";
		String t = "aaaaaaaaaaaaaaaaaaalaaaaaaaaaaaaaaaaeaaaaaaaaaaaaaaaaaaeaaaaaaaataaaaaaaaaaacaaaaaaaaaaoaaaaaaaaaaadaaaaaaaaaaeaaaaaaa";
		System.out.println(isSubsequence(s,t));
	}		
}
