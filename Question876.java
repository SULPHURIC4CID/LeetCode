/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 876

*/

public class Question876
{	
	public static ListNode middleNode(ListNode head) 
	{
		if(head==null || head.next==null)
			return head;
		if(head.next.next==null)
			return head.next;
		int count=0;
		ListNode temp = head;
		while(head!=null)
		{
			count++;
			head = head.next;
		}
		int i = 0;
		while(temp!=null)
		{
			if(i==count/2)
				break;
			temp = temp.next;	
			i++;
		}
		return temp;
    }
	
	public static void main(String[] args)
	{
		ListNode head = LinkedList.create(11,"unosrted");
		LinkedList.display(head);
		ListNode result = middleNode(head);
		LinkedList.display(result);
	}
}
