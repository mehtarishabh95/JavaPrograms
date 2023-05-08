package javaPrograms;

 class StaticMembers
{
	static int s;//static global var
	
	static String xyz="hii";// single line static intializer
	
	static  //static multiline intializer
	{
		System.out.println("bye");
	}
	
	public static void display()
	{
		System.out.println("hlw from disp");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(s);
		System.out.println(StaticMembers.s);
		
		display();
		StaticMembers.display();
		
		System.out.println(xyz);
		System.out.println(StaticMembers.xyz);
		
		//multiline initializer can not be called 
		
		
		
	}
	
}
