package javaPrograms;

import java.util.Scanner;

public class ConvertUpperCaseToLowerCase {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		char [] arr=s.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>='A'&&arr[i]<='Z') {
				arr[i]=(char)(arr[i]+32);
			}else {
				arr[i]=arr[i];
			}
			
		}
		
		s=new String(arr);
		
		System.out.println(s);

	}
	/*
	 * String s="ABCFGH";
	for(int i=0;i<s.length();i++)
	{
		char c = s.charAt(i);
		if(c<='Z'||c>='A')
		{
			System.out.print((char)(c+32));
		}
	}
		*/

}
