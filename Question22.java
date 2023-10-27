/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 22
*/

import java.util.*;

public class Question22
{	
	public static boolean validate(String s)
	{
		int count = 0;
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) == '(')
				count++;
			else
				count--;
			if(count<0)
				return false;
		}
		if(count!=0)
			return false;
		return true;
	}
	
	public static void next(StringBuilder sb, List<String> result,int n)
	{
		if(sb.length() == 2*n)
		{
			//System.out.println(sb);
			if(validate(sb.toString()))
				result.add(sb.toString());
		}
		else
		{
			sb.append('(');
			next(sb,result,n);
			sb.deleteCharAt(sb.length()-1);	
			sb.append(')');
			next(sb,result,n);
			sb.deleteCharAt(sb.length()-1);			
		}
	}
	
	public static List<String> generateParenthesis(int n) 
	{
		List<String> result = new ArrayList<>();
		char[] options = {'(',')'};
		StringBuilder sb = new StringBuilder();
		
		
		sb.append('(');
		next(sb,result,n);
		sb.deleteCharAt(sb.length()-1);
		sb.append(')');
		next(sb,result,n);
		sb.deleteCharAt(sb.length()-1);
		
        return result;
    }
	
	public static void main(String[] args)
	{
		int n = 3;
		List<String> result = generateParenthesis(n);
		System.out.println(result);
	}
}