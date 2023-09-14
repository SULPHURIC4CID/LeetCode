/*

Author: Ananthanarayanan R
Section: Algorithms
Question: 599

*/

public class Question599
{
	public static String[] findRestaurant(String[] list1, String[] list2) 
	{
		//Get the length of the shorter String array
        int length = list1.length<list2.length?list1.length:list2.length;
		
		//Determine the shorter and longer arrays
		String[] shorterArray = list1.length<list2.length?list1:list2;
		String[] longerArray = list1.length<list2.length?list2:list1;
		
		//Create a dummy String[] of size = length and initialize index to 0
		String[] temp = new String[length];
		int index =  0;
		
		int minSum = Integer.MAX_VALUE;
		//Iterate through the shorter array
		for(int iterator = 0;iterator<shorterArray.length;iterator++)
			for(int innerIterator = 0;innerIterator<longerArray.length;innerIterator++)
				if(longerArray[innerIterator].equals(shorterArray[iterator]))
					if(iterator+innerIterator<minSum)
					{
						minSum = iterator+innerIterator;
						//Point to the starting if a smaller minSum is encountered
						index = 0;
						temp[index++] = shorterArray[iterator];
					}
					else if (iterator+innerIterator==minSum)
						temp[index++] = shorterArray[iterator];
		
		//Creating a result String[]
		String[] result = new String[index];
		for(int iterator = 0;iterator<index;iterator++)
			result[iterator] = temp[iterator];
		
		return result;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String[] list1 = {"happy","sad","good"};
		String[] list2 = {"sad","happy","good"};
		String[] res = findRestaurant(list1,list2);
		for(int i = 0;i<res.length;i++)
			System.out.println(res[i]);
		
	}		
}
