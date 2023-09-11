/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 206

Decription:





*/


public class Question206
{
	public static ListNode reverseList(ListNode head)
	{
		if(head==null)
			return null;
		if(head.next==null)
			return head;
        ListNode p1 = null;
		ListNode p2 = head;
		while(head.next!=null)
		{
			p2 = head.next;
			head.next = p1;
			p1 = head;
			head = p2;			
		}
		head.next = p1;
		p1 = head;
		return p1;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		ListNode head1 = LinkedList.createLinkedList(1,"sorted");		
		LinkedList.displayLinkedList(head1);		
		ListNode answer = reverseList(head1);
		LinkedList.displayLinkedList(answer);
	}	
		
}
