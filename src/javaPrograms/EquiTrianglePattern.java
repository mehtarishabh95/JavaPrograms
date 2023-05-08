package javaPrograms;

import java.util.Scanner;

public class EquiTrianglePattern 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)//for every row spaces should decrease
			{
				System.out.print(" ");
				//System.out.println("");
			}
			for(int k=0;k<=i;k++)
			{
				//System.out.print("*");
				//System.out.print("* ");
				//System.out.print(" * ");
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
