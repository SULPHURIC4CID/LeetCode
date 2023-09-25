/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 1721

*/

public class Question1721
{	
	public static ListNode swapNodes(ListNode head, int k) 
	{
		if(head==null)
			return null;
		if(head.next==null)
			return head;
        int length = 0;
		ListNode temp = head;
		while(head!=null)
		{
			length++;
			head = head.next;
		}
		int position1 = k;
		int position2 = length-k+1;
		int i = 1;
		head = temp;
		ListNode p1=head,p2=head;
		while(head!=null)
		{
			if(position1==position2)
			{
				return head;
			}
			else if(i==position1)
				p1 = head;
			else if(i==position2)
				p2 = head;
			i++;
			head=head.next;
		}
		//Swap values
		int tempVal =  p1.val;
		p1.val = p2.val;
		p2.val = tempVal;
		return temp;		
    }
	
	public static void main(String[] args)
	{
		ListNode head = LinkedList.create(5,"unosrted");
		LinkedList.display(head);
		ListNode result = swapNodes(head,3);
		LinkedList.display(result);
	}
}
