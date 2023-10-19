/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 227


*/
import java.util.*;

public class Question227
{
	
	public static int getValues(StringBuilder sb, int i)
	{
		char operation = sb.charAt(i);
		int[] result = new int[2];
		int leftIndex=i-1;
		int rightIndex=i+1;
		StringBuilder left = new StringBuilder();
		StringBuilder right = new StringBuilder();
		while(sb.charAt(leftIndex)>='0' && sb.charAt(leftIndex)<='9')
		{
			left.append(sb.charAt(leftIndex));
			if(leftIndex-1<0)
			{
				leftIndex--;
				break;
			}
			else
				leftIndex--;
		}
		left.reverse();
		while(sb.charAt(rightIndex)>='0' && sb.charAt(rightIndex)<='9')
		{
			right.append(sb.charAt(rightIndex));
			if(rightIndex+1==sb.length())
			{
				rightIndex++;
				break;
			}
			else
				rightIndex++;
		}
		result[0] = Integer.parseInt(left.toString());
		result[1] = Integer.parseInt(right.toString());
		for(int j = leftIndex+1;j<rightIndex;j++)
			sb.deleteCharAt(leftIndex+1);
		
		int operationResult=0;
		switch(operation)
		{
			case '/':
				operationResult = result[0]/result[1];
				break;			
			case '*':
				operationResult = result[0]*result[1];
				break;			
			case '+':
				operationResult = result[0]+result[1];
				break;				
			case '-':
				operationResult = result[0]-result[1];
				break;				
			default:
				break;				
		}
		sb.insert(leftIndex+1,""+operationResult);
		return leftIndex+(""+operationResult).length();
		
	}
	public static int calculate(String s) 
	{
        //Remove Spaces if any
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
				sb.append(s.charAt(i));
		}
		
		//Resolve Division and Multiplication if any	
		for(int i = 0;i<sb.length();i++)
		{
			//Find '/' and '*' character
			if(sb.charAt(i) == '/' || sb.charAt(i) == '*')
			{
				int newIndex = getValues(sb,i);
				i = newIndex;
			}
		}		
		
		String[] subtasks = sb.toString().split("\\+");
		int bigSum = 0;
		//Resolve each subtask
		for (int i = 0;i<subtasks.length;i++)
		{
			String[] numbers = subtasks[i].split("\\-");
			int[] nums = new int[numbers.length];
			int sum = 0;
			for(int j = 0;j<numbers.length;j++)
			{
				nums[j] = Integer.parseInt(numbers[j]);
				if(j>0)
					sum+=nums[j];
			}
			bigSum+=(nums[0]-sum);
		}
		return bigSum;
    }
	
	public static void main(String[] args)
	{
		String s = "2-3+4";
		int result = calculate(s);
		System.out.println("Result : "+result);
	}
}