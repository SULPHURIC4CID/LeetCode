/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 19

*/
/*

TestCases-



*/
public class Question19
{	

	public static ListNode removeNthFromEnd(ListNode head, int n) 
	{
		ListNode temp = head;		
		ListNode headTemp = head;
		boolean flag = true;
		int count = 0;
		while(temp.next!=null)
		{
			count++;
			temp = temp.next;
		}
		count++;
		n = count - n + 1;
		count= 1;
		
		if(n==count)
			return head.next;
		
		while(head.next!=null)
		{
			if(n==count)
			{
				temp.next = head.next;
				flag = false;
				break;
			}
			count++;
			temp = head;
			head = head.next;			
		}			
		if(flag)
			temp.next = head.next;
		return headTemp;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		ListNode head = LinkedList.createLinkedList(10,"unsorted");
		LinkedList.displayLinkedList(head);
		int n = 1;
		ListNode head2 = removeNthFromEnd(head,n);
		LinkedList.displayLinkedList(head2);
	}		
}
