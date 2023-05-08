package javaPrograms;
import java.util.Scanner; //import statement

class ScannerEx 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employ name :");
		String name=sc.next();
		
		System.out.println("enter the id no: ");
		int id=sc.nextInt();
		
		System.out.println("Enter the contact number :");
		long cno=sc.nextLong();
		
		System.out.println("Enter the salary"+sc.nextDouble()); //some unique difference
		
		System.out.println("Enter the ratings :"+sc.nextFloat());
		
		
	}
}
