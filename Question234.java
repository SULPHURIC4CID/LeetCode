/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 234

*/
/*

TestCases-



*/
public class Question234
{	
	
	/*
	public static boolean isPalindrome(ListNode head) 
	{
        if(head.next==null)
			return true;
		ListNode temp = head;
		int length = 0;
		while(temp!=null)
		{
			length++;
			temp = temp.next;
		}
		System.out.println(length);
		
		int diff = length - 1;
		for(int i = 0;i<length/2;i++)
		{
			temp = head;
			for(int j = 1;j<=diff;j++)
				temp = temp.next;
			if(head.val != temp.val)
				return false;
			head = head.next;
			diff-=2;
		}
		return true;
    }
	*/
	
	public static boolean isPalindrome(ListNode head) 
	{
		if(head==null)
			return false;
		if(head.next==null)
			return true;
		ListNode temp = head;
		int length = 0;
		while(temp!=null)
		{
			length++;
			temp = temp.next;
		}
		int index = 0;
		temp = head;
		ListNode list2 = head;
		while(index<length/2-1)
		{
			head = head.next;
			index++;
		}
		if(length%2==0)
			list2 = head.next;
		else
			list2 = head.next.next;
		head.next = null;
		list2 = reverse(list2);
		LinkedList.displayLinkedList(temp);
		LinkedList.displayLinkedList(list2);
		for(int i = 0;i<length/2;i++)
		{
			if(temp.val!=list2.val)
				return false;
			temp = temp.next;
			list2 = list2.next;
		}
		return true;
		
	}
	
	public static ListNode reverse(ListNode head)
	{
		if(head == null || head.next==null)
			return head;
		ListNode p1 = null, p2 = head;
		while(head!=null)
		{
			p2 = head.next;
			head.next = p1;
			p1 = head;
			head = p2;
		}
		return p1;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		ListNode head1 = LinkedList.createLinkedList(11,"unsorted");
		LinkedList.displayLinkedList(head1);
		System.out.println(isPalindrome(head1));
		//ListNode reverse = reverse(head1);
		//LinkedList.displayLinkedList(reverse);
	}		
}
