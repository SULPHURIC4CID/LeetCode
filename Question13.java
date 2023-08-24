/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 13

*/
/*

TestCases-


*/
public class Question13
{	
	public static int romanToInt(String s) 
	{
        int i;
		char ch,ch2;
		long sum = 0;	
		for(i=0;i<s.length();i++)
		{
			ch = s.charAt(i);
			//System.out.println(ch);
			if(i+1<s.length() && (ch == 'I' || ch == 'X' || ch == 'C'))
			{
				ch2 = s.charAt(i+1);
				if(ch == 'I' && ch2 == 'X')
				{
					sum+=9;
					i++;
				}					
				else if(ch=='I' && ch2 == 'V')
				{
					sum+=4;
					i++;
				}
				else if(ch=='X' && ch2 == 'L')
				{
					sum+=40;
					i++;
				}
				else if(ch == 'X' && ch2 == 'C')
				{
					sum+=90;
					i++;
				}
				else if(ch =='C' && ch2 == 'M')
				{
					sum+=900;
					i++;
				}
				else if(ch=='C' && ch2 == 'D')
				{
					sum+=400;
					i++;
				}
				else
				{
					switch(ch)
					{
						case 'I':
							sum+=1;
							break;
						case 'C':
							sum+=100;
							break;
						case 'X':
							sum+=10;
							break;
					}
				}
				
			}
			else
			{
				switch(ch)
				{
					case 'I':
						sum+=1;
						break;
					case 'V':
						sum+=5;
						break;
					case 'X':
						sum+=10;
						break;
					case 'L':
						sum+=50;
						break;
					case 'C':
						sum+=100;
						break;
					case 'D':
						sum+=500;
						break;
					case 'M':
						sum+=1000;
						break;
				}
			}
			//System.out.println(sum);
			//System.out.println(i);
		}
		return (int)sum;
    }
	
	public static void main(String[] args)
	{
		
		System.out.println("Main Method starts");
		System.out.println(romanToInt("DCXXII"));
	}		
}
