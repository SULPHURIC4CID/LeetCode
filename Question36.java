/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 36

*/
/*

TestCases-


(0,0),(0,1),(0,2)	(0,3),(0,4),(0,5)	(0,6),(0,7),(0,8)
(1,0),(1,1),(1,2)	(1,3),(1,4),(1,5)	(1,6),(1,7),(1,8)
(2,0),(2,1),(2,2)	(2,3),(2,4),(2,5)	(2,6),(2,7),(2,8)

(3,0),(3,1),(3,2)	(3,3),(3,4),(3,5)	(3,6),(3,7),(3,8)
(4,0),(4,1),(4,2)	(4,3),(4,4),(4,5)	(4,6),(4,7),(4,8)
(5,0),(5,1),(5,2)	(5,3),(5,4),(5,5)	(5,6),(5,7),(5,8)

(6,0),(6,1),(6,2)	(6,3),(6,4),(6,5)	(6,6),(6,7),(6,8)
(7,0),(7,1),(7,2)	(7,3),(7,4),(7,5)	(7,6),(7,7),(7,8)
(8,0),(8,1),(8,2)	(8,3),(8,4),(8,5)	(8,6),(8,7),(8,8)




*/
public class Question36
{
	
	
	//49-57, range for 1-9 ASCII
	public static boolean check(String s)
	{
		System.out.println(s);
		int[] array = new int[9];
		for(int i=0;i<s.length();i++)
		{
			array[(int)(s.charAt(i))-49]++;
			if (array[(int)(s.charAt(i))-49] >1)
				return false;
		}
		return true;
		
	}
	
	public static boolean isValidSudoku(char[][] board)
	{
        int count=0;
		int i,j;
		String temp;		
		//Checking rows
		for(i=0;i<9;i++)
		{
			temp = "";
			for(j=0;j<9;j++)
			{
				if(board[i][j] != '.')
					temp+=board[i][j];
			}
			if(check(temp))
				count++;
		}		
		//Checking cols
		for(i=0;i<9;i++)
		{
			temp = "";
			for(j=0;j<9;j++)
			{
				if(board[j][i] != '.')
					temp+=board[j][i];
			}
			if(check(temp))
				count++;
		}		
		//Checking 3*3 boxes
		String[] test = {"","","","","","","","",""};
		test[0] = test[0] + board[0][0] + board[0][1]+board[0][2] + board[1][0] + board[1][1] + board[1][2] + board[2][0] + board[2][1] + board[2][2];
		test[1] = test[1] + board[0][3] + board[0][4]+board[0][5] + board[1][3] + board[1][4] + board[1][5] + board[2][3] + board[2][4] + board[2][5];
		test[2] = test[2] + board[0][6] + board[0][7]+board[0][8] + board[1][6] + board[1][7] + board[1][8] + board[2][6] + board[2][7] + board[2][8];
		
		test[3] = test[3] + board[3][0] + board[3][1]+board[3][2] + board[4][0] + board[4][1] + board[4][2] + board[5][0] + board[5][1] + board[5][2];
		test[4] = test[4] + board[3][3] + board[3][4]+board[3][5] + board[4][3] + board[4][4] + board[4][5] + board[5][3] + board[5][4] + board[5][5];
		test[5] = test[5] + board[3][6] + board[3][7]+board[3][8] + board[4][6] + board[4][7] + board[4][8] + board[5][6] + board[5][7] + board[5][8];
	
		test[6] = test[6] + board[6][0] + board[6][1]+board[6][2] + board[7][0] + board[7][1] + board[7][2] + board[8][0] + board[8][1] + board[8][2];
		test[7] = test[7] + board[6][3] + board[6][4]+board[6][5] + board[7][3] + board[7][4] + board[7][5] + board[8][3] + board[8][4] + board[8][5];
		test[8] = test[8] + board[6][6] + board[6][7]+board[6][8] + board[7][6] + board[7][7] + board[7][8] + board[8][6] + board[8][7] + board[8][8];
		
		for(i=0;i<9;i++)
		{
			test[i] = test[i].replace(".","");
			System.out.println(test[i]);
			
			if(check(test[i]))
				count++;			
		}
		if(count==27)
			return true;
		else
			return false;
		
		
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");	
		
		char[][] arr = {
			{'5','3','.','.','7','.','.','.','.'},
			{'6','.','.','1','9','5','.','.','.'},
			{'.','9','8','.','.','.','.','6','.'},
			{'8','.','.','.','6','.','.','.','3'},
			{'4','.','.','8','.','3','.','.','1'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','6','.','.','.','.','2','8','.'},
			{'.','.','.','4','1','9','.','.','5'},
			{'.','.','.','.','8','.','.','7','9'},
					   };
		
		/*
		for(int i =0;i<9;i++)
		{
			for(int j = 0;j<9;j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
		*/		
		
		System.out.println(isValidSudoku(arr));
		
		
	}		
}
