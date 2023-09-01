/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 61

*/


public class Question61
{	
	public static ListNode rotateRight(ListNode head, int k) 
	{
		if(head == null)
			return head;
        ListNode h = head;
		int count = 0;
		while(head.next!=null)
		{
			count++;
			head = head.next;
		}
		count++;
		head.next = h;
		head = h;
		//System.out.println("Length of the linked list = "+count);
		
		k = k % count;
		//System.out.println("The value of k is : "+k);
		k=count-k;
		while(k>0)
		{
			if(k==1)
			{
				h = head.next;
				head.next = null;
			}
			head  =head.next;
			k--;
		}
		return h;
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		
		//Creating a singly connected linked list of length 10
		ListNode head = new ListNode();
		ListNode start = head;
		for(int i = 0;i<10;i++)
		{
			head.val = i+1;
			if(i==9)
				break;
			head.next = new ListNode();
			head = head.next;			
		}
		head.next = null;
		
		head = start;
		
		//Traversing the linked list displaying its value
		while(start.next!=null)
		{
			System.out.print(start.val+"->");
			start=start.next;
		}
		System.out.print(start.val);
		System.out.println();
		
		int k = 1;
		ListNode result = rotateRight(head,k);
		System.out.println("After invoking the method");
		while(result.next!=null)
		{
			System.out.print(result.val+"->");
			result=result.next;
		}
		System.out.print(result.val);
	}		
}
