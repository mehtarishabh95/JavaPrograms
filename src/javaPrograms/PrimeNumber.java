package javaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i,temp=0;

		if(num==1||num==0)
		{
			System.out.println("Prime number starts from 2");
		}
		else
		{
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
			System.out.println("not a Prime number");
			temp=1;
			break;
			}
		}
		if(temp==0)
		{
		System.out.println("it is a Prime Number");
		}
		}

	}

}
