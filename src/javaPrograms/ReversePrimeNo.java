package javaPrograms;

import java.util.Collections;
import java.util.TreeSet;

public class ReversePrimeNo {

	public static void main(String[] args) 
	{
		TreeSet<Integer> set=new TreeSet<>(Collections.reverseOrder());
		for(int n=2;n<=50;n++)
		{
			
		int temp=0;
		if(n<2)
		{
			System.out.println("prime no stars form 2");
			
		}
		else
		{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				temp=1;
				break;
			}
		
		}
		if(temp==0)
		{
			set.add(n);
		}
		
		}
		}
		for(Integer s:set)
		{
			System.out.println(s);
		}

	}

}
