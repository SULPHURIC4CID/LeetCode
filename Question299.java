/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 299


*/

import java.util.*;

public class Question299
{
	public static String getHint(String secret, String guess) 
	{
		int bulls = 0;
		int cows = 0;
		
        //Transfer the contents to an collection
		ArrayList<Character> secretList = new ArrayList<>();
		ArrayList<Character> guessList = new ArrayList<>();
		for(int i = 0;i<secret.length();i++)
		{
			secretList.add(secret.charAt(i));
			guessList.add(guess.charAt(i));			
		}
		
		Iterator<Character> secretIterator = secretList.iterator();
		Iterator<Character> guessIterator = guessList.iterator();
		while(secretIterator.hasNext())
		{
			char s = secretIterator.next();
			char g = guessIterator.next();
			if(s==g)
			{
				bulls++;
				secretIterator.remove();
				guessIterator.remove();
			}
		}
		
		for(int i = 0;i<secretList.size();i++)
			if(guessList.remove(secretList.get(i)))
				cows++;
		return bulls+"A"+cows+"B";
    }
	
	public static void main(String[] args)
	{
		String secret = "1123";
		String guess = "0111";
		String result = getHint(secret,guess);
		System.out.println(result);
		
		
	}
}