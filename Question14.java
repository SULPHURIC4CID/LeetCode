/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 14

*/
/*

TestCases-



*/
public class Question14
{		
	public static String longestCommonPrefix(String[] strs) 
	{
        char ch;
		int index = 0;
		String temp="";
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<strs.length;i++)
		{
			if(strs[i].length()<min)
			{
				min = strs[i].length();
				temp = strs[i];
			}
		}
		System.out.println(min);
		if(min==0)
			return "";
		int j;
		abcd: 
		for(j = 0;j<min;j++)
		{
			ch = temp.charAt(j);
			
			for(int i = 0;i<strs.length;i++)
			{
				if(strs[i].charAt(j) != ch)
					break abcd;
			}
		}
		if (temp.substring(0,j).equals(""))
			return "";
		else
			return temp.substring(0,j);
	
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String[] arr = {"Ramu","Shyamu","Bheemu"};
		String[] arr1 = {"Ram","Rama","Ramachandra"};
		System.out.println(arr.length);
		arr.length = 5;
		System.out.println(longestCommonPrefix(arr));
		System.out.println(longestCommonPrefix(arr1));
	}		
}
