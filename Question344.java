/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 344
*/

import java.util.*;

public class Question344
{
	public static void reverseString(char[] s) 
	{
		for(int i = 0;i<s.length/2;i++)
		{
			s[i] = (char)(s[i] ^ s[s.length-1-i]);
			s[s.length-1-i] = (char)(s[i] ^ s[s.length-1-i]);
			s[i] = (char)(s[i] ^ s[s.length-1-i]);
		}
        return;
    }
	
	public static void main(String[] args)
	{
		String str = "Anantha is best.";
		char[] s = str.toCharArray();
		System.out.println(Arrays.toString(s));
		reverseString(s);
		System.out.println(Arrays.toString(s));
	}
}