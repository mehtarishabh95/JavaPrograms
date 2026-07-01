package practice;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;

public class Practi {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n=sc.nextInt();
		int orignal=n;
		int newnum=0;
		while(n!=0) {
			int digit=n%10;
			newnum=newnum*10+digit;
			n=n/10;
		}
		System.out.println(newnum);
		
		if(orignal==newnum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		
		
		
	}
}