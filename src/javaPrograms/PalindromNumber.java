package javaPrograms;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nnumber");
		int number=sc.nextInt();
		int num=number;//only for comparison purpose
		int rem=0;
		while (num!=0) 	
		{
			rem=rem*10+num%10;
			num=num/10;			
		}
		if(number==rem)
		{
			System.out.println("number is pallindrome");
		}
		else {
			System.out.println("number is not Pallindrome");
		}

	}

}
