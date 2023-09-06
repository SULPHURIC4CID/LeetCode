/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 143

*/

public class Question143
{
	public static ListNode reverse(ListNode head)
	{
		if(head==null || head.next==null)
			return head;
		ListNode p1 = null;
		ListNode p2 = head.next;
		while(head!=null && p2!=null)
		{
			head.next = p1;
			p1 = head;
			head = p2;			
			p2 = head.next;
		}
		head.next = p1;
		p1 = head;
		return p1;
	}
	
	
	public static void reorderList(ListNode head) 
	{
		ListNode temp = null;
		ListNode result = head;
		while(head!=null)
		{
			temp = head;
			temp.next = reverse(head.next);
			head = temp.next;
		}
		LinkedList.display(result);
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		ListNode head = LinkedList.create(4,"unsorted");
		LinkedList.display(head);		
		reorderList(head);
	}		
}
