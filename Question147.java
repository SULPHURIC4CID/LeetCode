/*

Author: Ananthanarayanan R
Section: Algorithms

Question: 147
*/

import java.util.*;

public class Question147
{
	public static ListNode insert(ListNode element, ListNode sortedList)
	{
		ListNode temp = sortedList;
		ListNode prev = null;
		ListNode curr = null;
		
		int index =1;
		boolean isInserted = false;
		//iterate over the sortedList
		while(sortedList!=null)
		{
			if(sortedList.val>element.val)
			{
				//insert element before sortList
				if(index==1)				{
					
					element.next = sortedList;
					temp = element;
					isInserted = true;
					break;
				}
				else
				{
					prev.next = element;
					element.next = sortedList;
					isInserted = true;
					break;
				}
			}
			index++;
			prev = sortedList;
			sortedList = sortedList.next;			
		}
		if(!isInserted) // insert in the end
			prev.next = element;
		return temp;
	}
	
	public static ListNode insertionSortList(ListNode head) 
	{
		if(head == null || head.next==null)
			return head;
		
		ListNode sortedList = null;
		ListNode remainingList = null;
		
		//initial split
		remainingList = head;
		sortedList = head;
		remainingList = head.next;
		sortedList.next = null;
		
		
		//iterateover the remainingList elements
		while(remainingList != null)
		{
			//split the list
			ListNode element = remainingList;
			remainingList = remainingList.next;
			element.next = null;			
			
			sortedList = insert(element,sortedList);
		}
		
        return sortedList;
    }
	
	public static void main(String[] args)
	{
		ListNode head = LinkedList.create(10,"unsorted");
		LinkedList.display(head);
		ListNode result = insertionSortList(head);
		LinkedList.display(result);
	}
}
