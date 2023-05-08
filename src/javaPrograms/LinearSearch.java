package javaPrograms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value which index you want to search");
		int n=sc.nextInt();
		
		int[] arr= {2,3,4,5,6,7,8,9};
		System.out.println("Index value is : "+LinearSearch(arr,n));
		
	}
	
	public static int LinearSearch(int [] arr,int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(n==arr[i])
			{
				return i;
			}
		}
		return -1;//negative index to hota hi nhi to koi bhi neg value chlegi
	}

}
