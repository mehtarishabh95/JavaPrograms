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
		String st=sc.nextLine();
		char [] arr=st.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>'A'&&arr[i]<'Z') arr[i]=(char) (arr[i]+32);
		}
 		String finalop = new String(arr);
		System.out.println(finalop);
		
		
		
		
		
	}
}