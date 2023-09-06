/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 142

*/

public class Question142
{
	public static boolean isPresent(ListNode[] array, int index, ListNode node)
	{
		if(index==0)
			return false;
		for(int i = 0;i<index;i++)
			if(array[i] == node)
				return true;
		return false;
	}

	public static ListNode detectCycle(ListNode head)
	{
		ListNode[] array = new ListNode[10001];
		int index = 0;
		boolean flag = true;
		while(head!=null)
		{
			if(isPresent(array,index,head))
			{				
				flag = false;
				break;
			}
			else
			{
				array[index] = head;
				index++;
			}
			head=head.next;
		}
		if(flag)
			return null;
		else
			return head;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		ListNode head = LinkedList.create(15,"unsorted");
		LinkedList.display(head);		
		
		
		//Creating a manual loop in the linked list
		ListNode temp = head;
		ListNode node = null;
		int i = 0;
		int position = 6;
		while(temp!=null)
		{
			if(i==position)
				node = temp;
			if(temp.next==null)
			{
				temp.next = node;
				break;
			}
			temp = temp.next;	
			i++;
		}
		ListNode ans = detectCycle(head);
		//LinkedList.display(ans);
		
		
	}		
}
