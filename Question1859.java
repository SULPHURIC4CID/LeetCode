/*

Author: Ananthanarayanan R
Section: Algorthms
Question: 1859

*/

public class Question1859
{
	public static String sortSentence(String s)
	{
		int count =0 ;
		int start = 0;
		for(int i =0;i<s.length();i++)
			if(s.charAt(i)==' ')
				count++;
		String[] word = new String[count+1];
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				word[(int)(s.charAt(i-1)-49)] = s.substring(start,i-1);
				start = i+1;
			}
		}
		word[(int)s.charAt(s.length()-1)-49] = s.substring(start,s.length()-1);
		s= "";
		for(int i = 0;i<word.length;i++)
		{
			s = s+word[i];
			if(i!=word.length-1)
				s+=' ';
		}
		return s;
	}
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String s = "is2 sentence4 This1 a3";
		String result = sortSentence(s);
		System.out.println(result);
		
	}
}
