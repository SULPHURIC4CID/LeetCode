/*
* Author: Ananthanarayanan R
* Description: This class comprises of the various common integer array utilities that is required.
* Release Date: 12-08-2023
* Location: Bengaluru, Karantaka, India
*/

public class Array
{
	/**
	* Method to find the intersection of two integers arrays.
	* @param	array1	the first integer array.
	* @param	array2	the second integer array.
	* @return	the intersection integer array comprising of common elements from both the arrays.
	*/
	public static int[] intersection(int[] array1, int[] array2)
	{
		//Failure and single cases
		if(array1 == null && array2 == null)
			return null;
		if(array1 == null && array2 != null)
			return Array.copy(array2);
		if(array1 != null && array2 == null)
			return Array.copy(array1);
		
		int[] temp;
		int index = 0;
		if(array1.length<array2.length)
		{
			temp = new int[array1.length];
			for(int i = 0;i<array1.length;i++)
				if(Array.findElement(array2,array1[i]))
					temp[index++] = array1[i];				
		}
		else
		{
			temp = new int[array2.length];
			for(int i = 0;i<array2.length;i++)
				if(Array.findElement(array1,array2[i]))
					temp[index++] = array2[i];			
		}
		int[] intersection = new int[index];
		for(int i = 0;i<index;i++)
			intersection[i] = temp[i];
		return Array.findUnique(intersection);		
	}
	
	/**
	* Method to find the union of two integers arrays.
	* @param	array1	the first integer array.
	* @param	array2	the second integer array.
	* @return	the union integer array comprising of unique elements from both the arrays.
	*/
	public static int[] union(int[] array1, int[] array2)
	{
		//Failure and single cases
		if(array1 == null && array2 == null)
			return null;
		if(array1 == null && array2 != null)
			return Array.copy(array2);
		if(array1 != null && array2 == null)
			return Array.copy(array1);		
		//Main Logic - merge and find distinct
		return Array.findUnique(Array.merge(array1,array2));
	}
	
	/**
	* Method to merge two integer arrays sorted in ascending order
	* @param	array1	the first sorted integer array
	* @param	array2	the second sorted integer array
	* @return	the merged integer array that is sorted in ascending order
	*/
	
	public static int[] merge(int[] array1, int[] array2)
	{
		if(array1 == null && array2 == null)
			return null;
		if(array1 == null && (array2.length==0 || array2.length==1))
			return Array.copy(array2);
		if((array1.length==0 || array1.length==1) && array2 == null)
			return Array.copy(array1);
		
		int[] merge = new int[array1.length+array2.length];
		int pointer1 = 0; // Pointer for array1
		int pointer2 = 0; // Pointer for array2
		int pointer3 = 0; // Pointer for merge array
		
		while(pointer1<array1.length && pointer2<array2.length)
			if(array1[pointer1] < array2[pointer2])
				merge[pointer3++] = array1[pointer1++];
			else
				merge[pointer3++] = array2[pointer2++];
			
		if(pointer1>=array1.length && pointer2 >= array2.length)
			return merge;
		
		if(pointer1==array1.length)
		{
			for(int i = pointer2;i<array2.length;i++)
				merge[pointer3++] = array2[i];
			return merge;
		}		
		else
		{
			for(int i = pointer1;i<array1.length;i++)
				merge[pointer3++] = array1[i];
			return merge;
		}		
	}
	
	
	/**
	* Method to find the prefix sum array of the given integer array.
	* @param	array	the integer array whose prefix sum is to be determined.
	* @return	the prefixSum array of type long array is returned.
	*/
	public static long[] prefixSum(int[] array)
	{
		//Failure and Single Cases
		if(array==null)
			return null;
		if(array.length==0)
			return new long[0];
		long[] prefixSum = new long[array.length];
		long sum = 0;
		for(int i = 0;i<array.length;i++)
		{
			sum = sum + array[i];
			prefixSum[i] = sum;
		}
		return prefixSum;
	}
	
