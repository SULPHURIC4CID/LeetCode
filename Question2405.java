/*

Author: Ananthanarayanan R
Section: Algorithms
Question: 2405

*/

import java.util.*;

public class Question2405
{
	public static int partitionString(String s) 
	{
		List<String> result = new ArrayList<>();
		for(int i = 0;i<s.length();i++)
		{
			int count = 0;
			if(result.size()==0)
				result.add(""+s.charAt(i));
			else
			{
				//check if result(result.size()-1).contains(s.charAt(i))
				if(result.get(result.size()-1).contains(""+s.charAt(i))) // if present
				{
					result.add(""+s.charAt(i));
				}
				else
				{
					String temp = result.get(result.size()-1);
					temp+=s.charAt(i);
					result.remove(result.size()-1);
					result.add(temp);					
				}
			}
		}
		System.out.println(result);
		return result.size();
    }
	
	public static void main(String[] args)
	{
		String s = "hdklqkcssgxlvehva";
		int result = partitionString(s);
		System.out.println(result);
	}
}