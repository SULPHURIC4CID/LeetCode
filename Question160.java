/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 160

*/

public class Question160
{	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) 
	{
        //length of A
		int lengthA = 0;
		ListNode temp = headA;
		while(temp!=null)
		{
			lengthA++;
			temp = temp.next;
		}
		
		//length of B
		int lengthB = 0;
		temp = headB;
		while(temp!=null)
		{
			lengthB++;
			temp = temp.next;
		}
		
		ListNode pointerA=headA,pointerB = headB;
		while(pointerA!=null)
		{
			pointerB = headB;
			while(pointerB!=null)
			{
				if(pointerA==pointerB)
					return pointerA;
				pointerB = pointerB.next;
			}
			pointerA = pointerA.next;
		}
		return null;
		
    }
	
	public static void main(String[] args)
	{
		ListNode head1 = LinkedList.create(7,"unsorted");
		LinkedList.display(head1);
		ListNode head2 = LinkedList.create(18,"unsorted");
		LinkedList.display(head2);
		
		ListNode headA = head1,headB = head2;
		/*
		for(int i = 0;i<4;i++)
			head1 = head1.next;
		for(int i = 0;i<7;i++)
			head2 = head2.next;
		head1.next = head2;
		
		LinkedList.display(head1);
		LinkedList.display(head2);
		*/
		ListNode result = getIntersectionNode(headA,headB);
		LinkedList.display(result);
	}
}
