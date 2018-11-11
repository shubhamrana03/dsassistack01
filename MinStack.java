import java.util.*;
class stack
{
	private int data;
	private stack next;
	stack Head1=null;
	int Min=1000000;
	public void push(int data2)
	{
		stack temp = new stack();
		temp.data=data2;
		if(Min>temp.data)
			Min = temp.data;
		if(Head1==null)
			Head1=temp;
		else
		{
			temp.next=Head1;
			Head1=temp;
		}
	}
	public int peek()
	{
		return Head1.data;
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

public class MinStack {

	public static void main(String[] args) {
		stack S1 = new stack();
		System.out.println("creating Stack:-");
		for(int i=1;i<=5;i++)
		 S1.push(i*10);
		System.out.println("Displaying Stack:-");
		S1.display();
		System.out.println("Minimum="+S1.Min);
		S1.pop();
		System.out.println("After pop:-");
		S1.display();
		}
}