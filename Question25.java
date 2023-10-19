/*

Author: Ananthanarayan R
Section: Algorithms

Question: 25
*/

public class Question25
{
	public static ListNode reverse(ListNode head)
	{
		if(head==null || head.next==null)
			return head;
		ListNode p1 = null;
		ListNode p2 = null;
		while(head!=null)
		{
			p2=head.next;
			head.next = p1;
			p1 = head;
			head = p2;
		}
		return p1;		
	}
	
	public static ListNode append(ListNode list1, ListNode list2)
	{
		if(list2==null)
			return list1;
		if(list1==null)
			list1 = list2;
		else
		{
			ListNode head = list1;
			while(head!=null)
			{
				if(head.next==null)
				{
					head.next = list2;
					break;
				}
				head = head.next;
			}
		}
		return list1;
	}
	
	public static ListNode reverseKGroup(ListNode head, int k) 
	{
        /*
		Pseudo Code-
		0. Create a result null list.
		1. Traverse the linked list.
		2. Split the list into two lists (k nodes) and (length-k) nodes.
		3. Reverse the (k nodes) list.
		4. Append the reversed list to the rsult list.
		5. Continue traversing the <length-k) nodes list and repeat the process.
		6. Stop when (length-k)<k.		
		*/
		
		ListNode result = null;
		ListNode temp = head;
		ListNode temp2 = head;
		ListNode list1 = null;
		ListNode list2 = null;
		int count = 0;
		while(head!=null)
		{
			if(count==0)
				temp2 = head;
			count++;
			if(count==k) // Splitting Lists
			{
				list1 = temp2;
				list2 = head.next;
				head.next = null;
				list1 = reverse(list1);	// Reversing list1
				result = append(result,list1);  //Appending reversed list to result
				count = 0;	// reset count
				head = list2;
			}
			else
			{
				head = head.next;
			}
		}
		result = append(result,list2);
		return result;
    }
	
	public static void main(String[] args)
	{
		ListNode head = LinkedList.create(4,"");
		int k = 1;
		LinkedList.display(head);
		ListNode result = reverseKGroup(head,k);
		LinkedList.display(result);
	}
}