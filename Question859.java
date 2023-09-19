/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 859

*/

public class Question859
{
	public static boolean compare(char[] a,char[] b)
	{
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}
	
	public static boolean buddyStrings(String s, String goal)
	{
		if(s.length()!=goal.length())
			return false;
        char[] ca = s.toCharArray();
		char[] ca1 = goal.toCharArray();
		int i,j;
		for(i=0;i<ca.length;i++)
		{
			for(j=0;j<ca.length;j++)
			{
				if(i!=j)
				{
					ca[i] = (char)(ca[i] ^ ca[j]);
					ca[j] = (char)(ca[i] ^ ca[j]);
					ca[i] = (char)(ca[i] ^ ca[j]);
					if(compare(ca,ca1))
					{
						return true;
					}
					else
					{
						ca[i] = (char)(ca[i] ^ ca[j]);
						ca[j] = (char)(ca[i] ^ ca[j]);
						ca[i] = (char)(ca[i] ^ ca[j]);
					}
				}
			}
		}
		return false;		
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String s1 = "abcd";
		String s2 = "dcba";
		System.out.println(buddyStrings(s1,s2));
	}
}

