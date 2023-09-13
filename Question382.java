/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 382

*/

public class Question382
{	
	ListNode head;
	private int length;
	
	public Question382(ListNode head) {
        if(head==null)
		{
			this.length = 0;
			this.head = head;
		}
		else
		{
			int count=0;
			this.head = head;
			while(head!=null)
			{
				count++;
				head = head.next;
			}
			this.length = count;
		}
    }
	
	public int getRandom() 
	{
		int rand = ((int)(Math.random()*100000))%length;  
		int i = 1;
		int value = 1;
		ListNode temp = head;
		while(head!=null)
		{
			if(i==rand+1)
			{
				value = head.val;
				head = temp;
				break;
			}
			i++;
			head = head.next;
		}
		return value;
    }	
}
