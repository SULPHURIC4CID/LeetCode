/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 345
*/

import java.util.*;

public class Question345
{
	public static String reverseVowels(String s) 
	{
		//Two pointer approach
		int i = 0,j = s.length()-1;
		char[] letters = s.toCharArray();
		String vowels = "aeiouAEIOU";
		while(i<j)
		{
			if(vowels.indexOf(letters[i])!= -1 && vowels.indexOf(letters[j])!= -1)
			{
				//swap them
				letters[i] = (char)(letters[i] ^ letters[j]);
				letters[j] = (char)(letters[i] ^ letters[j]);
				letters[i] = (char)(letters[i] ^ letters[j]);
				i++;
				j--;
			}
			else if(vowels.indexOf(letters[i])!= -1)
				j--;			
			else if(vowels.indexOf(letters[j])!= -1)
				i++;
			else
			{
				j--;
				i++;
			}
		}
		return new String(letters);
    }
	
	public static void main(String[] args)
	{
		String s = "Hello";
		String result = reverseVowels(s);
		System.out.println(result);
	}
}