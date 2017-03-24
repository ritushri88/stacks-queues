package practice;

import java.util.Scanner;

public class Stack_ArrayImp {

	int size;
	int stack[];
	int top;
	
	public Stack_ArrayImp(int size)
	{
		this.size=size;
		stack=new int[this.size];
		top=-1;
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
			return false;
	}
	
	public void push(int x)
	{
		if(top==size-1)
		{
			System.out.println("Sorry cannot push. Stack overflow.");
		}
		else
		{
			stack[++top]=x;
		}
	}
	
	public void pop()
	{
		if (isEmpty())
		{
			System.out.println("Sorry cannont pop. Stack underflow.");
		}
		else
		{
			int x=stack[top--];
			System.out.println("Poped element is: "+x);
		}
	}
	
	public void peek()
	{
		if(isEmpty())
			System.out.println("No elements in the satck");
		else
		{
			System.out.print("Stack contents are: ");
			for(int i=0;i<=top;i++)
			{
				System.out.print(stack[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		char loop='y';
		System.out.println("Welcome to Stack Array Implementation");
		System.out.println("Enter the size of the stack:");
		Stack_ArrayImp s=new Stack_ArrayImp(in.nextInt());
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
			s.push(x);
			break;
			case 2: s.pop(); break;
			case 3: s.peek(); break;
			default: System.out.println("Sorry you entered wrong choice. Please try again."); break;
			}
			
			System.out.println("Do you wish to continue? Y|N");
			loop=in.next().charAt(0);
		}
		in.close();
	}

}
