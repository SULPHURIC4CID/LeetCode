/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 21

Decription:





*/


public class Question21
{
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) 
	{
		ListNode result;
		if(list1==null && list2==null)
		{
			result = null;
			return result;
		}
		if(list1==null && list2!=null)
			return list2;
		if(list1!=null && list2==null)
			return list1;
		if(list1.val < list2.val)
		{
			result = list1;
			list1 = list1.next;
		}			
		else
		{
			result = list2;
			list2 = list2.next;
		}			
		ListNode k;
		k = result;
		while(list1!=null && list2!=null)
		{
			if(list1.val<list2.val)
			{
				k.next = list1;
				list1 = list1.next;
			}
			else
			{
				k.next = list2;
				list2 = list2.next;
			}
			k = k.next;
		}
		if(list1!=null)
			k.next = list1;
		else if(list2!=null)
			k.next = list2;
		return result;
    }
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		ListNode head1 = LinkedList.createLinkedList(2,"sorted");
		ListNode head2 = LinkedList.createLinkedList(10,"sorted");
		LinkedList.displayLinkedList(head1);
		LinkedList.displayLinkedList(head2);
		
		ListNode answer = mergeTwoLists(head1,head2);
		LinkedList.displayLinkedList(answer);
	}	
		
}
