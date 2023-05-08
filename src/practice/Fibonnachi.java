package practice;

public class Fibonnachi {

	public static void main(String[] args) 
	{
		int r= 10;
		int a=0;
		int b=1;
		for(int i=1;i<=r;i++)
		{
			int c=a+b;
			if(i<=r)
			{
				a=b;
				b=c;
				System.out.println(c);
			}
		}
		

	}

}
