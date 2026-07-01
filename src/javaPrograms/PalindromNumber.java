package javaPrograms;

import java.util.Scanner;

public class PalindromNumber {
	
//	Examples of palindrome numbers:
//		121 → reversed is 121 ✔
//		1331 → reversed is 1331 ✔

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
	
	
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter first number");
//	int n=sc.nextInt();
//	int orignal=n;
//	int newnum=0;
//	while(n!=0) {
//		int digit=n%10;
//		newnum=newnum*10+digit;
//		n=n/10;
//	}
//	System.out.println(newnum);
//	
//	if(orignal==newnum) {
//		System.out.println("palindrome");
//	}
//	else {
//		System.out.println("not");
//	}

}
