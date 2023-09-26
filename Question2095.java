/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 2095

*/

public class Question2095
{	
	public static ListNode deleteMiddle(ListNode head) 
	{
        if(head==null)
			return null;
		if(head.next==null)
			return null;
		int length=0;
		ListNode temp = head;
		while(head!=null)
		{
			length++;
			head= head.next;
		}
		head  = temp;
		int i = 0;
		while(temp!=null)
		{
			if(i == length/2-1)
			{
				temp.next=temp.next.next;
			}
			temp = temp.next;
			i++;
		}
		return head;
    }
	
	public static void main(String[] args)
	{
		ListNode head = LinkedList.create(7,"unsorted");
		LinkedList.display(head);
		ListNode result = deleteMiddle(head);
		LinkedList.display(result);
	}
}
