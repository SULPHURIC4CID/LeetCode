/*

Author: Ananthanarayanan R

Section: Algorithms
Question: 817

*/
/*

TestCases-



*/
public class Question817
{	
	public static boolean inArray(int target, int[] nums)
	{
		for(int i = 0;i<nums.length;i++)
		{
			if(nums[i] == target)
				return true;
		}
		return false;
	}
	
	public static int numComponents(ListNode head, int[] nums) 
	{
        int length = 0;
		int count = 0;
		while(head!=null)
		{
			if(inArray(head.val,nums))
			{
				count++;
			}
			else
			{
				if(count>0)
				{
					length++;
				}
				count=0;
			}
			head = head.next;
		}
		if(count>0)
			length++;
		return length;
    }
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		ListNode head1 = LinkedList.createLinkedList(11,"unsorted");
		LinkedList.displayLinkedList(head1);
		System.out.println(isPalindrome(head1));
		//ListNode reverse = reverse(head1);
		//LinkedList.displayLinkedList(reverse);
	}		
}
