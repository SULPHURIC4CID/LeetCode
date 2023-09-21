/*

Author: Ananthanarayanan R
Section: Algorthms
Question: 1108

*/

public class Question1108
{
	public static String defangIPaddr(String address) 
	{
        return address.replace(".","[.]");
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String ip = "123.123.45.6";
		System.out.println(defangIPaddr(ip));
	}
}
