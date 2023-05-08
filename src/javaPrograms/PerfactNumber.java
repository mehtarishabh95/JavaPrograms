package javaPrograms;

import java.util.Scanner;

public class PerfactNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int sum=1;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0);
			sum=sum+i;			
		}
		if(sum==num)
		{
			System.out.println("perfact number");			
		}
		else
		{
			System.out.println("not a Perfact number");
		}

	}

}
