package javaPrograms;

class Program2 
{
	
	public static void print(int n,int count)
	{
		System.out.println(n);
		n++;
		count--;
		if(count==0)
		{
			return;//this will return nothing or zero which will terminate loop like -1<0 
			
			//watch this one for recursion tracing   https://www.youtube.com/watch?v=yLaYW7dmsfo
		}
		print(n,count);
	}
	
	public static void main(String[] args) 
	{
		int n=1;
		print(n,10);//jitni count ki value daloge utne tk prime numbers aa jayenge
		
	}
}
