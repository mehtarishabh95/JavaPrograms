package javaPrograms;

import java.util.Scanner;

public class PercentageOfStudent {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks of physics");
		float phy = sc.nextFloat();
		System.out.println("enter marks of chemistry");
		float ch = sc.nextFloat();
				
		System.out.println("enter marks of maths");
		float math=sc.nextFloat();
		
		int totalmarks = 300;
		float percentage = ((math+phy+ch)/totalmarks)*100;
		
		System.out.println("percentage of student is : "+percentage);
 
	}

}
