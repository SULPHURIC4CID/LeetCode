/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 45
*/

import java.util.*;

public class Question45
{
	
	public static void move(int position,int[] nums, int[] result, int jump, List<Integer> movement)
	{
		if(position>nums.length-1)
		{
			return;
		}
		else if(position == nums.length-1)
		{
			System.out.println("Jump : "+jump);
			System.out.println("Movement : "+movement);
			if(jump<result[0])
				result[0] = jump;
			return;			
		}
		else
		{
			if(nums[position] != 0)									
				for(int j = 1;j<=nums[position];j++)
				{
					position += j;					
					movement.add(position);
					jump++;
					move(position,nums,result,jump,movement);
					position-=j;
					movement.remove(movement.size()-1);
					jump--;
				}
		}
	}
	
	public static int jump(int[] nums) 
	{
		if(nums.length==1)
			return 0;
        int position = 0;
		int[] result = {Integer.MAX_VALUE};
		int jump = 0;
		List<Integer> movement = new ArrayList<>();
		
		//Starting from o position
		movement.add(0);
		
		for(int j = 1;j<=nums[0];j++)
		{
			position += j;
			movement.add(position);
			jump++;
			move(position,nums,result,jump,movement);
			position-=j;
			movement.remove(movement.size()-1);
			jump--;
		}
		return result[0];
    }
	
	public static void main(String[] args)
	{
		int[] nums = {2,3,1,1,4};
		int result = jump(nums);
		System.out.println("Result : "+result);
	}
}