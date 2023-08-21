/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 2

*/


public class Question2
{	
	public static int intValueOfChar(char ch)
	{
		return (int)(ch)-48;
	}
	
	public static String addString(String s1, String s2)
	{
		StringBuilder result = new StringBuilder();
		int diff = Math.abs(s1.length()-s2.length());
		if(s1.length()<s2.length())
			for(int i = 0;i<diff;i++)
				s1 = '0'+s1;
		else
			for(int i = 0;i<diff;i++)
				s2 = '0'+s2;
		//System.out.println(s1);
		//System.out.println(s2);
		int carry = 0;
		int val = 0;
		int temp = 0;
		
		for(int i = s1.length()-1;i>=0;i--)
		{
			val = carry + intValueOfChar(s1.charAt(i)) + intValueOfChar(s2.charAt(i));
			temp = val;
			val = val % 10;
			carry = temp/10;
			result.append(val);
		}
		if(carry!=0)
			result.append(carry);
		//result.reverse();
		return result.toString();
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) 
	{
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		ListNode h1 = l1;
		ListNode h2 = l2;
		while(l1.next!= null)
		{
			s1.append(l1.val);
			l1 = l1.next;
		}
		s1.append(l1.val);
		s1.reverse();
		//System.out.println(s1.toString());
		while(l2.next!= null)
		{
			s2.append(l2.val);
			l2 = l2.next;
		}		
		s2.append(l2.val);
		s2.reverse();
		//System.out.println(s2.toString());
		String s3 = addString(s1.toString(),s2.toString());
		//System.out.println(s3);
		
		//Converting s3 string to linked list
		ListNode head = new ListNode();
		ListNode temp = head;
		ListNode newNode;
		for(int i = 0;i<s3.length();i++)
		{
			head.val = intValueOfChar(s3.charAt(i));
			if(i==s3.length()-1)
				break;
			newNode = new ListNode();
			head.next = newNode;
			head = head.next;
			
		}
		head.next = null;
		
		//System.out.println(s3);
		return temp;
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		//System.out.println(addString("99999","9999"));
		ListNode a1 = new ListNode();
		ListNode a2 = new ListNode();
		ListNode a3 = new ListNode();
		ListNode a4 = new ListNode();
		ListNode a5 = new ListNode();
		ListNode a6 = new ListNode();
		ListNode a7 = new ListNode();
		a1.val = 2;
		a1.next = a2;		
		a2.val = 4;
		a2.next = a3;
		a3.val = 3;
		a3.next = null;
		a4.val = 9;
		a4.next = a5;
		a5.val = 9;
		a5.next = a6;
		a6.val = 9;
		a6.next = a7;
		a7.val = 9;
		a7.next = null;
		
		
		ListNode b1 = new ListNode();
		ListNode b2 = new ListNode();
		ListNode b3 = new ListNode();
		ListNode b4 = new ListNode();
		b1.val = 5;
		b1.next = b2;
		b2.val = 6;
		b2.next = b3;
		b3.val = 4;
		b3.next = null;
		b4.val = 9;
		b4.next = null;
		
		
		ListNode result = new ListNode();
		result = addTwoNumbers(a1,b1);
		while(result.next!=null)
		{
			//System.out.println(result.val);
			result = result.next;
		}
		//System.out.println(result.val);
		//System.out.println(result.next);
		
		
	}		
}
