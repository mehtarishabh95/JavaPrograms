package javaPrograms;

import java.util.Scanner;

public class SwapingEx2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 no");
		int a=sc.nextInt();
		System.out.println("enter 2 no");
		int b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("1 no is : "+a);
		System.out.println("2 no is : "+b);

	}

}
