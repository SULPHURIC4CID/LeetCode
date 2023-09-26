/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 2487

*/

public class Question2487
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
	
	public static ListNode removeNodes(ListNode head) 
	{
		if(head==null || head.next == null)
			return head;
		ListNode rev = reverse(head);
		ListNode temp = rev;
		int max = temp.val;
		ListNode previous = temp;		
		while(temp!=null)
		{
			if(temp.val<max)
			{
				previous.next = temp.next;
			}
			else
			{
				max = temp.val;
				previous = temp;
			}
			temp = temp.next;
		}
		return reverse(rev);
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		ListNode head = LinkedList.create(15,"unsorted");
		LinkedList.display(head);		
		ListNode result = removeNodes(head);
		LinkedList.display(result);
	}		
}
