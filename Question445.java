/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 445

Decription:





*/


public class Question445
{
	public static String convertListToString(ListNode head)
	{
		if(head==null)
			return "";
		StringBuilder sb = new StringBuilder();
		while(head.next!=null)
		{
			sb.append(head.val);
			head = head.next;
		}
		sb.append(head.val);		
		return sb.toString();		
	}
	
	public static ListNode convertStringToList(String s)
	{
		ListNode result,newNode,temp,temp2;
		if (s.length()==0 || s ==null)
			return null;
		if(s.length()==1)
		{
			result = new ListNode();
			result.val = (int)s.charAt(0)-48;
			result.next = null;
			return result;
		}
		result = new ListNode();
		temp = result;
		temp2 = null;
		for(int i =0;i<s.length();i++)
		{
			result.val = (int)s.charAt(i)-48;
			newNode = new ListNode();
			result.next = newNode;
			temp2 = result;
			result = result.next;
		}
		temp2.next = null;
		return temp;
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
        if(l1==null && l2 ==null)
			return l1;
		if(l1 == null && l2!=null)
			return l2;
		if(l1!=null && l2==null)
			return l1;
		String s1 = convertListToString(l1);
		String s2 = convertListToString(l2);
		int diff = Math.abs(s1.length()-s2.length());
		if(s1.length()>s2.length())
			for(int i =0;i<diff;i++)
				s2 = '0'+s2;
		else
			for(int i =0;i<diff;i++)
				s1 = '0'+s1;
		//System.out.println(s1);
		//System.out.println(s2);
		int carry = 0;
		StringBuilder s3 = new StringBuilder();
		int val,result;
		for(int i = s1.length()-1;i>=0;i--)
		{
			//System.out.println((s1.charAt(i)-48));
			//System.out.println((s2.charAt(i)-48));
			//System.out.println(carry);
			result = (s1.charAt(i)-48) + (s2.charAt(i)-48) + carry;
			//System.out.println(result);
			//System.out.println("--------------");
			val = result%10;
			carry = result/10;
			s3.append(val);			
		}
		if(carry==1)
			s3.append(carry);
		s3.reverse();
		//System.out.println(s3.toString());
		
		return convertStringToList(s3.toString());
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		ListNode head1 = LinkedList.createLinkedList(3,"sorted");
		ListNode head2 = LinkedList.createLinkedList(5,"sorted");		
		//LinkedList.displayLinkedList(head1);		
		//LinkedList.displayLinkedList(head2);	
		//System.out.println(convertListToString(head1));
		//System.out.println(convertListToString(head2));
		ListNode answer = addTwoNumbers(head1,head2);
		//LinkedList.displayLinkedList(answer);
		
	}	
		
}
