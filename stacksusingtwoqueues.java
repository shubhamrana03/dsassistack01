import java.util.*;
class queue
{
	private int data;
	private queue next;
	queue head =null;
	public void push(int data2)
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
	}
	public int pop()
	{
		queue temp = null;
		if(head==null)
			System.out.println("underflow");
		else
		{
			temp=head;
		    head=head.next;
		}
		return temp.data;
	}
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		return false;
	}
	public void display()
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
	stack Head1=null;
	public void push(int data2)
	{
		stack temp = new stack();
		temp.data=data2;
		if(Head1==null)
			Head1=temp;
		else
		{
			temp.next=Head1;
			Head1=temp;
		}
	}
	public int pop()
	{
	    stack temp = null;
		if(Head1==null)
			System.out.println("underflow");
		else
		{
			temp=Head1;
		    Head1=Head1.next;
		}
		return temp.data;
	}
	public boolean isEmpty()
	{
		if(Head1==null)
			return true;
		return false;
	}
	public void display()
	{
		stack ptr = Head1;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
}

public class stacksusingtwoqueues {

	public static void main(String[] args) {
		stack S1 = new stack();
		System.out.println("Creating Stack:-");
		for(int i=1;i<=5;i++)
		 S1.push(i*10);
		System.out.println("Displaying Stack");
		S1.display();
		queue Q1 = new queue();
		queue Q2 = new queue();
		System.out.println("Transfering Stack to first queue:-");
		while(true)
		{
			if(S1.isEmpty())
				break;
			Q1.push(S1.pop());
		}
		Q1.display();
		System.out.println("Transfering first queue into second queue:-");
		while(true)
		{
			if(Q1.isEmpty())
				break;
			Q2.push(Q1.pop());
		}
		Q2.display();
	}
}