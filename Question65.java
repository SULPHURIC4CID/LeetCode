/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 65

*/
/*

Details:

*************************
*	Symbol	*	ASCII	*
*************************
*	+		*	43		*
*************************
*	-		*	45		*
*************************
*	0-9		*	48-57	*
*************************
*	.		*	46		*
*************************
*	e		*	101		*
*************************


*/


public class Question65
{	
	public static boolean isDecimal(String s)
	{
		//Checking for null or empty string
		if(s==null || s.isEmpty())
			return false;
		System.out.println("Decimal Check 1 passed");
		
		if(s.length()==1)
			switch(s.charAt(0))
			{
				case '+':
				case '-':
				case '.':
					return false;
				default:
					break;
			}
		
		//Checking if the string has any not alloweed characters
		for(int i = 0;i<s.length();i++)
			switch((int)s.charAt(i))
			{
				case 43: // +
				case 45: // -
				case 46: // .
				case 48: // 0
				case 49: // 1
				case 50: // 2
				case 51: // 3
				case 52: // 4
				case 53: // 5
				case 54: // 6
				case 55: // 7
				case 56: // 8
				case 57: // 9
					break;
				default:
					return false;
			}
		System.out.println("Decimal  Check 2 passed");
		//Checking if string contains only 1 '+' or '-'sign at the beginning
		System.out.println("The string s is : "+s);
		if(s.indexOf('+')>=0)
		{
			if(s.indexOf('+') != 0)
				return false;
			else
				if(s.indexOf('+') != s.lastIndexOf('+'))
					return false;
				else
					s = s.substring(1);
			System.out.println("Decimal Check 3 passed");
		}		
		else if(s.indexOf('-')>=0)
		{
			if(s.indexOf('-') != 0)
				return false;
			else
				if(s.indexOf('-') != s.lastIndexOf('-'))
					return false;
				else
					s = s.substring(1);
			System.out.println("Decimal Check 4 passed");
		}
		
		//Modifying string s		
		//s = s.substring(1);
		
		//Checking if the string has any not alloweed characters
		for(int i = 0;i<s.length();i++)
			switch((int)s.charAt(i))
			{
				case 46: // .
				case 48: // 0
				case 49: // 1
				case 50: // 2
				case 51: // 3
				case 52: // 4
				case 53: // 5
				case 54: // 6
				case 55: // 7
				case 56: // 8
				case 57: // 9
					break;
				default:
					return false;
			}
		
		
		
		//Checking for one decimal point in the string
		System.out.println("First Index of . : "+s.indexOf('.'));
		System.out.println("Last Index of . : "+s.lastIndexOf('.'));
		if(s.indexOf('.')>=0)
			if(s.indexOf('.')!= s.lastIndexOf('.'))
				return false;
		System.out.println("Decimal Check 5 passed");
		
		//Checking if the decimal is not the only character in the string
		if(s.length()==1 && s.charAt(0)=='.')
			return false;
		System.out.println("Decimal Check 6 passed");
		
		
		//If all failure cases are checked then return true
		return true;
	}
	
	
	public static boolean isInteger(String s)
	{
		//Checking for null or empty string
		if(s==null || s.isEmpty())
			return false;
		System.out.println("Integer Check 1 passed");
		
		System.out.println("The string in integer check is : "+s);
		
		if(s.length()==1)
			switch(s.charAt(0))
			{
				case '+':
				case '-':
					return false;
				default:
					break;
			}
		
		//Checking if the string has any not alloweed characters
		for(int i = 0;i<s.length();i++)
			switch((int)s.charAt(i))
			{
				case 43: // +
				case 45: // -
				case 48: // 0
				case 49: // 1
				case 50: // 2
				case 51: // 3
				case 52: // 4
				case 53: // 5
				case 54: // 6
				case 55: // 7
				case 56: // 8
				case 57: // 9
					break;
				default:
					return false;
			}
		System.out.println("Integer Check 2 passed");
		//Checking if string contains only 1 '+' or '-'sign at the beginning
		if(s.indexOf('+')>=0)
			if(s.indexOf('+') != 0)
				return false;
			else
				if(s.indexOf('+') != s.lastIndexOf('+'))
					return false;
		System.out.println("Integer Check 3 passed");
		
		if(s.indexOf('-')>=0)
			if(s.indexOf('-') != 0)
				return false;
			else
				if(s.indexOf('-') != s.lastIndexOf('-'))
					return false;
		System.out.println("Integer Check 4 passed");
		
		return true;
	}
	
	public static boolean isNumber(String s) 
	{
		//Failure case
		if(s==null || s.isEmpty())
			return false;
		System.out.println("Number Check 1 passed");
		
		//Converting to lower case
		s = s.toLowerCase();
		
		//Checking if the string has any not alloweed characters
		for(int i = 0;i<s.length();i++)
			switch((int)s.charAt(i))
			{
				case 43: // +
				case 45: // -
				case 46: // .
				case 48: // 0
				case 49: // 1
				case 50: // 2
				case 51: // 3
				case 52: // 4
				case 53: // 5
				case 54: // 6
				case 55: // 7
				case 56: // 8
				case 57: // 9
				case 101: // e
					break;
				default:
					return false;
			}
		System.out.println("Number Check 2 passed");
		//Checking single case of only '+,'-','.','e'
		if(s.length()==1)
			switch(s.charAt(0))
			{
				case '+':
				case '-':
				case '.':
				case 'e':
					return false;
				default:
					break;
			}
		System.out.println("Number Check 3 passed");
		
		
		
		
		//If e is present in the string
		if(s.indexOf('e')>=0)
		{
			//Checking for multiple e's
			if(s.indexOf('e') != s.lastIndexOf('e'))
				return false;
			else
			{
				if(s.indexOf('e')==0 || s.indexOf('e') == s.length()-1)
					return false;
				else
				{
					//before e - s.substring(0,s.indexOf('e'));
					//after e  - s.substring(s.indexOf('e')+1);
					System.out.println("First substring : "+s.substring(0,s.indexOf('e')));
					System.out.println("Second substring: "+s.substring(s.indexOf('e')+1));
					if((isDecimal(s.substring(0,s.indexOf('e'))) || isInteger(s.substring(0,s.indexOf('e')))) && isInteger(s.substring(s.indexOf('e')+1)))      
						return true;
					else
						return false;
				}
			}
		}
		
		//If string s is integer
		if(isInteger(s))
			return true;
		
		//If string s is decimal
		if(isDecimal(s))
			return true;		
		
		
		System.out.println("Number Check 4 passed");
		
		return false;
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String s = "+E3";
		System.out.println("The string is : "+s);
		System.out.println(isNumber(s));
		
	}
}
