package javaPrograms;

public class WeekdayNesting 
{

	public static void usingNestedFor()
	{
		int w=3;
		
		for(int i=1; i<=w;i++)
		{
			System.out.println("week "+i);
			for(int j=1;j<=7;j++)
			{
				System.out.println("Day "+j);
			}
		}
	}
	public static void usingNestedWhile()
	{
		int week=3;
		int days=7;
		int i=1;
		while(i<=week)
		{
			System.out.println("week "+i);
			i++;
			for(int j=1;j<=days;j++)
			{
				System.out.println("day "+j);
			}
		}
	}
	
	public static void main(String[] args)
	{
		usingNestedFor();
		System.out.println("next Mtd");
		usingNestedWhile();
	}
}
