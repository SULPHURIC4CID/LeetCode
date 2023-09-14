/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 735

*/
/*

TestCases-



*/
public class Question735
{	

	public static int[] asteroidCollision(int[] asteroids)
	{
		//Failure and single case
        if(asteroids == null || asteroids.length==1)
			return asteroids;
		int numberOfCollisions = 0;
		int[] temp = null;
		int index = 0;
		int i=0;
		while(true)
		{
			temp = new int[asteroids.length];
			index = 0;
			numberOfCollisions = 0;
			for(i = 0;i<asteroids.length-1;i++)
			{
				if(asteroids[i]<0)
				{
					temp[index++] = asteroids[i];
				}
				else if(asteroids[i] >0 && asteroids[i+1]<0)
				{
					numberOfCollisions++;
					if(asteroids[i] > -asteroids[i+1])
					{
						temp[index++] = asteroids[i];
					}
					else if(asteroids[i] < -asteroids[i+1])
					{
						temp[index++] = asteroids[i+1];
					}
					i++;
				}
				else
				{
					temp[index++] = asteroids[i];
				}
			}
			if(i==asteroids.length-1)
				temp[index++] = asteroids[i];
			
			asteroids = new int[index];
			for(int j = 0;j<index;j++)
				asteroids[j] = temp[j];
			
			if(numberOfCollisions==0)
			{
				break;
			}
		}
		return asteroids;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		//int[] array = Array.generate(2,true);
		int[] array = {17,-17};
		Array.display(array);
		
		int[] result = asteroidCollision(array);
		Array.display(result);
	}		
}
