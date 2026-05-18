package practice;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practic {

	public static void main(String[] args) 
	{
		String s="jaipur is is a good good city";
		String [] arr=s.split(" ");
		HashSet<String > set=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		
		for(String st:set)
		{
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(st.equals(arr[i]))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(st+" unique");
			}
		}
		
		
	
		
		

	}
}
