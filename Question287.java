/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 287

*/
/*

TestCases-



*/

import java.util.*;

public class Question287
{		
	public static int findDuplicate(int[] nums) 
	{
        HashSet set = new HashSet();
		for(int i :nums)
		{
			if(!set.add(i))
				return i;
		}
		return 1;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] array = {1,2,3,4,5,6,7,8,7};
		System.out.println("Duplicate number is : "+findDuplicate(array));
		
	}		
}
