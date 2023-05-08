package javaPrograms;

import java.util.Scanner;

public class SwitchChar {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value 1:");
		int num1=sc.nextInt();
		System.out.println("enter value 2:");
		int num2=sc.nextInt();
		
		System.out.println("enter the operation : \n + \n - \n * \n / \n % \n");
		//this line 15 is special
		char option = sc.next().charAt(0);
		
		switch (option)
		{
		case '+':
		{
			int sum=num1+num2;
			System.out.println("addition is :"+sum);
		}
		break;
		case '-':
		{
			int sub=num1-num2;
			System.out.println("subtraction is:"+sub);			
		}
		break;
		case '*':
		{
			int mult=num1*num2;
			System.out.println("multipliction is :"+mult);
		}
		break;
		case '/':
		{
			double quo = num1/num2;
			System.out.println("quotient is :"+quo);
		}
		break;
		case '%':
		{
			int rem=num1%num2;
			System.out.println("remainder is :"+rem);
		}
		break;
		default :
		{
			System.out.println("enter valid operation!");
		}
		}
		
		

	}

}
