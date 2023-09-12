/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 242

*/

public class Question242
{
	
	/* Logic 1
	public static void sort(char [] arr)
	{
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					arr[j] = (char)(arr[j]^arr[j+1]);
					arr[j+1] = (char)(arr[j]^arr[j+1]);
					arr[j] = (char)(arr[j]^arr[j+1]);
				}
			}
		}
	}
	public static boolean isAnagram(String s, String t) 
	{
        char [] arr1,arr2;
		arr1 = s.toCharArray();
		arr2 = t.toCharArray();
		sort(arr1);
		sort(arr2);
		String s1 = new String(arr1);
		String s2 = new String(arr2);
		
		return s1.equals(s2);
		
    }
	
	*/
	//97-122
	public static boolean isAnagram(String s, String t) 
	{
		if(s.length() != t.length())
			return false;
        int [] arr1 = new int[26];		
		int [] arr2 = new int[26];
		int i;
		for(i=0;i<s.length();i++)
		{
			arr1[(int)(s.charAt(i))-97]++;
			arr2[(int)(t.charAt(i))-97]++;
		}
		for(i=0;i<26;i++)
			if(arr1[i] != arr2[i])
				return false;	
		return true;		
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		String s1,s2;
		s1 = "ramu";
		s2 = "mura";
		System.out.println(isAnagram(s1,s2));
	}
}

