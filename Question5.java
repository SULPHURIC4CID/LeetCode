/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 5

*/
/*

TestCases-


*********************************
*	#	*	String	*	output	*
*********************************
*	1	*	abba	*	true	* - 4
*********************************
*	2	*	abcba	*	true	* - 5
*********************************
*	3	*	abcd	*	false	* - 4
*********************************
*	4	*	abbbb	*	false	* - 5
*********************************

*/
public class Question5    
{
	
	public class LongestPalindromicSubstringFinder {

    public static String findLongestPalindromicSubstring(String s) 
	{
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);      // Odd length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);  // Even length palindrome

            int maxLength = Math.max(len1, len2);

            if (maxLength > end - start) {
                // Calculate new start and end positions for the longest palindrome found so far
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right)
	{
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

	/*
    public static void main(String[] args)
	{
        String inputString = "babad";
        String longestPalindromicSubstring = findLongestPalindromicSubstring(inputString);
        System.out.println("Longest Palindromic Substring: " + longestPalindromicSubstring);
    }
	*/


	
	
	//Method to check if a String is a palindrome or not
	public static boolean checkPalindrome(String s)
	{
		int count = 0;
		
		//Traversing across half the String
		for(int i = 0;i<(s.length()/2);i++)
		{
			if(s.charAt(i) == s.charAt(s.length()-1-i))
				count++;
		}
		if(count==(s.length()/2))
			return true;
		else
			return false;
	}
	
	//Method to find longest substring of a String
	public static String longestPalindrome(String s)
	{
		/*
		int len = 0;
		String temp = "";
		//Iterating across all substrings of the String
		for(int i = 0;i<s.length();i++)
		{
			for(int j = i;j<=s.length();j++)
			{
				//If substring is palindrome, checking the length and storing the substring
				if(checkPalindrome(s.substring(i,j)))
				{
					if(len < s.substring(i,j).length())
					{
						len = s.substring(i,j).length();
						temp = s.substring(i,j);
					}
				}
			}
		}
		return temp;
		*/
		
		int i=0,j=0;
		int len = 0;
		String temp = "";
		while(i<s.length())
		{
			//System.out.println("i = "+i+" j = "+j);
			if(checkPalindrome(s.substring(i,j)))
			{
				if(len < s.substring(i,j).length())
				{
					len = s.substring(i,j).length();
					temp = s.substring(i,j);
				}
			}
			if(j<s.length())
			{
				j++;
			}
			else
			{
				i++;
				j=i;
			}
		}
		return temp;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");	
		
		//System.out.println(longestPalindrome("abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa"));		
		System.out.println(longestPalindrome("abraarbacadabra"));
	}		
}
