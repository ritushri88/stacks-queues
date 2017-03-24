package practice;

import java.util.Scanner;

class Node
{
	int val;
	Node next;
	
	public Node(int x)
	{
		this.val=x;
	}
}

public class Stack_LinkedListImp {
	
	Node top;
	
	public boolean isEmpty()
	{
		if(top==null)
			return true;
		else
			return false;
	}
	
	public void push(int x)
	{
		Node n=new Node(x);
		if(top==null)
			top=n;
		else
		{
			n.next=top;
			top=n;
		}
	}
	
	public void pop()
	{
		if(isEmpty())
			System.out.println("No element to pop. Stack Underflow.");
		else
		{
			Node n=top;
			top=top.next;
			System.out.println("Poped element is: "+n.val);
		}
	}
	
	public void peek()
	{
		if(isEmpty())
			System.out.println("No element to print.");
		else
		{
			System.out.print("Stack content are: ");
			Node n=top;
			while(n.next!=null)
			{
				System.out.print(n.val+ " ");
				n=n.next;
			}
			System.out.println(n.val);			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		char loop='y';
		System.out.println("Welcome to Stack Linked List Implementation");
		Stack_LinkedListImp stack=new Stack_LinkedListImp();
		while(loop=='y' || loop=='Y')
		{
			System.out.println("Select the operation you want to perform");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			int choice=in.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("Enter the number to be pushed onto stack:");
			int x=in.nextInt();
			stack.push(x);
			break;
			case 2: stack.pop(); break;
			case 3: stack.peek(); break;
			default: System.out.println("Sorry you entered wrong choice. Please try again."); break;
			}
			
			System.out.println("Do you wish to continue? Y|N");
			loop=in.next().charAt(0);
		}
		in.close();
	}

}
