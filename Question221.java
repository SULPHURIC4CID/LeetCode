/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 221
*/

import java.util.*;

public class Question221
{
	public static int maximalSquare(char[][] matrix) 
	{
		int area = 0;
		int limit = Math.min(matrix.length,matrix[0].length);
		for(int i = 0;i<limit;i++)
		{
			System.out.println(i);
			//Define a Square
			for(int row = 0;row<matrix.length;row++)
			{
				for(int col = 0;col<matrix.length;col++)
				{
					
				}
			}
			
		}
        return 1;
    }
	
	public static void display(char[][] matrix)
	{
		for(int i = 0;i<matrix.length;i++)
		{
			for(int j = 0;j<matrix[0].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		display(matrix);		
	}
}