	/**
	* Method to return an integer array comprising of the duplicate elements from the original integer array.
	* @param	array	the array whose duplicate elements have to be determined.
	* @return	the integer array comprising of the duplicate elements from the original array.
	*/
	public static int[] findDuplicate(int[] array)
	{
		if(array==null)
			return null;
		if(array.length==0 || array.length==1)
			return new int[0];
		int maxValue = Array.max(array);
		int minValue = Array.min(array);
		int[] temp = new int[maxValue - minValue + 1];
		for(int i = 0;i<array.length;i++)
			temp[array[i]-minValue]++;
		int[] temp2 = new int[array.length-1];
		int index = 0;
		for(int i = 0;i<temp.length;i++)
			if(temp[i] > 1)
				temp2[index++] = i+minValue;
		int[] result = new int[index];
		for(int i = 0;i<index;i++)
			result[i] = temp2[i];
		return result;
	}
	/**
	* Method to return an integer array comprising of the unique elements from the original integer array.
	* @param	array	the array whose unique elements have to be determined.
	* @return	the integer array comprising of the unique elements from the original array.
	*/
	public static int[] findUnique(int[] array)
	{
		if(array==null)
			return null;
		if(array.length==0 || array.length==1)
			return array;
		int[] temp = new int[array.length];
		for(int i  =0;i<temp.length;i++)
			temp[i] = Integer.MIN_VALUE;
		int index = 0;
		for(int i =0;i<array.length;i++)
			if(Array.findIndex(temp,array[i])<0)
				temp[index++] = array[i];
		int[] result = new int[index];
		for(int i =0;i<index;i++)
				result[i] = temp[i];
		return result;
	}
	/**
	* Method to rotate the elements of the integer array either left or right.
	* @param	array - the integer array whose elemetns have to be rotated.
	* @param 	direction - this denotes whether the elements of the array have to rotate right (false) or left (true).
	*/
	public static void rotate(int[] array, boolean direction)
	{
		if(array==null)
			return;
		if(array.length==0 || array.length==1)
			return;
		int temp;
		if(direction)
		{
			temp = array[0];
			for(int i = 0;i<array.length-1;i++)
				array[i] = array[i+1];
			array[array.length-1] = temp;
		}
		else
		{
			temp = array[array.length-1];
			for(int i = array.length-1;i>0;i--)
				array[i] = array[i-1];
			array[0] = temp;
		}
	}
	/**
	* Method to find the MAX value of an integer array.
	* @param	array	the integer array whose maximum element is to be found.
	* @return			the maximum element of the integer array.
	*/
	public static int max(int[] array)
	{
		if(array == null || array.length == 0)
		{
			System.out.println("Cannot find max of NULL or empty array.");
			return -1;
		}
		int maxValue = Integer.MIN_VALUE;
		for(int i = 0;i<array.length;i++)
			if(maxValue<array[i])
				maxValue = array[i];
		return maxValue;
	}
	
	/**
	* Method to find the MIN value of an integer array.
	* @param	array	the integer array whose minimum element is to be found.
	* @return			the minimum element of the integer array.
	*/
	public static int min(int[] array)
	{
		if(array == null || array.length == 0)
		{
			System.out.println("Cannot find min of NULL or empty array.");
			return -1;
		}
		int minValue = Integer.MAX_VALUE;
		for(int i = 0;i<array.length;i++)
			if(minValue>array[i])
				minValue = array[i];
		return minValue;
	}
	
	/**
	* Method to find the n<SUP>th</SUP> MIN value of an integer array.
	* @param	array	the integer array whose n<SUP>th</SUP> minimum value is to be found.
	* @param	n	the position of the minimum value (n<SUP>th</SUP> minimum).
	* @return	the n<SUP>th</SUP> minimum element of the integer array. If not present returns Integer.MAX_VALUE.
	*/
	public static int nthmin(int[] array,int n)
	{
		if(array == null || array.length == 0)
		{
			System.out.println("Cannot find min of NULL or empty array.");
			return Integer.MAX_VALUE;
		}
		if(n<=0 || n>array.length)
		{
			System.out.println("Enter a strictly positive value less than the length of the array.");
			return Integer.MAX_VALUE;
		}
		int[] tempArray = Array.copy(array);
		Array.sort(tempArray,"insertion","asc");
		return tempArray[n-1];
	}
	
