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
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		
		
		
		
	}
}