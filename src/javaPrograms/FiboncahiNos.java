package javaPrograms;

import java.util.Scanner;

public class FiboncahiNos {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter last range of series");
		int range=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=range;i++)
		{
			int c=a+b;
			if(c<=range)
			{
				a=b;
				b=c;
				System.out.print(c+" ");
			}
		}
				

	}

}
