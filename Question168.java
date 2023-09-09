/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 168

*/

public class Question168
{
	//A = 65 : Z =90
	public static String convertToTitle(int columnNumber) 
	{
		String temp = "";
		while(columnNumber>0)
		{
			if(columnNumber%26==0)
			{
				temp = "Z"+temp;
				columnNumber = columnNumber/26-1;
			}
			else
			{
				temp = (char)((columnNumber%26)+64)+temp;
				columnNumber/=26;
			}
		}
		return temp;
    }

	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int col = 701;
		System.out.println(convertToTitle(col));
	}
}
