/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 191

*/
/*

TestCases-


*/
public class Question191
{
	public static int hammingWeight(int n) 
	{
		int count=0;
		for(int i =0;i<32;i++)
		{
			if((n&1)==1)
				count++;
			n=n>>1;
		}
		return count;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		System.out.println(hammingWeight(-1));				
	}		
}
