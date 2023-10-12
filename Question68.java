/*

Author: Ananthanarayanan R
Section: ALgorithms
Question: 68

*/

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Question68
{
	public static void add(List<String> result, int s, int e, String[] words, int maxWidth, boolean flag)
	{
		int onlyWordCount = 0;		
		int spaceCount = 0;
		int numberOfSpaces = e-s;
		if(flag == true)
		{
			StringBuilder sb = new StringBuilder();
			for(int i=s;i<=e;i++)
			{
				sb.append(words[i]);
				sb.append(" ");				
			}
			sb.deleteCharAt(sb.length()-1);
			int diff = maxWidth-sb.length();
			for(int i = 0;i<diff;i++)
				sb.append(" ");
			result.add(sb.toString());
			//System.out.println(sb.toString()+ ": "+sb.length());
			return;
		}
		if(numberOfSpaces==0)
		{
			StringBuilder sb = new StringBuilder();
			sb.append(words[s]);
			String temp = "";
			for(int i=1;i<=(maxWidth-words[s].length());i++)
				temp+=" ";
			sb.append(temp);
			result.add(sb.toString());
			//System.out.println(sb.toString()+ ": "+sb.length());
			return;
		}
		String[] spc = new String[numberOfSpaces];
		for(int i = s;i<=e;i++)
			onlyWordCount+=words[i].length();
		spaceCount = maxWidth - onlyWordCount;
		int minSpaceCount = spaceCount/numberOfSpaces;
		for(int i = 0;i<numberOfSpaces;i++)
		{
			String temp = new String("");
			for(int j = 1;j<=minSpaceCount;j++)
				temp+=" ";
			spc[i] = temp;
		}
		spaceCount-=(minSpaceCount*numberOfSpaces);
		for(int i = 0;i<spaceCount;i++)
			spc[i] += " ";
		int totalNumberOfStrings = e-s+1+numberOfSpaces;
		int index = 1;
		int wordIndex = 0;
		int spaceIndex = 0;
		StringBuilder sb = new StringBuilder();
		while(index<=totalNumberOfStrings)
		{
			if(index%2==1)
				sb.append(words[s+wordIndex++]);
			else
				sb.append(spc[spaceIndex++]);
			index++;
		}
		
		result.add(sb.toString());
		//System.out.println(sb.toString()+ ": "+sb.length());
	}
	
	public static List<String> fullJustify(String[] words, int maxWidth) 
	{
		List<String> result = new ArrayList<String>();
		int[] characterCount = new int[words.length];
		for(int i = 0;i<words.length;i++)
			characterCount[i] = words[i].length();
		
		//Group words
		int startingWordIndex = 0;
		int endingWordIndex = 0;
		int numberOfCharacters = 0;
		
		if(words.length==1)
		{
			add(result,0,0,words,maxWidth,true);
			return result;
		}
		
		for(int i = 0;i<words.length;i++)
		{
			numberOfCharacters += words[i].length();
			if(numberOfCharacters==maxWidth)
			{
				endingWordIndex = i;
				add(result,startingWordIndex,endingWordIndex,words,maxWidth,false);
				startingWordIndex = i+1;
				numberOfCharacters=0;
			}
			else if(numberOfCharacters<maxWidth)
			{
				numberOfCharacters++;
			}
			else
			{
				endingWordIndex = --i;
				add(result,startingWordIndex,endingWordIndex,words,maxWidth,false);
				startingWordIndex = i+1;
				numberOfCharacters=0;
			}
		}
		
		if(endingWordIndex!=words.length-1)
			add(result,startingWordIndex,(words.length)-1,words,maxWidth,true);
		
		return result;
    }
	
	public static void main(String[] args)
	{
		String str = "What must be acknowledgement shall yuyuyyi iuiuiui iuiu be";
		String[] words = str.split(" ");
		String[] words1 = {"a"};
		int maxWidth = 1;
		List<String> result = fullJustify(words1,maxWidth);
		for(String s:result)
			System.out.println(s);
		
	}
}