/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 151

*/

public class Question151
{
	public static String reverseWords(String s) 
	{
		String[] sa = s.trim().split(" ");
		String[] result = new String[sa.length];
		int index=0;
		for(String x:sa)
			if(!x.isEmpty())
				result[index++] = x;
		String[] temp = new String[index];
		for(int i = 0;i<index;i++)
			temp[i] = result[index-i-1];
		return String.join(" ",temp);
    }	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String s = "I love      Java";
		String res = reverseWords(s);
		System.out.println(res);
	}		
}
