/*

Author: Ananthanarayanan R
Section: Algorthms
Question: 2325

*/

public class Question2325
{
	public static String decodeMessage(String key, String message) 
	{
		String sb = "";
		for(int i = 0;i<key.length();i++)
		{
			if(sb.indexOf(key.charAt(i))==-1 && key.charAt(i)!= ' ')
				sb+=key.charAt(i);
			if(sb.length()==26)
				break;
		}
		StringBuffer result = new StringBuffer();
		for(int i = 0;i<message.length();i++)
		{
			if(message.charAt(i) == ' ')
				result.append(' ');
			else
			{
				result.append((char)(sb.indexOf(message.charAt(i))+97));
			}
		}
		return result.toString();	
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String key = "eljuxhpwnyrdgtqkviszcfmabo";
		String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
		String result = decodeMessage(key,message);
		System.out.println(result);
		
	}
}
