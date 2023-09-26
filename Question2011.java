/*

Author: Ananthanarayanan R
Section: Algorthms
Question: 2011

*/

public class Question2011
{
	public static int finalValueAfterOperations(String[] operations) 
	{
		int x = 0;
        for(int i = 0;i<operations.length;i++)
		{
			if(operations[i].charAt(0) == '+' || operations[i].charAt(operations[i].length()-1) == '+')
				x++;
			else
				x--;
		}
		return x;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String[] operations = {"++x","--x","x--","x++","x++"};
		int result = finalValueAfterOperations(operations);
		System.out.println(result);
	}
}
