package javaPrograms;

import java.util.Scanner;

public class CountAndFindEvenNoBtwRange {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter min range");
		int min=sc.nextInt();
		System.out.println("enter max range");
		int max=sc.nextInt();
		
		int count=0;
		for(int i=min;i<=max;i++)
		{
			if(i%2==0)
			{
				System.out.println("even no is : "+i);
				count++;
			}
		}
		System.out.println(count);
		

	}

}
