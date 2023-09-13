/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 328

*/

public class Question328
{	
	public static ListNode reverse(ListNode head)
	{
		if(head==null || head.next==null)
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
	
	public static ListNode oddEvenList(ListNode head) 
	{
		if(head==null || head.next == null || head.next.next==null)
			return head;
		ListNode pOdd = head, pE = head.next ,pEven = head.next, temp = head.next.next;
		int i = 1;
		while(temp!=null)
		{
			if(i%2==1)
			{
				pOdd.next = temp;
				pOdd = pOdd.next;
			}
			else
			{
				pEven.next = temp;
				pEven = pEven.next;
			}
			i++;
			if(temp.next==null)
			{
				pOdd.next = pE;
				pEven.next = null;
				break;
			}
			temp = temp.next;
		}
		return head;
    }
	
	public static void main(String[] args)
	{
		ListNode head = LinkedList.create(10,"unosrted");
		LinkedList.display(head);
		ListNode result = oddEvenList(head);
		LinkedList.display(result);
	}
}
