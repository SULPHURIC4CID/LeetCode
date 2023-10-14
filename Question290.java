/*

Author: Ananthanarayanan R
Section: Algorithms
Question: 290

*/

public class Question290
{
	public static boolean wordPattern(String pattern, String s) 
	{
        String[] patternWords = new String[26];
		String[] words = s.split(" ");
		if(pattern.length()!=words.length)
			return false;
		for(int i = 0;i<pattern.length();i++)
		{
			if(patternWords[(int)pattern.charAt(i)-97] == null)
			{
				for(int j = 0;j<26;j++)
				{
					if(j!=(int)pattern.charAt(i)-97)
					{
						if(patternWords[j] != null)
						{
							if(patternWords[j].equals(words[i]))
								return false;
						}
					}
				}
					
				patternWords[(int)pattern.charAt(i)-97] = words[i];
			}
			else
			{
				if(!patternWords[(int)pattern.charAt(i)-97].equals(words[i]))
					return false;
			}
		}
		return true;
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String pattern = "aaaa";
		String s= "bb aa a bb";
		System.out.println(wordPattern(pattern,s));		
		System.out.println("Main Method ends");
	}
}