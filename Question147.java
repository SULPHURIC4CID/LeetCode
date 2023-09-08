/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 147

*/

public class Question147
{	
	public static ListNode insertionSortList(ListNode head) 
	{
        if(head==null || head.next==null)
			return head;
		int index = 1;
		
		ListNode start = head;
		head = head.next;
		
		ListNode pointer1 = null;
		ListNode pointer2 = null;
		
		while(head!=null)
		{
			
		}
    }
	
	public static void main(String[] args)
	{
		ListNode head1 = LinkedList.create(7,"unsorted");
		LinkedList.display(head1);
		ListNode result = insertionSortList(head1);
		LinkedList.display(result);
	}
}
