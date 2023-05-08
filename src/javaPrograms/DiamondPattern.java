package javaPrograms;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		int spaces=n/2; 
		int stars=1;
		//think like in 3D thre are 3 dimensions i j k
		for(int i=1;i<=n;i++)//Traversing across row
		{
			for(int j=1;j<=spaces;j++)//traversing across column in order to print spaces
			{
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++)//traversing across column in order to print stars
			{
				System.out.print("*");
			}
			
			if(i<=n/2)
			{
				spaces--;
				stars=stars+2;
			}
			else
			{
				spaces++;
				stars=stars-2;
			}
			System.out.println();
		}
		

	}

}
