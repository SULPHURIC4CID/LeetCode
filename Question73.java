/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 73
*/

import java.util.*;

public class Question73
{
	public static void setZeroes(int[][] matrix) 
	{
        Set<Integer> rowSet = new HashSet<>();
		Set<Integer> colSet = new HashSet<>();
		
		for(int i = 0;i<matrix.length;i++)
		{
			for(int j = 0;j<matrix[0].length;j++)
			{
				if(matrix[i][j] == 0)
				{			
					rowSet.add(i);
					colSet.add(j);
				}
			}
		}
		//Making all rows in rowSet to 0
		for(int row : rowSet)
			for(int i = 0;i<matrix[0].length;i++)
				matrix[row][i] = 0;
		
		//Making all cols in colset to 0
		for(int col:colSet)
			for(int i = 0;i<matrix.length;i++)
				matrix[i][col] = 0;		
    }
	
	public static void main(String[] args)
	{
		int[][] matrix = Matrix.generate(7,8,false);
		matrix[3][3] = 0;
		matrix[2][1] = 0;
		Matrix.display(matrix);
		setZeroes(matrix);
		Matrix.display(matrix);
	}
}