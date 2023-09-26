/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 2130

*/

public class Question2130
{	
	public static int pairSum(ListNode head) 
	{
        int length = 0;
		ListNode temp = head;
		while(temp!=null)
		{
			length++;
			temp=temp.next;
		}
		temp = head;
		int[] arr = new int[length];
		int index= 0;
		while(temp!=null)
		{
			arr[index++] = temp.val;
			temp = temp.next;
		}
		int maximum = Integer.MIN_VALUE;
		for(int i = 0;i<index/2+1;i++)
		{
			if((arr[i] + arr[length-i-1])>maximum)
				maximum = (arr[i] + arr[length-i-1]);
		}
		return maximum;
    }
	
	public static void main(String[] args)
	{
		ListNode head = LinkedList.create(5,"unsorted");
		LinkedList.display(head);
		int result = pairSum(head);
		System.out.println(result);
		
	}
}
