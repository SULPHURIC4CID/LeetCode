/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 1768

Decription:





*/


public class Question1768
{
	public static String mergeAlternately(String word1, String word2) 
	{
		if(word1==null && word2==null)
			return null;
		if(word1==null && word2 !=null)
			return word2;
		if(word1!=null && word2==null)
			return word1;
		if(word1.isEmpty() && word2.isEmpty())
			return word1;
		if(word1.isEmpty() && !word2.isEmpty())
			return word2;
		if(!word1.isEmpty() && word2.isEmpty())
			return word1;
		int diff = Math.abs(word1.length()-word2.length());
		int min = Math.min(word1.length(),word2.length());
        StringBuilder sb = new StringBuilder();
		for(int i =0;i<min;i++)
		{
			sb.append(word1.charAt(i));
			sb.append(word2.charAt(i));
		}
		if(word1.length()>word2.length())
		{
			sb.append(word1.substring(min));
		}
		else
		{
			sb.append(word2.substring(min));
		}
		return sb.toString();
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String s1 = "abcd";
		String s2 = "pq";
		
		String s3 = mergeAlternately(s1,s2);
		System.out.println(s3);
		
	}	
		
}
