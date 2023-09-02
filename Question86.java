/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 86

*/

public class Question86
{	
	public static ListNode partition(ListNode head, int x) 
	{
		if(head==null || head.next ==null)
			return head;
        ListNode temp = head;
		ListNode list1=null, list2=null;
		ListNode p1=null,p2=null;
		boolean flag1 = true, flag2 = true;
		int count1=0,count2=0;
		while(temp!=null)
		{
			if(temp.val<x)
			{
				count1++;
				if(flag1)
				{
					list1 = temp;
					flag1=false;
					p1 = temp;
				}
				else
				{
					list1.next = temp;
					list1 = list1.next;
				}	
			}
			else
			{
				count2++;
				if(flag2)
				{
					list2 = temp;
					flag2=false;
					p2 = temp;
				}
				else
				{
					list2.next = temp;
					list2 = list2.next;
				}	
			}
			temp = temp.next;
		}
		if(count1==0 || count2==0)
			return head;
		list1.next = p2;
		list2.next = null;
		return p1;		
    }
	
	public static void main(String[] args)
	{
		ListNode head = LinkedList.create(7,"unsorted");
		LinkedList.display(head);
		ListNode result = partition(head,5);
		LinkedList.display(result);
	}
}
