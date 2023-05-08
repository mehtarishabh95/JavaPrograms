package javaPrograms;

import java.util.Scanner;

public class DynamicSwitch 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter case between 1-3");
		
		int n = sc.nextInt();
		
		switch (n)
		{
		case 1:
		{
			System.out.println("a");
		}
		break;
		case 2:
		{
			System.out.println("b");
			
		}
		break;
		
		case 3:
		{
			System.out.println("c");
		}

		
	}
  }
}
