import java.util.*;

class queue
{
	private int data;
	private queue next;
	public queue push(queue head,int data2)
	{
		queue temp = new queue();
		temp.data=data2;
		if(head==null)
		{
			head=temp;
		}
		else
		{
			queue ptr = head;
			while( ptr.next != null )
			{
				ptr = ptr.next;
			}
			ptr.next = temp;
		}
		return head;
	}
	public queue pop(queue head)
	{
		if(head==null)
			System.out.println("underflow");
		else
		    head=head.next;
		return head;
	}
	public void display(queue head)
	{
		queue ptr = head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr =ptr.next;
		}
		System.out.println();
	}
}
class stack
{
	private int data;
	private stack next;
	public stack push(stack head,int data2)
	{
		stack temp = new stack();
		temp.data=data2;
		if(head==null)
			head=temp;
		else
		{
			temp.next=head;
			head=temp;
		}
		return head;
	}
	public stack pop(stack head)
	{
		if(head==null)
			System.out.println("underflow");
		else
		    head=head.next;
		return head;
	}
	public void display(stack head)
	{
		stack ptr = head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
}
public class stackQueue {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Type 1 for stack and 2 for Queue");
	  int ch = scan.nextInt();
	  if(ch == 1)
	  {
		  stack head=null;
		  stack S1 = new stack();
		  for(int i=1;i<=4;i++)
		  {
			  head=S1.push(head, i*10);
		  }
		  S1.display(head);
		  head = S1.pop(head);
		  S1.display(head);
		  head=S1.push(head, 60);
		  S1.display(head);
	  }
	  else if(ch == 2)
	  {
		  queue head=null;
		  queue S1 = new queue();
		  for(int i=1;i<=4;i++)
		  {
			  head=S1.push(head, i*10);
		  }
		  S1.display(head);
		  head=S1.pop(head);
		  S1.display(head);
		  head=S1.push(head, 60);
		  S1.display(head);
	  }
	  else
		  System.out.println("Wrong Choice.");

	}

}