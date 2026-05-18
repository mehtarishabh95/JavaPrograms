package javaPrograms;

import java.util.Scanner;

public class XylemPhloemNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		XytemPhloemNumber(num);

	}
	public static void XytemPhloemNumber(int num)//static Parameterized constructor
	{
		//numbers me % and / to hoga hi dkh lo chahe reverse ya xylem
		int n=num;
		int extremesum=0,meansum=0;
		
		while(n!=0)
		{
			if(n==num||n<10)
			{
				extremesum=extremesum+n%10;
				
			}
			else
			{
				meansum=meansum+n%10;
			}
			n=n/10;
		}
		if(extremesum==meansum)
		{
			System.out.println("Xylem number");
			
		}
		else
		{
			System.out.println("Phloem Number");
		}
	}

}
