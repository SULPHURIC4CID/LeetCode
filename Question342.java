/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 342
*/

import java.util.*;

public class Question342
{
	public static boolean isPowerOfFour(int n) 
	{
		List<Integer> powers = new ArrayList<>();
		int number = 4;
		int value = 0;
		int curr = 1;
		
		while(curr>value)
		{
			powers.add(curr);
			value = curr;
			curr = curr*number;
		}
		System.out.println(powers);
		if(powers.indexOf(n)!=-1)
			return true;
		return false;
    }
	public static void main(String[] args)
	{
		boolean result = isPowerOfFour(256);
		System.out.println(result);
	}
}