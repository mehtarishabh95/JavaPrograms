package javaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int n=1;
		int temp=1;
		while(n!=num)
		{			
			temp=temp*(n+1);
			n=n+1;			
		}
		System.out.println(temp);

	}

}
/*
 * or
 *  int fact=1;
 *  for(int i=1;i<=num;i++)
 *  {
 *  	fact=fact*i;
 *  }
 * 
 * */
