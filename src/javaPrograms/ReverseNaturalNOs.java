
















package javaPrograms;

import java.util.Scanner;

public class ReverseNaturalNOs {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the last no from which reverse");
		int last=sc.nextInt();
		for(int i=last;i>0;i--)
		{
			System.out.println(i);
		}

	}

}
