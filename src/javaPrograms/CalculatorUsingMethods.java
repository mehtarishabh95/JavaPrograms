package javaPrograms;

import java.util.Scanner;

public class CalculatorUsingMethods 
{
	public static int add(int a,int b)
	{		
		return a+b;
	}
	
	public static double add(double a,double b)
	{		
		return a+b;
	}
	
	public static int sub(int a,int b)
	{
		return a-b;
	}
	
	public static double sub(double a,double b)
	{
		return a-b;
	}
	
	public static int mult(int a,int b)
	{
		return a*b;
	}
	
	public static double mult(double a,double b)
	{
		return a*b;
	}
	
	
	public static double div(double a, double b)
	{
		return a/b;
	}
	
	public static double div(int a, int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 number");
		double x=sc.nextDouble();
		System.out.println("enter 2 number");
		double y=sc.nextDouble();
		System.out.println("enter 3 number");
		int a=sc.nextInt();
		System.out.println("enter 4 number");
		int b=sc.nextInt();
		
		System.out.println("addition of 1&2 ="+add(a,b));
		System.out.println(sub(a,b));
		System.out.println(mult(a,b));
		System.out.println(div(a,b));
		
		System.out.println(add(x,y));
		System.out.println(sub(x,y));
		System.out.println(mult(x,y));
		System.out.println(div(x,y));

	}
}
