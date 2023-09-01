/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 43

*/
/*

TestCases-



*/
public class Question43 
{
	public static double convertInt(String s)
	{
		double temp = 0.0;
		for(int i = 0;i<s.length();i++)
		{
			temp = (temp*10)+ ((int)s.charAt(i)-48);
		}
		return temp;
	}
	
	public static String multiply(String num1, String num2)
	{
        double val;
		val = (double)convertInt(num1) * (double)convertInt(num2);
		String temp = "";
		return ""+val;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		System.out.println(multiply("498828660196","840477629533"));
		
	}		
}
