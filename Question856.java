/*

Author: Ananthanarayanan R
Section: Algorithms
Question: 856

*/

import java.util.*;

public class Question856
{
	
	
	public static int scoreOfParentheses(String s) 
	{
		/*
		Pseudo Code-
		1. Convert string to stringBuilder
		2. Convert all () to 1.
		3. Convert all (A) to 2*A.
		4. Keep repeating step 3 till there are no (A).
		5. Convert all AB to A+B.
		6. Keep repeating step 5 till there are no AB.
		7. Repeat step 3 till result has no paranthesis.
		8. Return result.
		*/
        StringBuilder sb = new StringBuilder(s);
		int comma = 1;
		while(comma<sb.length()+1)
		{
			sb.insert(comma,',');
			comma+=2;
		}
		
		
		boolean flag;	
		int index = 0;	
		
		while(index<sb.length()) // Converting all () to 1
		{
			flag = false;
			if(sb.charAt(index) == '(' && sb.charAt(index+1) == ',' && sb.charAt(index+2) == ')')
			{
				flag = true;
				sb.deleteCharAt(index+2);
				sb.deleteCharAt(index+1);
				sb.deleteCharAt(index);
				sb.insert(index,1);
				
			}
			if(!flag)
				index++;				
		}
		String[] segments = sb.toString().split(",");
		
		while(segments.length>1)
		{
			// Processing AB => A+B
			index = 0;
			while(index<segments.length)
			{
				flag = false;
				try{
					int val1 = Integer.parseInt(segments[index]);
					int val2 = Integer.parseInt(segments[index+1]);
					String temp = "";
					for(int i = 0;i<segments.length;i++)
					{
						if(i==index)
						{
							temp+=(val1+val2);
							temp+=",";
						}
						else if(i==index+1)
						{
							//do nothing
						}
						else
						{
							temp+=segments[i];
							temp+=",";
						}
						
					}
					//System.out.println("TEMP : "+temp);
					segments = temp.split(",");
					flag = true;
					
				}catch(Exception e)
				{
					//do nothing
				}
				if(!flag)
					index++;
			}
			//Processing (A) => 2*A
			index = 0;
			while(index<segments.length)
			{
				flag = false;
				try{
					if(segments[index].equals("(") && segments[index+2].equals(")"))
					{
						String temp = "";
						int val = Integer.parseInt(segments[index+1]);
						for(int i = 0;i<segments.length;i++)
						{
							if(i==index)
							{
								temp+=(2*val);
								temp+=",";
							}
							else if(i==index+1 || i == index+2)
							{
								//do nothing
							}						
							else
							{
								temp+=segments[i];
								temp+=",";
							}
						}
						//System.out.println("TEMP1 : "+temp);
						segments = temp.split(",");
						flag = true;
					}
					
				}catch(Exception e){
					//do nothing
				}
				if(!flag)
					index++;
				
			}
		}
		return Integer.parseInt(segments[0]);
    }
	
	public static void main(String[] args)
	{
		String s = "((()))()(())()()()()()()()()()()()()((()()))";
		int result = scoreOfParentheses(s);
		System.out.println("Result : "+result);
	}
}