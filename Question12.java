/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 12

*/


public class Question12
{	
	public static int charToInt(char ch)
	{
		return (int)(ch)-48;
	}
	
	public static String intToRoman(int num) 
	{
		
        String s = ""+num;
		for(int i = 0;i<4;i++)
			if(i>=s.length())
				s = '0' + s;		
		int[] arr = new int[s.length()];
		for(int i = 0;i<s.length();i++)
		{
			arr[i] = charToInt(s.charAt(i));
			for(int j = i;j<s.length()-1;j++)
			{
				arr[i] *= 10;
			}
		}
		for(int i=0;i<arr.length;i++)
			arr[i] = arr[i] / (int)Math.pow(10,arr.length-i-1);	
		s="";
		int i;
		for(int k = arr.length-1;k>=0;k--)
		{
			i = arr.length-k-1;
			if(arr[i]<=3 && arr[i]>0)
			{
				for(int j = 0;j<arr[i];j++)
				{
					if(i==0)
						s=s+'M';
					else if(i==1)
						s=s+'C';
					else if(i==2)
						s=s+'X';
					else
						s=s+'I';
				}
			}
			else if(arr[i] == 4)
			{
				if(i==1)
					s=s+"CD";
				else if(i==2)
					s=s+"XL";
				else if(i==3)
					s=s+"IV";
			}
			else if(arr[i] == 5)
			{
				if(i==1)
					s=s+'D';
				else if(i==2)
					s=s+'L';
				else if(i==3)
					s=s+'V';
			}
			else if(arr[i] > 5 && arr[i] <9)
			{
				if(i==1)
					s=s+'D';
				else if(i==2)
					s=s+'L';
				else if(i==3)
					s=s+'V';
				for(int j = 0;j<arr[i]-5;j++)
				{
					if(i==1)
						s=s+'C';
					else if(i==2)
						s=s+'X';
					else if(i==3)
						s=s+'I';
				}
			}
			else if(arr[i] == 9)
			{
				if(i==1)
					s=s+"CM";
				else if(i==2)
					s=s+"XC";
				else if(i==3)
					s=s+"IX";
			}
		}
		return s;
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		int n;
		n = 3333;
		System.out.println(n+" : "+intToRoman(n));
		
		n = 333;
		System.out.println(n+" : "+intToRoman(n));
		
		n = 33;
		System.out.println(n+" : "+intToRoman(n));
		
		n = 3;
		System.out.println(n+" : "+intToRoman(n));
		
	}		
}
