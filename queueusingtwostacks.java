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

public class queueusingtwostacks {

	public static void main(String[] args) {
		queue Q1 = new queue();
		System.out.println("Creating Queue:-");
		for(int i=1;i<=5;i++)
		 Q1.push(i*10);
		System.out.println("Displaying Queue:-");
		Q1.display();
		stack S1 = new stack();
		stack S2 = new stack();
		System.out.println("Transfering Queue to first Stack:-");
		while(true)
		{
			if(Q1.isEmpty())
				break;
			S1.push(Q1.pop());
		}
		S1.display();
		System.out.println("Transfering first Stack into second Stack:-");
		while(true)
		{
			if(S1.isEmpty())
				break;
			S2.push(S1.pop());
		}
		S2.display();
	}
}