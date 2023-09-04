/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 136

*/
/*

TestCases-


*/
public class Question136
{
	public int singleNumber(int[] nums) 
	{
		int i = 0;
		for(int j:nums)
			i=i^j;
		return i;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");	
		
	}		
}
