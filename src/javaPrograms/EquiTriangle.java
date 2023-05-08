package javaPrograms;

import java.util.Scanner;

public class EquiTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		int spaces=n;
		int stars=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");				
			}
			for(int k=1;k<=stars;k++)
			{
				System.out.print("*");
			}
			if(i<=n)
			{
				stars=stars+2;
				spaces--;
			}
		System.out.println();
		}

	}

}
