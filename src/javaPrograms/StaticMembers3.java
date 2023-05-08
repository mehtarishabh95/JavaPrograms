package javaPrograms;

public class StaticMembers3 
{
	static int c=2;
	
	int a;
	{
		double a=2.23; //this is possible
		System.out.println(a);
	}
	
	{
		//  int b; not possible local variable ko intialize krna jruri h
		int b=2;
		System.out.println("b is "+b);
	}
	// b=3;   But this is not possible
	
	static void mtd()
	{
		System.out.println("c is "+c);//yha ans 2 aaya kuki c abhi reinitialize ni hua
		
		int c=3;//agar ye ni hota to ans 2 hi aata dono lines m
		
		System.out.println(c);
		System.out.println(StaticMembers3.c);

	}
	public static void main(String[] args) {
		mtd();
	}
}
