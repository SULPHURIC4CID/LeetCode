/*

Author : Ananthanarayanan R
Section : Algorithms

Question: 289
*/

import java.util.*;

public class Question289
{
	public static int getLiveNeighbours(int[][] board,int x,int y)
	{
		int liveCount = 0;
		
		//(x+1,y) check
		try{
			if(board[x+1][y] == 1)
				liveCount++;
		}
		catch(Exception e){
			//doNothing
		}
		
		//(x-1,y) check
		try{
			if(board[x-1][y] == 1)
				liveCount++;
		}
		catch(Exception e){
			//doNothing
		}
		
		//(x,y+1) check
		try{
			if(board[x][y+1] == 1)
				liveCount++;
		}
		catch(Exception e){
			//doNothing
		}
		
		//(x,y-1) check
		try{
			if(board[x][y-1] == 1)
				liveCount++;
		}
		catch(Exception e){
			//doNothing
		}
		
		//(x-1,y-1) check
		try{
			if(board[x-1][y-1] == 1)
				liveCount++;
		}
		catch(Exception e){
			//doNothing
		}
		
		//(x+1,y+1) check
		try{
			if(board[x+1][y+1] == 1)
				liveCount++;
		}
		catch(Exception e){
			//doNothing
		}
		
		//(x+1,y-1) check
		try{
			if(board[x+1][y-1] == 1)
				liveCount++;
		}
		catch(Exception e){
			//doNothing
		}
		
		//(x-1,y+1) check
		try{
			if(board[x-1][y+1] == 1)
				liveCount++;
		}
		catch(Exception e){
			//doNothing
		}
		return liveCount;
	}
	
	public static void gameOfLife(int[][] board) 
	{
        int[][] nextState = new int[board.length][board[0].length];
		
		for(int i = 0;i<board.length;i++)
		{
			for(int j = 0;j<board[0].length;j++)
			{
				if(board[i][j] == 1) //Processing live cells
				{
					int liveNeighbours = getLiveNeighbours(board,i,j);
					switch(liveNeighbours)
					{
						case 0:
						case 1:
							nextState[i][j] = 0;
							break;
						case 2:
						case 3:
							nextState[i][j] = 1;
							break;
						default:
							nextState[i][j] = 0;
							break;
					}
				}
				else //Processing dead cells
				{
					if(getLiveNeighbours(board,i,j) == 3)
					{
						nextState[i][j] = 1;
					}
					else
					{
						nextState[i][j] = 0;
					}
				}
			}
		}
		//setting new state
		for(int i = 0;i<board.length;i++)
			for(int j= 0;j<board[0].length;j++)
				board[i][j] = nextState[i][j];
    }
	
	public static void display(int[][] board)
	{
		System.out.println();
		System.out.println("-----------------------------");
		for(int i = 0;i<board.length;i++)
		{
			for(int j= 0;j<board[0].length;j++)
			{
				System.out.print(board[i][j]+ ",");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
		display(board);
		gameOfLife(board);
		display(board);
	}
}