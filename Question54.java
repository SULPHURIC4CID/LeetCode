/*

Author: Anantha Narayanan R

Section: Algorithms
Question: 54
*/

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Question54
{
	
	public static List<Integer> spiralOrder(int[][] matrix) 
	{
        int[][] temp = new int[matrix.length][matrix[0].length];
		for(int i = 0;i<matrix.length;i++)
			for(int j = 0;j<matrix[0].length;j++)
				temp[i][j] = 1;
		List<Integer> result = new ArrayList<Integer>();
		int r=0,c=0;
		int count = 0;
		int direction = 0; //0-right,1-down,2-left,3-top
		//System.out.println("Matrix.length : "+matrix.length+" matrix[0].length : "+matrix[0].length);
		while(count<matrix.length*matrix[0].length)
		{
			//System.out.println("R: "+r+" C: "+c+" direction : "+direction);
			result.add(matrix[r][c]);
			temp[r][c] = 0;
			switch(direction)
			{
				case 0:
					if(c+1<matrix[0].length)
					{
						
						if(temp[r][c+1]==1)
						{
							//System.out.println("Hello");
							c++;
						}		
						else						
						{
							r++;
							direction=1;
						}
					}
					else
					{
						r++;
						direction=1;
					}
					break;
				case 1:
					if(r+1<matrix.length)
					{
						if(temp[r+1][c]==1)
						{
							r++;
						}		
						else						
						{
							c--;
							direction=2;
						}
					}
					else
					{
						c--;;
						direction=2;
					}
					break;
				case 2:
					if(c-1>=0)
					{
						if(temp[r][c-1]==1)
						{
							c--;
						}		
						else						
						{
							r--;
							direction=3;
						}
					}
					else
					{
						r--;
						direction=3;
					}
					break;
				case 3:
					if(r-1>=0)
					{
						if(temp[r-1][c]==1)
						{
							r--;
						}		
						else						
						{
							c++;
							direction=0;
						}
					}
					else
					{
						c++;
						direction=0;
					}
					break;
			}
			count++;
			//System.out.println("Resulkt : "+result);
		}
		//System.out.println(count);
		return result;
			
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[][] matrix = Matrix.generate(5,6,true);
		Matrix.display(matrix);
		List<Integer> result = spiralOrder(matrix);
		System.out.println(result);
	}
}