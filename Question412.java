/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 412
*/

import java.util.*;

public class Question412
{
	public static List<String> fizzBuzz(int n)
	{
		List<String> result = new ArrayList<>();
		String temp = null;
		for(int i = 1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
				temp ="FizzBuzz";			
			else if(i%3==0)
				temp = "Fizz";
			else if(i%5==0)
				temp = "Buzz";
			else
				temp = ""+i;
			result.add(temp);
		}
        return result;
    }
	
	public static void main(String[] args)
	{
		int n = 15;
		List<String> result = fizzBuzz(n);
		System.out.println(result);
	}
}