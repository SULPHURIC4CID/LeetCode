/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 141

Decription:





*/


public class Question141
{
	public static boolean hasCycle(ListNode head) 
	{	
        ListNode p1 = head;
		ListNode p2 = head;
		while(p1 != null && p2.next!=null)
		{			
			p1 = p1.next;
			p2 = p2.next.next;
			if(p1==p2)
				return true;
			if(p2==null)
				return false;
		}
		return false;
		
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
	}	
		
}
