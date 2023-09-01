/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 67

*/
/*

TestCases-


*/
public class Question67
{
	
	public static String addBinary(String a, String b)
	{
		String t = "";
		int i;
		int diff = a.length()-b.length();
		if (diff<0)
			diff=-diff;
		for(i=0;i<diff;i++)
			t+="0";
		if(a.length()<b.length())
			a = t + a;
		else if(a.length()>b.length())
			b = t+b;
		
		
        
		char[] temp = new char[a.length()];
		char carry  = '0';
		for(i=a.length()-1;i>=0;i--)
		{
			if(a.charAt(i) == '0' && b.charAt(i)== '0' && carry == '0')
			{
				temp[i] = '0';
				carry = '0';				
			}
			else if(a.charAt(i) == '0' && b.charAt(i)== '0' && carry == '1')
			{
				temp[i] = '1';
				carry = '0';				
			}
			else if(a.charAt(i) == '0' && b.charAt(i)== '1' && carry == '0')
			{
				temp[i] = '1';
				carry = '0';				
			}
			else if(a.charAt(i) == '0' && b.charAt(i)== '1' && carry == '1')
			{
				temp[i] = '0';
				carry = '1';				
			}
			else if(a.charAt(i) == '1' && b.charAt(i)== '0' && carry == '0')
			{
				temp[i] = '1';
				carry = '0';				
			}
			else if(a.charAt(i) == '1' && b.charAt(i)== '0' && carry == '1')
			{
				temp[i] = '0';
				carry = '1';				
			}
			else if(a.charAt(i) == '1' && b.charAt(i)== '1' && carry == '0')
			{
				temp[i] = '0';
				carry = '1';				
			}
			else if(a.charAt(i) == '1' && b.charAt(i)== '1' && carry == '1')
			{
				temp[i] = '1';
				carry = '1';		
			}			
		}
		String s1 = new String(temp);
		if(carry=='1')
			return carry+s1;
		return s1;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		
		String s1 = "101111";
		String s2 = "1";
		System.out.println(addBinary(s1,s2));
		
	}		
}
