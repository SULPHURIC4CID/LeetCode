/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 24

*/
/*

TestCases-


*/
public class Question24
{
	public static ListNode swapPairs(ListNode head) 
	{
		if(head==null || head.next==null)
			return head;
		ListNode p1 = head;
		ListNode p2 = head.next;
		ListNode temp,temp2=p1,start=p2;
		boolean flag = true;
		while(p1!=null && p2!=null)
		{
			if(flag)
			{
				temp = p2.next;
				p2.next = p1;
				p1.next = temp;
				temp2 = p1;
				flag = false;
			}
			else
			{
				temp = p2.next;
				p2.next = p1;
				p1.next = temp;
				temp2.next = p2;
				temp2 = p1;
			}
			if(temp==null)
				break;
			p1 = temp;
			p2 = p1.next;
		}
		return start;		
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");	
		ListNode head = LinkedList.create(15,"sorted");
		LinkedList.display(head);
		head = swapPairs(head);
		LinkedList.display(head);	
	}		
}
