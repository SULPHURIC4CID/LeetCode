/*
Author: Ananthanarayanan R
Section: Algorithms
Question: 30

*/

import java.util.*;


public class Question30
{
	public static void repeat(List<String> result, List<String> list1, List<String> list2)
	{
		if(list2.size()==0)			
		{
			String temp = "";
			for(String word:list1)
				temp+=word;
			result.add(temp);
		}
		else
		{
			for(int i = 0;i<list2.size();i++)
			{
				list1.add(list2.remove(i));
				repeat(result,list1,list2);
				list2.add(i,list1.remove(list1.size()-1));
			}
		}	
		
	}
	
	public static List<String> permute(String[] words)
	{
		List<String> result = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		for(String word:words)
			list2.add(word);
		for(int i = 0;i<list2.size();i++)
		{
			list1.add(list2.remove(i));
			repeat(result,list1,list2);
			list2.add(i,list1.remove(list1.size()-1));
		}
		return result;
	}
	
	public static List<Integer> findSubstring(String s, String[] words) 
	{
        List<String> permutationsList = permute(words);
		List<Integer> result = new ArrayList<>();
		int index=0;
		int pos = 0;
		for(String word:permutationsList)
		{
			while(true)
			{				
				index = s.indexOf(word,index);
				if(index>=0)
				{
					result.add(index);
					index = index+1;
				}
				else
					break;
			}
		}
		Set<Integer> set = new HashSet<>();
		set.addAll(result);
		result.clear();
		result.addAll(set);
		return result;
    }
	
	public static void main(String[] args)
	{
		String s = "pjzkrkevzztxductzzxmxsvwjkxpvukmfjywwetvfnujhweiybwvvsrfequzkhossmootkmyxgjgfordrpapjuunmqnxxdrqrfgkrsjqbszgiqlcfnrpjlcwdrvbumtotzylshdvccdmsqoadfrpsvnwpizlwszrtyclhgilklydbmfhuywotjmktnwrfvizvnmfvvqfiokkdprznnnjycttprkxpuykhmpchiksyucbmtabiqkisgbhxngmhezrrqvayfsxauampdpxtafniiwfvdufhtwajrbkxtjzqjnfocdhekumttuqwovfjrgulhekcpjszyynadxhnttgmnxkduqmmyhzfnjhducesctufqbumxbamalqudeibljgbspeotkgvddcwgxidaiqcvgwykhbysjzlzfbupkqunuqtraxrlptivshhbihtsigtpipguhbhctcvubnhqipncyxfjebdnjyetnlnvmuxhzsdahkrscewabejifmxombiamxvauuitoltyymsarqcuuoezcbqpdaprxmsrickwpgwpsoplhugbikbkotzrtqkscekkgwjycfnvwfgdzogjzjvpcvixnsqsxacfwndzvrwrycwxrcismdhqapoojegggkocyrdtkzmiekhxoppctytvphjynrhtcvxcobxbcjjivtfjiwmduhzjokkbctweqtigwfhzorjlkpuuliaipbtfldinyetoybvugevwvhhhweejogrghllsouipabfafcxnhukcbtmxzshoyyufjhzadhrelweszbfgwpkzlwxkogyogutscvuhcllphshivnoteztpxsaoaacgxyaztuixhunrowzljqfqrahosheukhahhbiaxqzfmmwcjxountkevsvpbzjnilwpoermxrtlfroqoclexxisrdhvfsindffslyekrzwzqkpeocilatftymodgztjgybtyheqgcpwogdcjlnlesefgvimwbxcbzvaibspdjnrpqtyeilkcspknyylbwndvkffmzuriilxagyerjptbgeqgebiaqnvdubrtxibhvakcyotkfonmseszhczapxdlauexehhaireihxsplgdgmxfvaevrbadbwjbdrkfbbjjkgcztkcbwagtcnrtqryuqixtzhaakjlurnumzyovawrcjiwabuwretmdamfkxrgqgcdgbrdbnugzecbgyxxdqmisaqcyjkqrntxqmdrczxbebemcblftxplafnyoxqimkhcykwamvdsxjezkpgdpvopddptdfbprjustquhlazkjfluxrzopqdstulybnqvyknrchbphcarknnhhovweaqawdyxsqsqahkepluypwrzjegqtdoxfgzdkydeoxvrfhxusrujnmjzqrrlxglcmkiykldbiasnhrjbjekystzilrwkzhontwmehrfsrzfaqrbbxncphbzuuxeteshyrveamjsfiaharkcqxefghgceeixkdgkuboupxnwhnfigpkwnqdvzlydpidcljmflbccarbiegsmweklwngvygbqpescpeichmfidgsjmkvkofvkuehsmkkbocgejoiqcnafvuokelwuqsgkyoekaroptuvekfvmtxtqshcwsztkrzwrpabqrrhnlerxjojemcxel";
		String[] words = {"dhvf","sind","ffsl","yekr","zwzq","kpeo","cila","tfty","modg","ztjg","ybty","heqg","cpwo","gdcj","lnle","sefg","vimw","bxcb"};
		List<Integer> result = findSubstring(s,words);
		System.out.println(result);
	}
}