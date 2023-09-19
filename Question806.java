/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 143

*/

public class Question143
{
	public static boolean checkStraightLine(int[][] coordinates) 
	{
		int num = (coordinates[1][1] - coordinates[0][1]);
		int den = (coordinates[1][0] - coordinates[0][0]);
		int num1,den1;
		for(int i = 2;i<coordinates.length;i++)
		{
			num1 = (coordinates[i][1] - coordinates[0][1]);
			den1 = (coordinates[i][0] - coordinates[0][0]);
			if(num1*den != den1*num)
				return false;
		}
		return true;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
	}		
}
