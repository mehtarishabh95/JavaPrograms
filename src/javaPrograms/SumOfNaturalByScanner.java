package javaPrograms;

import java.util.Scanner;

public class SumOfNaturalByScanner 
{
	public static void usingwhile()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no");
		int i = sc.nextInt();
		System.out.println("enter end value");
		int j = sc.nextInt();
		
		int sum=0;
		while (i<=j) 
		{
			sum=sum+i;
			i++;
			System.out.println(sum);
			
		}
		
	}
	public static void usingdoWhile()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no");
		int i = sc.nextInt();
		System.out.println("enter end value");
		int j = sc.nextInt();
		
		int sum=0;
		do
		{
			sum=sum+i;
			i++;
			System.out.println(sum);
		}
		while(i<=j);
	}
	public static void main(String[] args)
	{
		usingwhile();
		
		usingdoWhile();
	}

}
