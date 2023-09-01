/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 59

*/
/*

TestCases-


*/
public class Question59
{	
	public static void display(int[][] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int[][] generateMatrix(int n) 
	{
        int[][] arr = new int[n][n];
		int x = 0;
		int y = 0;
		int dir = 1;
		int val = 1;
		while(val<=(n*n))
		{
			arr[x][y] = val;
			//System.out.println("x: "+x+",y: "+y+" arr["+x+"]["+y+"]: "+arr[x][y]);
			/*
			System.out.println();
			System.out.println("Direction: "+dir);			
			System.out.println("y+1<=n-1 : "+((y+1)<=(n-1)));
			System.out.println(arr[x][y+1]);
			System.out.println();
			*/
			switch(dir)
			{
				case 1:
					if((y+1)<=(n-1) && arr[x][y+1] == 0)
					{
						y++;
						//System.out.println("Next element");
					}				
					else
					{
						dir=2;
						//System.out.println("Change Direction");
						x++;
					}
				break;
				case 2:
					if((x+1)<=(n-1) && arr[x+1][y] == 0)
					{
						x++;
						//System.out.println("Next element");
					}				
					else
					{
						dir=3;
						//System.out.println("Change Direction");
						y--;
					}
				break;
				case 3:
					if((y-1)>=0 && arr[x][y-1] == 0)
					{
						y--;
						//System.out.println("Next element");
					}				
					else
					{
						dir=4;
						//System.out.println("Change Direction");
						x--;
					}
				break;
				case 4:
					if((x-1)>=0 && arr[x-1][y] == 0)
					{
						x--;
						//System.out.println("Next element");
					}				
					else
					{
						dir=1;
						//System.out.println("Change Direction");
						y++;
					}
				break;
			}	
			val++;			
		}
		return arr;
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int n = 10;
		int[][] arr = generateMatrix(n);
		display(arr);
		
	}		
}
