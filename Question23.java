/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 23

*/
/*

TestCases-



*/
public class Question23
{	

	public static ListNode mergeKLists(ListNode[] lists) 
	{
		//Failure Cases
		if(lists == null || lists.length==0)
			return null;
		
		ListNode head = null;
		ListNode head2 = null;
		ListNode temp = null;
		
		int index = 0;
		int nullCount = 0;
		int min=Integer.MAX_VALUE;
		boolean flag = true;
		
		while(nullCount<lists.length)
		{
			min=Integer.MAX_VALUE;
			nullCount = 0;
			for(int i = 0;i<lists.length;i++)
			{
				if(lists[i] == null)
					nullCount++;
				else
				{
					if(lists[i].val<min)
					{
						min = lists[i].val;
						temp = lists[i];
						index = i;
					}
				}
			}
			if(nullCount==lists.length)
				break;
			else
			{
				if(flag)
				{
					head = temp;
					head2 = head;
					flag = false;
				}
				else
				{
					head.next = temp;
					head = head.next;
				}
				lists[index] = lists[index].next;
			}			
		}		
		return head2;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		ListNode head1 = LinkedList.createLinkedList(10,"sorted");
		LinkedList.displayLinkedList(head1);
		ListNode head2 = LinkedList.createLinkedList(2,"sorted");
		LinkedList.displayLinkedList(head2);
		ListNode head3 = LinkedList.createLinkedList(3,"sorted");
		LinkedList.displayLinkedList(head3);
		ListNode head4 = LinkedList.createLinkedList(7,"sorted");
		LinkedList.displayLinkedList(head4);
		
		ListNode[] array = new ListNode[4];
		array[0] = head1;
		array[1] = head2;
		array[2] = head3;
		array[3] = head4;
		
		ListNode result = mergeKLists(array);
		LinkedList.displayLinkedList(result);
		
	}		
}
