/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 1019

*/

public class Question1019
{	
	public static int[] nextLargerNodes(ListNode head) 
	{		
		ListNode temp = head;
		int length = 0;
		while(head!=null)
		{
			length++;
			head = head.next;
		}
		head = temp;
		int[] arr = new int[length];
		if(head.next==null)
		{
			arr[0] = 0;
			return arr;
		}
        
		ListNode pointer = head;
		int index = 0;
		int value = 0;
		while(pointer!=null)
		{
			temp = pointer.next;
			value = pointer.val;
			while(temp!=null)
			{
				if(temp.val>pointer.val)
				{
					pointer.val = temp.val;
					arr[index++] = temp.val;
					break;
				}
				temp = temp.next;
			}
			if(value == pointer.val)
			{
				pointer.val = 0;
				arr[index++] = 0;
			}
			pointer = pointer.next;			
		}
		return arr;
    }
	
	public static void main(String[] args)
	{
		ListNode head = LinkedList.create(5,"unsorted");
		LinkedList.display(head);
		int[] result = nextLargerNodes(head);
		Array.display(result);
		
	}
}
