package javaPrograms;

import java.util.Scanner;

public class CountNoOfDigits 
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int res=countnos(num);
		System.out.println(res);
	}
	public static int countnos(int n)
	{
		
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		return count;
	}

}
 