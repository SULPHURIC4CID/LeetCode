/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 74

*/
/*

TestCases-



*/
public class Question74
{	
	public static int[] convert(int n,int col)
	{
		int[] result = new int[2];
		result[0] = n/col;
		result[1] = n%col;
		return result;
	}
	
	
	public static boolean searchMatrix(int[][] matrix, int target) 
	{
		//Failure cases
		if(matrix == null)
			return false;
		for(int i = 0;i<matrix.length;i++)
			if(matrix[i] == null)
				return false;
		
        int m, n;
		m = matrix.length;
		n = matrix[0].length
		
		int start = 0;
		int end = m*n-1;
		int mid = (start+end)/2;
		int x=0,y=0;
		while(start<=end)
		{
			mid =(start+end)/2;
			x = convert(mid,n)[0];
			y = convert(mid,n)[1];
			if(matrix[x][y] == target)
				return true;
			else
			{
				if(matrix[x][y]<target)
					start = x*n+y+1;
				else
					end = x*n+y-1;
			}
		}
		return false;		
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[][] matrix = new int[1][1];
		matrix[0][0] = 1;
		System.out.println(searchMatrix(matrix,1));
	}		
}
