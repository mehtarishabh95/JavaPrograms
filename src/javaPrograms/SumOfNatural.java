package javaPrograms;

public class SumOfNatural 
{
public static void main(String[] args)
{
	usingWhileLoop();
	System.out.println("next Mtd");
	
	SumOfNatural s=new SumOfNatural();
	s.usingDoWhileLoop();
	System.out.println("next Mtd");
	usingForLoop();
}
public static void usingWhileLoop()
{
	int i=1;
	int j=10;
	int sum=0;
	while(i<=10)
	{
		sum=sum+i;
		System.out.println(sum);
		i++;
	}
}
public void usingDoWhileLoop()
{
	int i=1;
	int j=10;
	int sum=0;
	do
	{
		sum=sum+i;
		System.out.println(sum);
		i++;
	}
	while(i<=10);
	
}
public static void usingForLoop()
{
	int j=10;
	int sum=0;
	for(int i=1;i<=j;i++)
	{
		sum=sum+i;
		System.out.println(sum);
	}
	
}
}
