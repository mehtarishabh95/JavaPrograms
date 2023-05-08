package javaPrograms;

import java.util.Scanner;

public class LargestByMtds {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no");
		int x = sc.nextInt();
		System.out.println("Enter second no");
		int y=sc.nextInt();
		System.out.println("Enter Third no");
		int z=sc.nextInt();
		
		System.out.println(largestCompare(x, y, z));//using method
		

	}
	public static int largestCompare(int a,int b,int c)
	{
		
		int comp = a>b?a:b;
		int result=comp>c?comp:c;
		return result;
		
	}

}
