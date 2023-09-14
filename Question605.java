/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 605

*/
/*

TestCases-


*/
public class Question605
{	
	public static boolean canPlaceFlowers(int[] flowerbed, int n) 
	{
		int i;
		if(flowerbed.length==0)
			return false;
		if(flowerbed.length == 1)
			if(n==1 && flowerbed[0] == 0)
				return true;
			else if(n==0)
				return true;
			else
				return false;
			
        for(i=0;i<flowerbed.length;i++)
		{
			if(i==0)
			{
				if(flowerbed[i]==0 && flowerbed[i+1]!=1)
				{
					flowerbed[i] = 1;
					if(flowerbed[i+1] == 0)
						flowerbed[i+1] = 2;
					n--;
				}
			}
			else if(i==flowerbed.length-1)
			{
				if(flowerbed[i-1]!=1 && flowerbed[i] == 0)
				{
					flowerbed[i] = 1;
					n--;
				}
			}
			else
			{
				if(flowerbed[i]==0 && flowerbed[i-1]!=1 && flowerbed[i+1]!=1)
				{
					flowerbed[i] = 1;
					if(flowerbed[i+1]==0)
						flowerbed[i+1] = 2;
					n--;
				}
			}			
		}
		if(n<=0)
			return true;
		else
			return false;
			
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] arr = {0};
		int n = 2;
		for(int i =0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println("n = "+n);
	;
		System.out.println(canPlaceFlowers(arr,n));
		for(int i =0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}		
}
