/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 2807

*/

public class Question2807
{	
	public static int gcd(int a,int b)
	{
		for(int i=Math.min(a,b);i>0;i--)
			if(b%i==0 && a%i==0)
				return i;
		return 1;
	}
	
	
	public static ListNode insertGreatestCommonDivisors(ListNode head) 
	{
        if(head.next==null)
			return head;
		ListNode gcd = null;
		ListNode pointer = null;
		ListNode temp = head;
		while(temp!=null && temp.next!=null)
		{
			gcd = new ListNode(gcd(temp.val,temp.next.val));
			pointer = temp.next;
			temp.next = gcd;
			gcd.next = pointer;
			temp = pointer;
		}
		return head;
    }
	//[18,6,10,3]
	
	public static void main(String[] args)
	{
		ListNode head = LinkedList.create(4,"unsorted");
		LinkedList.display(head);
		ListNode result = insertGreatestCommonDivisors(head);
		LinkedList.display(result);
	}
}
