/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 165
*/

import java.util.*;

public class Question165
{
	public static void removeLeadingZeros(String[] versionRevisions)
	{
		for(int i = 0;i<versionRevisions.length;i++)
		{
			StringBuilder sb = new StringBuilder(versionRevisions[i]);
			while(sb.charAt(0)=='0' && sb.length()>1)
				sb.deleteCharAt(0);
			versionRevisions[i] = sb.toString();			
		}
	}
	
	public static List<Integer> extractRevisions(String version)
	{
		String[] versionRevisions = version.split("\\.");
		removeLeadingZeros(versionRevisions);
		
		//Create a List
		List<Integer> revisionList = new ArrayList<>();
		for(String revision:versionRevisions)
			revisionList.add(Integer.parseInt(revision));
		
		return revisionList;
	}
	
	public static int compareVersion(String version1, String version2) 
	{
        List<Integer> list1 = extractRevisions(version1);
		List<Integer> list2 = extractRevisions(version2);		
		
		int diff = Math.abs(list1.size()-list2.size());
		
		//Match the size of the two lists
		if(list1.size()<list2.size())
		{
			//add 0s to list1 till size is the same
			for(int i = 0;i<diff;i++)
			{
				list1.add(0);
			}
		}
		else if(list2.size()<list1.size())
		{
			//add 0s to list1 till size is the same
			for(int i = 0;i<diff;i++)
			{
				list2.add(0);
			}
		}
		
		//Compare the elements of the two lists from the left
		for(int i = 0;i<list1.size();i++)
		{
			if(list1.get(i)<list2.get(i))
				return -1;
			else if(list1.get(i)>list2.get(i))
				return 1;
		}
		return 0;
    }
	
	public static void main(String[] args)
	{
		String version1 = "2.5.33";
		String version2 = "2.0006.00001.02.0.3.7";
		
		int result = compareVersion(version1,version2);
		System.out.println(result);
	}
}