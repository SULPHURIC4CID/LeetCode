/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 148

*/

public class Question148
{	

	public static ListNode sortList(ListNode head) 
	{
        if(head==null || head.next==null)
			return head;
		ListNode temp = head;
		int length = 0;
		while(temp!=null)
		{
			length++;
			temp = temp.next;
		}
		
		ListNode pointer1,pointer2;
		ListNode start = head;
		ListNode temp11=null;
		boolean flag = true;
		for(int i = 0;i<length;i++)
		{
			temp = start;
			flag = true;
			while(temp.next!=null)
			{
				pointer1 = temp;
				pointer2 = temp.next;
				if(pointer1.val>pointer2.val)
				{	
					if(pointer1 == start)
					{
						pointer1.next = pointer2.next;
						pointer2.next = pointer1;
						if(flag)
						{
							flag = false;
							start = pointer2;							
						}
					}
					else
					{
						pointer1.next = pointer2.next;
						pointer2.next = pointer1;
						temp11.next = pointer2;		
						if(flag)
							flag = false;	
					}
					temp = pointer2;
				}
				else
				{					
					if(flag)
						flag = false;
				}	
				temp11 = temp;
				temp = temp.next;
			}
		}
		return start;
    }
	
	public static void main(String[] args)
	{
		ListNode head = LinkedList.create(7,"unsorted");
		LinkedList.display(head);
		ListNode result = sortList(head);
		LinkedList.display(result);
	}
}
