/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 66

*/

public class Question66      
{
	
	public static int[] plusOne(int[] digits)
	{
		int carry = 1;
		int[] arr1;
		for(int i =digits.length-1;i>=0;i--)
		{
			digits[i] = (digits[i] + carry);
			if(digits[i]<=9)
				carry = 0;
			digits[i] = digits[i]%10;
		}	
		arr1 = new int[carry + digits.length];
		if (carry == 1)
			arr1[0] = 1;
		
		for(int i = carry,j=0;i<(carry + digits.length);i++,j++)
		{
			arr1[i] = digits[j];
		}
		return arr1;
	}
	
		
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");	
		int[] arr = {9,9,9,9};
		int[] arr1 = plusOne(arr);
		
		//System.out.println(plusOne(arr));
		
		
		for(int i = 0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		
	}		
}
