/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 88

*/

public class Question88   
{
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) 
	{
        int[] temp = new int[m];
		for(int i = 0;i<m;i++)
			temp[i] = nums1[i];
		int index = 0;
		int i = 0;
		int j = 0;
		while(index<(m+n))
		{
			if(i==m)
			{
				nums1[index] = nums2[j];
				j++;
			}
			else if(j==n)
			{
				nums1[index] = temp[i];
				i++;
			}
			else if (i<m && j<n)
			{
				if(temp[i]<=nums2[j])
				{
					nums1[index] = temp[i];
					i++;
				}
				else
				{
					nums1[index] = nums2[j];
					j++;
				}
			}
			index++;
		}
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int[] arr1 = {1,2,7,0,0,0};
		int[] arr2 = {5,6,9};
		printArray(arr1);
		printArray(arr2);
		merge(arr1,3,arr2,3);
		printArray(arr1);
		
		
	}		
}
