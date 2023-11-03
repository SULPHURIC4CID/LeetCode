/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 139
*/

import java.util.*;

public class Question139
{
	public static void add(String s, List<String> wordDict, StringBuilder sb, boolean[] result)
	{
		System.out.println(sb);
		for(String word:wordDict)
		{
			int startingPosition = sb.length();
			sb.append(word);	
			if(sb.length()<s.length())
				add(s,wordDict,sb,result);
			else if(sb.length()==s.length())
			{
				if(s.equals(sb.toString()))
					result[0] = true;
			}
			//Remove the appended word from the sb object
			sb.delete(startingPosition,sb.length());					
		}	
	}
	
	public static boolean wordBreak(String s, List<String> wordDict) 
	{
		boolean[] result = new boolean[1];
		result[0] = false;
		
		StringBuilder sb = new StringBuilder();		
		
		add(s,wordDict,sb,result);
		
        return result[0];
    }
	
	public static void main(String[] args)
	{
		String s = "applepenappleapple";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("apple");
		wordDict.add("pen");
		boolean result = wordBreak(s,wordDict);
		System.out.println(result);		
	}
}