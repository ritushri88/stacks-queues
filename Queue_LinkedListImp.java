package practice;

import java.util.Scanner;

public class Queue_LinkedListImp {

	Node front;
	Node rear;
	
	public boolean isEmpty()
	{
		if (front==null)
			return true;
		else 
			return false;
	}
	
	public void insert(int x)
	{
		Node n=new Node(x);
		if(isEmpty())
		{
			front=rear=n;
		}
		else
		{
			rear.next=n;
			rear=n;
		}
	}
	
	public void delete()
	{
		if(isEmpty())
			System.out.println("No element to delete in queue.");
		else
		{
			Node n=front;
			front=front.next;
			System.out.println("Deleted item is: "+n.val);
		}
	}
	
	public void peek()
	{
		if(isEmpty())
			System.out.println("No element to print in queue.");
		else
		{
			System.out.println("Elements in the queue are: ");
			Node n=front;
			while(n.next!=null)
			{
				System.out.println(n.val);
				n=n.next;
			}
			System.out.println(n.val);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		char loop='y';
		System.out.println("Welcome to Queue Linked List Implementation");
		Queue_LinkedListImp q=new Queue_LinkedListImp();
		while(loop=='y' || loop=='Y')
		{
			System.out.println("Select the operation you want to perform");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Peek");
			int choice=in.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("Enter the number to be insert onto queue:");
			int x=in.nextInt();
			q.insert(x);
			break;
			case 2: q.delete(); break;
			case 3: q.peek(); break;
			default: System.out.println("Sorry you entered wrong choice. Please try again."); break;
			}
			
			System.out.println("Do you wish to continue? Y|N");
			loop=in.next().charAt(0);
		}
		in.close();
	}

}