	/**
	* Method to find the n<SUP>th</SUP> MAX value of an integer array.
	* @param	array	the integer array whose n<SUP>th</SUP> maximum value is to be found.
	* @param	n	the position of the maximum value (n<SUP>th</SUP> maximum).
	* @return	the n<SUP>th</SUP> maximum element of the integer array. If not present returns Integer.MIN_VALUE.
	*/
	public static int nthmax(int[] array,int n)
	{
		if(array == null || array.length == 0)
		{
			System.out.println("Cannot find max of NULL or empty array.");
			return Integer.MIN_VALUE;
		}
		if(n<=0 || n>array.length)
		{
			System.out.println("Enter a strictly positive value less than the length of the array.");
			return Integer.MIN_VALUE;
		}
		int[] tempArray = Array.copy(array);
		Array.sort(tempArray,"insertion","desc");
		return tempArray[n-1];
	}
	
	/**
	* Method to sort the integer array.
	* @param	array	the integer array that is to be sorted.
	* @param	typeOfSort	the technique that is to be used for sorting, the acceptable values for typeOfSort are "bubble", "insertion", "counting".
	* @param	orderOfSort	the order of sorting the interger array, the acceptable values for orderOfSort are "asc" or "desc".
	*/
	public static void sort(int[] array, String typeOfSort, String orderOfSort)
	{
		//Failure Case and Single Cases
		if(array == null || array.length==0 || array.length==1)
			return;
		if(typeOfSort==null || (!typeOfSort.equals("bubble") && !typeOfSort.equals("insertion") && !typeOfSort.equals("counting")))
		{
			System.out.println("Unable to sort because of bad type of sort String value.");
			return;
		}
		if(orderOfSort==null || (!orderOfSort.equals("asc") && !orderOfSort.equals("desc")))
		{
			System.out.println("Unable to sort because of bad order of sort String value.");
			return;
		}
		
		
		//Bubble Sort - TC = O(n^2),SC = O(1)
		if(typeOfSort.equals("bubble"))
		{
			for(int i = 0;i<array.length;i++)
			{
				for(int j = 0;j<array.length-1-i;j++)
				{
					if(orderOfSort.equals("asc"))
					{
						if(array[j]>array[j+1])
						{
							array[j] = array[j] ^ array[j+1];
							array[j+1] = array[j] ^ array[j+1];
							array[j] = array[j] ^ array[j+1];
						}
					}
					else 
					{
						if(array[j]<array[j+1])
						{
							array[j] = array[j] ^ array[j+1];
							array[j+1] = array[j] ^ array[j+1];
							array[j] = array[j] ^ array[j+1];
						}
					}
				}
			}
			return;
		}
		
		//Insertion Sort - TC = O(n^2),SC = O(1)
		if(typeOfSort.equals("insertion"))
		{
			for(int i = 1;i<array.length;i++)
				for(int j = i ;j>0;j--)
				{
					if(orderOfSort.equals("asc"))
					{
						if(array[j]<array[j-1])
						{
							array[j] = array[j] ^ array[j-1];
							array[j-1] = array[j] ^ array[j-1];
							array[j] = array[j] ^ array[j-1];
						}
					}
					else if(orderOfSort.equals("desc"))
					{
						if(array[j]>array[j-1])
						{
							array[j] = array[j] ^ array[j-1];
							array[j-1] = array[j] ^ array[j-1];
							array[j] = array[j] ^ array[j-1];
						}
					}
				}
			return;
		}
		
		//Counting Sort - TC = O(n+maxValue-minValue), SC = O(maxValue - minValue)
		if(typeOfSort.equals("counting"))
		{
			int maxValue = Integer.MIN_VALUE;
			int minValue = Integer.MAX_VALUE;
			for(int i = 0;i<array.length;i++)
			{
				if(array[i]>maxValue)
					maxValue = array[i];
				if(array[i]<minValue)
					minValue = array[i];
			}
			int[] tempArray = new int[maxValue-minValue+1];
			for(int i = 0;i<array.length;i++)
				tempArray[array[i]-minValue]++;
			int index = 0;
			if(orderOfSort.equals("asc"))
			{
				for(int i = 0;i<tempArray.length;i++)
					if(tempArray[i]>0)
						for(int j = 0;j<tempArray[i];j++)
							array[index++] = i+minValue;
			}
			else if(orderOfSort.equals("desc"))
			{
				for(int i = tempArray.length-1;i>=0;i--)
					if(tempArray[i]>0)
						for(int j = 0;j<tempArray[i];j++)
							array[index++] = i+minValue;
			}
		return;
		}	
	}
	
