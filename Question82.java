/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 82
*/

import java.util.*;

public class Question82
{
	public static ListNode deleteDuplicates(ListNode head) 
	{
		//Singleton Checks
		if(head == null || head.next==null)
			return head;
		
		ListNode finalHead = null;
		ListNode result = null;
		int length = 0;
		ListNode pointer = null;
		int start = head.val;
		
		//Traversing the Linked List
		while(head!=null)
		{
			if(head.val == start)
			{
				length++;
			}
			else
			{
				if(length==1)
				{
					if(finalHead == null)
					{
						finalHead = pointer;
						result = finalHead;
						finalHead.next = null;						
					}
					else
					{
						finalHead.next = pointer;
						finalHead = finalHead.next;
						finalHead.next = null;						
					}
				}
				start = head.val;
				length = 1;
			}
			pointer = head;
			head = head.next;
		}
		if(length==1)
		{
			if(finalHead == null)
			{
				finalHead = pointer;
				result = finalHead;
				finalHead.next = null;						
			}
			else
			{
				finalHead.next = pointer;
				finalHead = finalHead.next;
				finalHead.next = null;						
			}
		}
		return result;   
    }
	
	public static void main(String[] args)
	{
		//Generate a random sorted linked list
		ListNode head = LinkedList.create(15,"sorted");
		
		LinkedList.display(head);
		
		ListNode result = deleteDuplicates(head);
		LinkedList.display(result);
	}
}