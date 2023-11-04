/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 409
*/

import java.util.*;

public class Question409
{
	public static int longestPalindrome(String s) 
	{
		int[] upper = new int[26];
		int[] lower = new int[26];
		boolean oddPresent = false;
		for(int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch >= 'a' && ch <= 'z')
				lower[ch-97]++;
			else
				upper[ch-65]++;
		}
		
		int count = 0;
		for(int i = 0;i<26;i++)
		{
			if(upper[i] % 2==0)
				count+=upper[i];
			else
			{
				oddPresent = true;
				count+=(upper[i]-1);
			}
			
			if(lower[i]%2==0)
				count+=lower[i];
			else
			{
				oddPresent = true;
				count+=(lower[i]-1);
			}
		}
		if(oddPresent)
			count++;
        return count;
    }
	
	public static void main(String[] args)
	{
		String s = "abccccdd";
		int result = longestPalindrome(s);
		System.out.println(result);
	}
}