	/**
	* Method to generate an non negative random integer array on a fixed length.
	* @param	length	the length of the required integer array.
	* @return	the random interger array with non negative elements of the desired length.
	*/
	public static int[] generate(int length)
	{
		int[] array;
		if (length<0)
			return null;
		if(length==0)
		{
			array = new int[0];
			return array;
		}
		array = new int[length];
		for(int i = 0;i<length;i++)
			array[i] = (int)(Math.random()*100);
		return array;
	}
	
	/**
	* Method to generate random integer array of a fixed length.
	* @param	length	the length of the required integer array.
	* @param	sign	if sign = true, array will contains both negative and positive elements, if sign = false, the array with be strictly non negative.
	* @return	the random interger array of the desired length.
	*/
	public static int[] generate(int length,boolean sign)
	{
		int[] array;
		if (length<0)
			return null;
		if(length==0)
		{
			array = new int[0];
			return array;
		}
		array = new int[length];
		for(int i = 0;i<length;i++)
		{
			array[i] = (int)(Math.random()*100);
			if(sign)
				if((int)(Math.random()*10)<5)
					array[i] = -array[i];
		}
		return array;
	}
	
	/**
	* Method to find the index of a target element within the integer array and return -1 if not found.
	* @param	array	the integer array from which the target element is to be searched.
	* @param	target	the value of the target element that is to be serached for in the integer array.
	* @return	returns the index if the target element is found, else returns -1 if the target element is not found.
	*/
	public static int findIndex(int[] array,int target)
	{
		if(array==null)
			return -1;
		if(array.length==0)
			return -1;
		for(int i = 0;i<array.length;i++)
			if(array[i] == target)
				return i;
		return -1;
	}
	
	/**
	* Method to check if a target element is present within the integer array or not.
	* @param	array	the integer array from which the target element is to be searched.
	* @param	target	the value of the target element that is to be serached for in the integer array.
	* @return	returns true if the target element is found in the integer array, else return false.
	*/
	public static boolean findElement(int[] array,int target)
	{
		if(array==null)
			return false;
		if(array.length==0)
			return false;
		for(int i = 0;i<array.length;i++)
			if(array[i] == target)
				return true;
		return false;
	}
	
	/**
	* Method to return a new integer array with the even elements of the integer array.
	* @param array	the integer array from which the EVEN values are to extracted.
	* @return	an integer array comprising of all the EVEN valued elements from the integer array.
	*/
	public static int[] findEven(int[] array)
	{
		if(array == null)
		{
			System.out.println("The array is NULL.");
			return array;
		}
		if(array.length==0)
		{
			System.out.println("The integer array is empty.");
			return array;
		}
		else
		{
			int[] result = new int[array.length];
			int index = 0;
			for(int i = 0;i<array.length;i++)
				if(array[i]%2==0)
					result[index++] = array[i];
			int[] finalArray = new int[index];
			for(int i = 0;i<index;i++)
				finalArray[i] = result[i];
			return finalArray;
		}				
	}
	
