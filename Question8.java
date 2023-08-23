/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 8

*/
/*

TestCases-



*/
public class Question8
{		
	public static int myAtoi(String s) 
	{
		s = s.trim();
		//System.out.println(s);
		char ch = '+';
		boolean flag = true;
		if (s.length()>0 && (s.charAt(0) == '+' ||s.charAt(0) == '-'))
		{
			ch = s.charAt(0);
			flag = false;
		}
		//System.out.println(ch);
		//System.out.println(flag);
		long temp = 0;
		int i,j=0;
		if(!flag)
			j=1;
		for(i=j;i<s.length();i++)
		{
			//System.out.println(s.charAt(i));
			//System.out.println((int)s.charAt(i));
			//System.out.println(temp);
			if((int)s.charAt(i) >= 48 && (int)s.charAt(i)<=57)
			{
				temp = (temp*10)+((int)(s.charAt(i))-48);
				//System.out.println(temp);
				if(temp>(long)Integer.MAX_VALUE && ch=='+')
					return Integer.MAX_VALUE;
				if(temp==((long)Integer.MAX_VALUE+1) && ch=='-')
					return Integer.MIN_VALUE;
				if(temp>((long)Integer.MAX_VALUE+1) && ch=='-')
					return Integer.MIN_VALUE;
				//System.out.println(temp);
					
			}
			else
				break;
		}
		if(ch=='-')
			temp=-temp;
		return (int)temp;
		
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		System.out.println(myAtoi("-42"));
	}		
}
