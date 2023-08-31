/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 38

*/


public class Question38
{	
	public static StringBuilder expand (StringBuilder sb)
	{
		char ch = sb.charAt(0);
		int count = 1;
		StringBuilder sb1 = new StringBuilder();
		for(int i = 1;i<sb.length();i++)
		{
			//System.out.println(sb.charAt(i));
			if(sb.charAt(i) == ch)
			{
				count++;
			}
			else
			{
				sb1.append(count);
				sb1.append(ch);
				count = 1;
				ch = sb.charAt(i);
			}			
		}
		sb1.append(count);
		sb1.append(ch);
		//System.out.println(sb1.toString());
		return sb1;
	}
	
	public static String countAndSay(int n) 
	{
		n--;
		int i=0;
		StringBuilder sb = new StringBuilder();
		sb.append("1");
		//System.out.println(sb);
		//sb = expand(sb);
		
		while(i<n)
		{
			sb = expand(sb);	
			
			i++;
		}
		
		return sb.toString();
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int n;
		n= 3;
		System.out.println(countAndSay(n));
		
	}		
}
