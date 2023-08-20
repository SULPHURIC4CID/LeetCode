public class LinkedList
{
	public static ListNode reverse(ListNode head)
	{
		if(head == null || head.next==null)
			return head;
		ListNode p1 = null, p2 = head;
		while(head!=null)
		{
			p2 = head.next;
			head.next = p1;
			p1 = head;
			head = p2;
		}
		return p1;
	}
	
	
	public static ListNode create(int n,String s)
	{
		if(n==0)
			return null;
		int[] arr = new int[n];
		for(int i = 0;i<n;i++)
			arr[i] = (int)(Math.random()*10);
		if(s.equals("sorted"))
			for(int i = 0;i<n;i++)
				for(int j = 0;j<n-i-1;j++)
					if(arr[j]>arr[j+1])
					{
						arr[j] = arr[j]^arr[j+1];
						arr[j+1] = arr[j]^arr[j+1];
						arr[j] = arr[j]^arr[j+1];
					}
		ListNode head = new ListNode();
		ListNode result = head;
		head.val = arr[0];
		ListNode newNode;
		for(int i = 1;i<n;i++)
		{
			newNode = new ListNode();
			head.next = newNode;
			head = head.next;
			head.val = arr[i];			
		}
		head.next = null;
		return result;
	}
	
	
	public static void display(ListNode head)
	{
		System.out.println();
		if (head==null)
		{
			System.out.print("NULL");
			System.out.println();
			return;
		}
		if(head.next==null)
		{
			System.out.print(head.val);
			System.out.println();
			return;
		}
		while(head.next!=null)
		{
			System.out.print(head.val+"->");
			head = head.next;
		}
		System.out.print(head.val);
		System.out.println();
	}
}