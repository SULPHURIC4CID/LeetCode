/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 2816

*/

public class Question2816
{	
	public static ListNode reverse(ListNode head)
	{
		if(head==null)
			return null;
		if(head.next==null)
			return head;
		ListNode p1 = null;
		ListNode p2 = head;
		while(head!=null)
		{
			p2 = head.next;
			head.next = p1;
			p1 = head;
			head = p2;
		}
		return p1;
	}
	
	public static ListNode doubleIt(ListNode head) 
	{
        head = reverse(head);
		//LinkedList.display(head);
		ListNode temp = head;
		int carry = 0;
		ListNode pointer = null;
		while(temp!=null)
		{
			temp.val = temp.val*2 +carry;
			carry = temp.val/10;
			temp.val = temp.val % 10;
			if(temp.next==null)
				pointer = temp;
			temp = temp.next;				
		}
		if (carry == 1)
		{	
			ListNode c = new ListNode();
			c.val = 1;
			pointer.next = c;
		}		
		head = reverse(head);
		return head;
    }
	
	public static void main(String[] args)
	{
		ListNode head = LinkedList.create(5,"unsorted");
		LinkedList.display(head);
		
		//ListNode rev = reverse(head);
		//LinkedList.display(rev);
		
		ListNode result = doubleIt(head);
		LinkedList.display(result);		
	}
}
