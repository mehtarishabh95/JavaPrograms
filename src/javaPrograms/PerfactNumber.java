package javaPrograms;

import java.util.Scanner;

public class PerfactNumber 
{
//6 ko isk phle 1,2,3,4,5 se divide kro jis s divide hua unhe add kro 1+2+3=6 means perfact no
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
			System.out.println("perfact no");
		else
			System.out.println("not perfact no");
		
		
	}

}
