package javaPrograms;

import java.util.Scanner;

public class SwapingNumbers {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st no: ");
		int a = sc.nextInt();
		System.out.println("enter 2nd no");
		int b = sc.nextInt();
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("value of 1st is :"+a);
		System.out.println("value of 2nd is :"+b);

	}

}
