/*

Author: Ananthanarayanan R
Section: Algorthms
Question: 1678

*/

public class Question1678
{
	public static String interpret(String command) 
	{
		String result = "";
        for(int i = 0;i<command.length();i++)
		{
			if(command.charAt(i) == 'G')
			{
				result+='G';
			}
			else
			{
				if(command.charAt(i+1) == ')')
				{
					result+='o';
					i++;
				}
				else
				{
					result+="al";
					i+=3;
				}
			}		
		}
		return result;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String command = "GGG()()()(al)()G(al)";
		System.out.println(interpret(command));
	}
}
