
		
		
/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 292

*/
/*

TestCases-



*/

import java.util.*;

public class Question292
{		
	public static boolean canWinNim(int n) 
	{		
        if(n<4)
        return true;
        if(n>3)
        {
            if(n%4==0)
            return false;
            else
            return true;
        }
        return true;   
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] array = {1,2,3,4,5,6,7,8,7};
		System.out.println("Duplicate number is : "+findDuplicate(array));
		
	}		
}
