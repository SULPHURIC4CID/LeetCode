/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 83

*/

public class Question83
{
	public static ListNode deleteDuplicates(ListNode head) 
	{
		if(head ==null || head.next == null)
			return head;
		int value = head.val;
		ListNode temp1 = head;
		ListNode temp = head.next;
		while(temp!=null)
		{
			if(temp.val != value)
			{
				value = temp.val;
				temp1.next = temp;
				temp1 = temp;				
			}
			temp = temp.next;
		}
		temp1.next = null;
        return head;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		ListNode head = LinkedList.create(15,"sorted");
		LinkedList.display(head);
		ListNode result = deleteDuplicates(head);
		LinkedList.display(head);
	}		
}
