/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 203

*/

public class Question203
{
	public static ListNode removeElements(ListNode head, int val) 
	{
		if(head==null)
			return null;
		ListNode temp = head;
		ListNode previous = null;
		boolean flag = true;
		while(temp!=null)
		{
			if(temp.val == val && previous==null)
			{				
				head = temp.next;
				previous = null;
			}
			else if(temp.val == val)
			{
				previous.next = temp.next;
			}
			else if(temp.val!=val)
			{
				previous = temp;
			}
			temp = temp.next;
		}
		return head;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		ListNode head = LinkedList.create(15,"unsorted");
		LinkedList.display(head);		
		int val = 8;
		ListNode result = removeElements(head,val);
		LinkedList.display(result);	
	}		
}
