package com.spring;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.beans.Expression;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
		Stack s1 = (Stack)context.getBean("s1");
		
		try
		{
			System.out.println("Enter:   1-for push     2-for pop     3-for peek    4-for print");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			if(ch==1 || ch==2 || ch==3 || ch==4)
			{
				switch(ch)
				{
					case 1:
						System.out.println("enter number to push: ");
						int x=sc.nextInt();
						s1.push(x);
						break;
					case 2:
						s1.pop();
						break;
					case 3:
						s1.peek();
					case 4:
						System.out.println("stack is : ");
						s1.printStack();
						break;
					default:
						System.out.println("wrong choice");
				}
				
			}
			else
			{
				System.out.println("Invalid input! Must be a positive integer");
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input! Must be a positive integer");
		}
	}
}
