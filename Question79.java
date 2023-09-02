/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 79

*/
/*

TestCases-


*/
public class Question79
{
	public static void display(boolean[][] matrix)
	{
		for(int i =0;i<matrix.length;i++)
		{
			for(int j = 0;j<matrix[0].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static boolean exist(char[][] board, String word) 
	{
		boolean[][] possible = new boolean[board.length][board[0].length];
		boolean[][] top = new boolean[board.length][board[0].length];
		boolean[][] right = new boolean[board.length][board[0].length];
		boolean[][] bottom = new boolean[board.length][board[0].length];
		boolean[][] left = new boolean[board.length][board[0].length];
		
		//Initialising all matrices
		for(int i =0;i<board.length;i++)
			for(int j=0;j<board[0].length;j++)
			{
				possible[i][j] = true;
				top[i][j] = false;
				right[i][j] = false;
				bottom[i][j] = false;
				left[i][j] = false;
			}

		//Re-Initialising top matrix
		for(int i =1;i<board.length;i++)
			for(int j=0;j<board[0].length;j++)
				top[i][j] = true;
			
		//Re-Initialising right matrix
		for(int i =0;i<board.length;i++)
			for(int j=0;j<board[0].length-1;j++)
				right[i][j] = true;
			
		//Re-Initialising bottom matrix
		for(int i =0;i<board.length-1;i++)
			for(int j=0;j<board[0].length;j++)
				bottom[i][j] = true;
			
		//Re-Initialising left matrix
		for(int i =0;i<board.length;i++)
			for(int j=1;j<board[0].length;j++)
				left[i][j] = true;
		
		display(possible);
		display(top);
		display(right);
		display(bottom);
		display(left);
		
		
		
		
		for(int i =0;i<board.length;i++)
		{
			for(int j =0;j<board[0].length;j++)
			{
				
			}
		}
		
        return true;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String s = "ABCESFCSADEE";
		String word = "SEED";
		char[][] array = new char[3][4];
		int index= 0;
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<4;j++)
			{
				array[i][j] = s.charAt(index++);
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		exist(array,word);
		
	}		
}
