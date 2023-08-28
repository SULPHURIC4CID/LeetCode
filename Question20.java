/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 20

*/
/*

TestCases-



*/
public class Question20
{	
	public static boolean isValid(String s) 
	{
        char[] arr = new char[s.length()];
		int index = 0;
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
				arr[index++]= s.charAt(i);
			else
			{
				if(index==0)
					return false;
				index--;
				if(s.charAt(i) == ')' && arr[index] != '(')
					return false;
				else if(s.charAt(i) == '}' && arr[index] != '{')
					return false;
				else if(s.charAt(i) == ']' && arr[index] != '[')
					return false;
			}
		}
		if(index!=0)
			return false;
		return true;
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		System.out.println(isValid(")))}"));		
	}		
}
