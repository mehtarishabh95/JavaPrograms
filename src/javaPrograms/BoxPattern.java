package javaPrograms;

import java.util.Scanner;

public class BoxPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row number");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			
			for(int j=0;j<num;j++)
			{
				System.out.print("*");
			}
			System.out.println();//Alignment Statement
			
		}

	}

}
