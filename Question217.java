/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 217

*/
/*

TestCases-


*/
public class Question217
{
	public static boolean containsDuplicate(int[] nums) 
	{
        String s = "";
		for(int i =0;i<nums.length;i++)
		{
			if(s.contains(" "+nums[i]))
				return true;
			else
				s=s+" "+nums[i];
		}
		return false;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] arr = {1,2,3,4,5,5};
		System.out.println(containsDuplicate(arr));		
	}		
}
