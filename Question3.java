/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 3

*/
/*

TestCases-



*/
public class Question3 
{	
	public static int lengthOfLongestSubstring(String s) 
	{
		int length = 0,i=0,j=0;
		while(i<s.length() && j < s.length())
			if(s.indexOf(s.charAt(j),i)==j)
				j++;
			else
			{
				length = (length<(j-i))?(j-i):length;
				i++;
			}
		length = (length<(j-i))?(j-i):length;
		return length;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String s = "pwwkewmbasdfghijklompu";
		System.out.println("The string is : "+s);
		System.out.println(lengthOfLongestSubstring(s));		
	}		
}
