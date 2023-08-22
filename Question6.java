/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 6

*/
/*

TestCases-

1. s = "abcdefghijklmnopqrstuvwxyz", numRows = 5

a       i       q       y
b     h j     p r     x z
c   g   k   o   s   w
d f     l n     t v
e       m       u  

output = aiqybhjprxzcgkoswdflntvemu


*/
public class Question6  
{
	public static String convert(String s, int numRows) 
	{
		int j = 0;
		int dir = 0;
		if (numRows == 1)
			return s;
		String[] arr = new String[numRows];
		for(int i=0;i<arr.length;i++)
			arr[i] = "";
		
		for(int i = 0;i<s.length();i++)
		{
			arr[j] = arr[j]+s.charAt(i);
			if(j==(arr.length-1))
				dir = 1;
			if(j==0)
				dir = 0;
			if(dir==0)
				j++;
			else
				j--;
			
		}
		String t = "";
		for(j = 0;j<arr.length;j++)
		{
			t+=arr[j];
		}
		return t;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");	
		int numRows = 1;
		String s = "AB";//"abcdefghijklmnopqrstuvwxyz";
		System.out.println(convert(s,numRows));
		
	}		
}
