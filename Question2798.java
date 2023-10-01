/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 2798

*/
/*

TestCases-


*/
public class Question2798
{
	public static int numberOfEmployeesWhoMetTarget(int[] hours, int target)
	{
        int count = 0;
		for(int h:hours)
		{
			if(h>=target)
				count++;
		}
		return count;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int n = 20;
		int[] hours = new int[n];
		int target = 0;
		int b = numberOfEmployeesWhoMetTarget(hours,target);
		System.out.println(b);
		
	}		
}
