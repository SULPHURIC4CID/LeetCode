/*

Author: Ananthanarayanan R
Section: Algorithms
Question: 11

Description: Pascals Triangle 2

*/

public class Question119
{
	public static int[] generate(int numRows)
	{
		int[][] result = new int[numRows][];
		int[] temp = {1};
		result[0] = temp;
		if(numRows == 1)
			return temp;
		for(int i = 2;i<=numRows;i++)
		{
			temp = new int[i];
			for(int j = 0;j<i;j++)
			{
				if(j==0)
					temp[j] = 1;
				else if(j==i-1)
					temp[j] = 1;
				else
					temp[j] = result[i-2][j-1] + result[i-2][j];
			}
			result[i-1] = temp;
		}		
		return result[numRows-1];
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main method starts");
		int numRows = 5;
		int[] result = generate(numRows);
		Array.display(result);
	}
}