	/**
	* Method to return a new integer array with the odd elements of the integer array.
	* @param array	the integer array from which the ODD values are to extracted.
	* @return	an integer array comprising of all the ODD valued elements from the integer array.
	*/
	public static int[] findOdd(int[] array)
	{
		if(array == null)
		{
			System.out.println("The array is NULL.");
			return array;
		}
		if(array.length==0)
		{
			System.out.println("The integer array is empty.");
			return array;
		}
		else
		{
			int[] result = new int[array.length];
			int index = 0;
			for(int i = 0;i<array.length;i++)
				if(array[i]%2==1)
					result[index++] = array[i];
			int[] finalArray = new int[index];
			for(int i = 0;i<index;i++)
				finalArray[i] = result[i];
			return finalArray;
		}				
	}
	
	/**
	* Method that returns the prod of elements of an integer array.
	* @param array	the integer array whose product of elements is to be found.
	* @return	the product of all the elements of the integer array.
	*/
	public static long prod(int[] array)
	{
		if(array == null)
		{
			System.out.println("The array is NULL.");
			return 0L;
		}
		if(array.length==0)
		{
			System.out.println("The integer array is empty.");
			return 0L;
		}
		else
		{
			long prod = 1;
			for(int i = 0;i<array.length;i++)
				prod*=array[i];
			return prod;
		}				
	}
	
	/**
	* Method that returns the sum of elements of an integer array.
	* @param array	the integer array whose sum of elements is to be found.
	* @return	the sum of all the elements of the integer array.
	*/
	public static long sum(int[] array)
	{
		if(array == null)
		{
			System.out.println("The array is NULL.");
			return 0L;
		}
		if(array.length==0)
		{
			System.out.println("The integer array is empty.");
			return 0L;
		}
		else
		{
			long sum = 0;
			for(int i = 0;i<array.length;i++)
				sum+=array[i];
			return sum;
		}	
	}
	
	/**
	* Method that returns an integer array that is a copy of the passed integer array.
	* @param array	the integer array whose copy is to created.
	* @return	a new integer array that is an exact copy of the passed integer array.
	*/
	public static int[] copy(int[] array)
	{
		int[] result;
		if(array == null)
			return null;
		result = new int[array.length];
		for(int i = 0;i<array.length;i++)
			result[i] = array[i];
		return result;
	}
	
	/**
	* Method that reverses the contents of an integer array inplace.
	* @param	array	the integer array whose elements are to be reversed in place.
	*/
	public static void reverse(int[] array)
	{
		if(array == null)
		{
			System.out.println("The integer array is NULL.");
			return;
		}
		if(array.length==0 || array.length==1)
			return;
		for(int i = 0;i<array.length/2;i++)
		{
			array[i] = array[i]^array[array.length-i-1];
			array[array.length-i-1] = array[i]^array[array.length-i-1];
			array[i] = array[i]^array[array.length-i-1];
		}
	}
	
	/**
	* Method that prints the elements of the integer array in a single line to the console.
	* @param	array	the integer array whose elements are to be displayed to the console.
	*/
	public static void display(int[] array)
	{
		if(array == null)
		{
			System.out.println("The array is NULL.");
			return;
		}
		if(array.length==0)
		{
			System.out.println("The integer array is empty.");
			return;
		}
		for(int i = 0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}			
		System.out.println();
	}
	
	/**
	* Method that prints the elements of the long array in a single line to the console.
	* @param	array	the long array whose elements are to be displayed to the console.
	*/
	public static void display(long[] array)
	{
		if(array == null)
		{
			System.out.println("The array is NULL.");
			return;
		}
		if(array.length==0)
		{
			System.out.println("The integer array is empty.");
			return;
		}
		for(int i = 0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}			
		System.out.println();
	}
}