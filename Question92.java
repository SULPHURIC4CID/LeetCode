/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 92

*/

public class Question92
{	
	public static ListNode reverse(ListNode head)
	{
		if(head==null || head.next==null)
			return head;
		ListNode p1 = null;
		ListNode p2 = head;
		while(head!=null)
		{
			p2 = head.next;
			head.next = p1;
			p1 = head;
			head = p2;
		}
		return p1;
	}
	
	public static ListNode reverseBetween(ListNode head, int left, int right)
	{
		if(head==null || head.next==null || left==right)
			return head;		
			
		ListNode temp = head;
		int length = 0;
		while(temp!=null)
		{
			length++;
			temp = temp.next;
		}
		temp = head;
		ListNode pointer = null;
		ListNode temp2 = new ListNode();
		ListNode temp3 = null;
		ListNode temp4 = null;	
		for(int i = 1;i<=length;i++)
		{
			if(i<left)
			{
				pointer = temp;
				temp = temp.next;
			}
			else
			{					
				temp3 = temp2;
				for(int j = left;j<=right;j++)
				{
					
					temp2.val = temp.val;					
					if(j==right)
					{
						temp4 = temp2.next;
						temp2.next = null;
					}
					else
					{
						temp2.next = temp.next;
						temp2 = temp2.next;
					}
					
					temp = temp.next;
				}
				temp2 = temp3;
				temp3 = reverse(temp3);
				temp2.next = temp4;
				
				break;				
			}
		}
		if(left>1)
		{
			pointer.next = temp3;
			LinkedList.display(head);
			return head;
		}
		else
		{
			LinkedList.display(temp3);
			return temp3;
		}	
    }
	
	public static void main(String[] args)
	{
		ListNode head = LinkedList.create(10,"unosrted");
		LinkedList.display(head);
		int left = 1;
		int right = 9;
		ListNode result = reverseBetween(head,left,right);
		//LinkedList.display(result);
	}
}
