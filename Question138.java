/*

Author: Ananthanarayanan R
Section: Algorithms
Question: 138

*/

public class Question138
{
	public static Node copyRandomList(Node head) 
	{
		if(head == null)
			return null;
		if(head.next == null)
			return new Node(head.val);
		
		
        Node temp = head;
		int count= 0 ;
		while(head!=null)
		{
			count++;
			head = head.next;
		}
		head = temp;
		System.out.println(count);
		return null;
		
    }
	
	public static int find(ListNode[] array, ListNode node)
	{
		if(array==null || array.length==0)
			return -1;
		if(node == null)
			return -1;
		for(int i = 0;i<array.length;i++)
			if(array[i] == node)
				return i;
		return -1;
	}
	
	public static ListNode copyRandomList(ListNode head) 
	{
		if(head == null)
			return null;
		if(head.next == null)
			return new ListNode(head.val);
		
		
        ListNode temp = head;
		int count= 0 ;
		while(head!=null)
		{
			count++;
			head = head.next;
		}
		head = temp;
		System.out.println("Length is :"+count);
		ListNode[] array = new ListNode[count];
		int index = 0;
		
		ListNode[] array1 = new ListNode[count];
		boolean flag = true;
		while(temp!=null)
		{
			array[index++] = temp;
			ListNode newNode = new ListNode(temp.val);
			temp = temp.next;
			
		}
		
		return null;
		
    }
	
	public static void main(String[] args)
	{
		System.out.println("Main Method starts");
		ListNode head = LinkedList.create(10,"unsorted");
		LinkedList.display(head);
		ListNode res = copyRandomList(head);
		LinkedList.display(res);
	}		
}
