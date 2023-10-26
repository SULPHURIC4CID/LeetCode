/*

Author: Ananthanarayanan R
Section: Algorithms
Question: 763

*/

import java.util.*;

public class Question763
{
	public static List<Integer> partitionLabels(String s) 
	{
		/*
		Pseudo Code-
		1. Create a List<String> list.
		2. If list.size() == 0, add first char to list.
		3. check if next char belongs to existing partitions.
		4. if yes append that partition with all the next partitions.
		5. repeat the process for all the characters in the string s.
		6. Map the length of each partition in list to another LIST.
		7. return that LIST.		
		*/
		
		List<String> stringList = new ArrayList<>();
		for(int i = 0;i<s.length();i++)
			if(stringList.size()==0)
				stringList.add(""+s.charAt(i));
			else
			{
				int count = 0;
				for(int j = 0;j<stringList.size();j++)
					if(stringList.get(j).contains(""+s.charAt(i)))
					{
						String temp = "";
						for(int k = j;k<stringList.size();k++)
							temp+=stringList.get(k);						
						temp+=s.charAt(i);
						for(int k = stringList.size()-1;k>=j;k--)
							stringList.remove(k);
						stringList.add(temp);
						break;
					}
					else
						count++;
				if(count==stringList.size())
					stringList.add(""+s.charAt(i));
			}
		List<Integer> result = new ArrayList<>();
		for(String str:stringList)
			result.add(str.length());
        return result;
    }
	
	public static void main(String[] args)
	{
		String s = "eccbbbbdec";
		List<Integer> result = partitionLabels(s);
		System.out.println(result);
	}
}