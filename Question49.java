/*

Author: Anantha Narayanan R

Section: Algorithms
Question: 49
*/

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Question49
{
	public static String convert(String word)
	{
		int[] wordCount = new int[26];
		for(int i = 0;i<word.length();i++)
			wordCount[(int)word.charAt(i)-97]++;
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<26;i++)
		{
			sb.append(wordCount[i]);
			sb.append(",");
		}
		return sb.toString();
	}
	
	
	public static List<List<String>> groupAnagrams(String[] strs) 
	{
        List<List<String>> result= new ArrayList<List<String>>();
		List<String> words= new ArrayList<String>();
		for(String str:strs)
			words.add(str);
		while(words.size()>0)
		{
			List<String> temp = new ArrayList<String>();
			temp.add(words.remove(0));
			int index = 0;
			while(index<words.size())
				if(convert(temp.get(0)).equals(convert(words.get(index))))
					temp.add(words.remove(index));
				else
					index++;
			result.add(temp);
		}
		return result;
    }
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String[] words = {"bdddddddddd","bbbbbbbbbbc"};	
		List<List<String>> result = groupAnagrams(words);
		System.out.println(result);
	}
}