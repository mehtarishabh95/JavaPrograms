package javaPrograms;

public class StataicMembers2 
{
	static double d; //static global var
	
	static int a=21; //static intializer
	
	static
	{
		int d=34; //its local variable or initialize bhi krna pdega(int) kuki doosra wala global h
		//y sb to local h to bahar show ho ni skte mtlb y intialize bhi ni honge bahar
		
		System.out.println("local d is :"+d);
		
		System.out.println("pineapple");
	
	}
	
	public static void set()
	{
		int a=10; //local var
		System.out.println("local var a is"+a);
		System.out.println("apple");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main mtd d is "+d);//o/p 0.0d
		System.out.println("main mtd a is "+a);
		set();
		System.out.println("main mtd a is  "+a);//o/p 21 set() k local ki wjh se a initialize ni hoga
		set();
		
	}
	
}
