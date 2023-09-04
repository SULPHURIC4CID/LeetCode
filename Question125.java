/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 125

*/
/*

TestCases-


*/
public class Question125
{
	
	public static boolean isPalindrome(String s) 
	{
        s=s.toLowerCase();
		String s1 = "";
		int i;
		int ch;
		for(i=0;i<s.length();i++)
		{
			ch = (int)s.charAt(i);
			if((ch>=97 && ch<=122)  ||(ch>=48 && ch<=57))
				s1+=s.charAt(i);
		}
		for(i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) != s1.charAt(s1.length()-1-i))
				return false;
		}
		return true;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		System.out.println(isPalindrome("abba"));
		
		
		
	}		
}
