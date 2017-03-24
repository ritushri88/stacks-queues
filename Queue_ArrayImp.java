package practice;

import java.util.Scanner;

public class Queue_ArrayImp {

	int size;
	int queue[];
	int front;
	int rear;
	
	public Queue_ArrayImp(int size)
	{
		this.size=size;
		this.queue=new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isEmpty()
	{
		if(front==-1)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(rear==size-1)
			return true;
		else
			return false;
	}
	
	public void insert(int x)
	{
		if(isFull())
			System.out.println("Sorry cannot insert. Queue overflow.");
		else if(front==-1 && rear==-1)
		{
			front=0;
			rear=0;
			queue[rear]=x;
		}
		else
		{
			queue[++rear]=x;
		}
			
	}
	
	public void delete()
	{
		if(isEmpty())
			System.out.println("Queue is empty. Nothing to delete.");
		else
		{
			int x=queue[front];
			System.out.println("Deleted item is: "+x);
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				front++;
			}
		}
	}
	
	public void peek()
	{
		if(isEmpty())
			System.out.println("Queue is empty. Nothing to print.");
		else
		{
			System.out.print("Queue contents are: ");
			for(int i=front;i<=rear;i++)
			{
				System.out.print(queue[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		char loop='y';
		System.out.println("Welcome to Queue Array Implementation");
		System.out.println("Enter the size of the queue:");
		Queue_ArrayImp q=new Queue_ArrayImp(in.nextInt());
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
