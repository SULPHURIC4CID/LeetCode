/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 17
*/

import java.util.*;

public class Question17
{
	public static void store(List<String> result, String digits, int index, String[] digitCharacters, StringBuilder sb)
	{
		if(index>digits.length()-1)
			result.add(sb.toString());
		else
		{
			int pos = Integer.parseInt(digits.charAt(index)+"");
			for(int i = 0;i<digitCharacters[pos].length();i++)
			{
				sb.append(digitCharacters[pos].charAt(i));
				index++;
				store(result,digits,index,digitCharacters,sb);
				index--;
				sb.deleteCharAt(sb.length()-1);
			}
		}
	}
	
	public static List<String> letterCombinations(String digits) 
	{
		//Declaring the result List
        List<String> result = new ArrayList<>();
		
		//Single case
		if(digits.equals(""))
			return result;
		
		//Storing the phone chatracters
		String[] digitCharacters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		
		//Store character in result list
		int index = 0;
		StringBuilder sb = new StringBuilder();
		store(result,digits,index,digitCharacters,sb);
		
		return result;		
    }
	
	public static void main(String[] args)
	{
		String digits = "23";
		List<String> result = letterCombinations(digits);
		System.out.println(result);
	}
}