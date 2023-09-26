/*

Author: Ananthanarayanan R
Section: Algorthms
Question: 2114

*/

public class Question2114
{
	public static int wordCount(String sentence)
	{
		int wordCount = 0;
		for(int i = 0;i<sentence.length();i++)
		{
			if(sentence.charAt(i) == ' ')
				wordCount++;
			
		}
		return wordCount+1;
	}
	public static int mostWordsFound(String[] sentences) 
	{
		int maxCount = 0;
        for(int i = 0;i<sentences.length;i++)
		{
			if(wordCount(sentences[i])>maxCount)
				maxCount = wordCount(sentences[i]);
		}
		return maxCount;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
	}
}
