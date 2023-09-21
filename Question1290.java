/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 1290

*/

public class Question1290
{	
	public static ListNode reverse(ListNode head)
	{
		if(head==null || head.next==null)
			return head;
		ListNode p1 = null, p2 = head;
		while(head!=null)
		{
			p2 = head.next;
			head.next = pi;
			p1 = head;
			head = p2;
		}
		return p1;
	}
	
	public static int getDecimalValue(ListNode head) 
	{
        head = reverse(head);
		int sum = 0;
		int index= 0;
		while(head!=null)
		{
			sum+=(Math.pow(2,index++)*head.val);
			head = head.next;
		}
		return sum;
    }
	
	public static void main(String[] args)
	{
		ListNode head = LinkedList.create(7,"unsorted");
		LinkedList.display(head);
	}
}
