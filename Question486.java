/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 486

Decription:





*/


public class Question486
{
	//{2,7,10,16,36,44,64,88,95}-> Value
	// 0 1 2  3  4  5  6  7  8  -> Index
	public static boolean predictTheWinner(int[] nums) 
	{
		if(nums.length==0)
			return true;
		if(nums.length==1 || nums.length == 2)
			return true;
        int i=0,j=nums.length-1;
		long player1 = 0;
		long player2 = 0;
		boolean turn = true;
		while(i<=j)
		{
			
			if(turn == true)
			{
				if(nums[i]>nums[j])
				{
					player1+=nums[i];
					i++;
				}
				else
				{
					player1+=nums[j];
					j--;
				}
				turn = false;
			}
			else
			{
				if(nums[i]>nums[j])
				{
					player2+=nums[i];
					i++;
				}
				else
				{
					player2+=nums[j];
					j--;
				}
				turn = true;
			}
			System.out.println(player1);
		System.out.println(player2);
		}
		
		if(player1>=player2)
			return true;
		else
			return false;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
	int[] arr = {1,5,233,7};
		boolean b = predictTheWinner(arr);
		System.out.println(b);
		
		
	}	
		
}
