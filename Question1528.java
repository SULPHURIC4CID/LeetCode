/*

Author: Ananthanarayanan R
Section: Algorthms
Question: 1528

*/

public class Question1528
{
	public static int find(int val,int[] indices)
	{
		for(int i = 0;i<indices.length;i++)
			if(indices[i] == val)
				return i;
		return -1;
	}
	public static String restoreString(String s, int[] indices) 
	{
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<s.length();i++)
		{
			sb.append(s.charAt(find(i,indices)));
		}			
		return sb.toString();
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,1,2,3};
		String result = restoreString(s,indices);
		System.out.println(result);
	}
}
