/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 171

*/

public class Question171
{
	//A = 65 : Z =90
	public static int titleToNumber(String columnTitle) 
	{
		int temp = 0;
		int val;
		int pow = 1;
		for(int j = columnTitle.length()-1;j>=0;j--)
		{
			val = (int)(columnTitle.charAt(j))-64;
			temp += val*(pow);
			pow*=26;
		}
		return temp;
    }

	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String title = "AA";
		System.out.println(titleToNumber(title));
	}
}
