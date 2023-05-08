package javaPrograms;

import java.util.Scanner;

public class SwitchTruthDare {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("roll dice and tell count no :");
		
		int num = sc.nextInt();
		
		switch(num)
		{
		case 1:
		{
			System.out.println("paint");
		}
		break;
		case 2:
		{
			System.out.println("chla ja bsdk");
		}
		break;
		case 3:
		{
			System.out.println("introduce your self like a girl");
		}
		break;
		case 4:
		{
			System.out.println("ja or brush kr k aa");
		}
		break;
		case 5:
		{
			System.out.println("ek baar chakke ki trh naach k dikha");
		}
		break;
		case 6:
		{
			System.out.println("acting kr chota chapri ki");
		}
		}

	}

}
