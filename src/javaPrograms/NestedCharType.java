package javaPrograms;

import java.util.Scanner;

public class NestedCharType 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char c = sc.next().charAt(0);
		if(c>='a' && c<='z')
		{
			System.out.println("Small aphabets");
		}
		else if(c>='A' && c<='Z')
		{
			System.out.println("Bigger alphabets");
		}
		else if(c>='0' && c<'9')
		{
			System.out.println("Numerical");
			
		}
		else
		{
			System.out.println("special type");
		}
		
		/*
		 * uper k mtds ko ese bhi likh skte h
		 * 
		 * if((c>='a' && c<='z') || (c>='A' && c<='Z'))
				{
					System.out.println("aphabets");
				}
		 * 
		 * */
	}
}
