package com.spring;

public class Stack 
{
	private int size;
	private int arr[] = new int[size];
	private int top=-1;
	
	public int getsize()
	{
		return size;
	}
	
	public void setSize(int size)
	{
		this.size = size;
	}
	
	public void push(int x)
	{
		if(top==size-1)
		{
			System.out.println("Stack is full");
		}
		else
		{
			System.out.println("Inserting: "+x);
			top=top+1;
			arr[top]=x;
		}
	}
	
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("element popped: "+arr[top]);
			top=top-1;
		}
	}
	
	public void peek()
	{
		System.out.println("Element: "+arr[top]);
	}
	
	public void printStack() 
	{
	    for (int i = 0; i <= top; i++) 
	    {
	      System.out.print(arr[i] + ", ");
	    }
	}
}

