package javaPrograms;

public class ReverseStringAtOwnPlace {

	public static void main(String[] args) 
	{
		String s="hii my name is Rishabh";
		String[] spa = s.split(" ");
		
		
		for(int i=0;i<spa.length;i++)
		{
			String rev=" ";
			String arr = spa[i];//ab y aa gyi string to char[j] hi use hoga ya to ise array me convert kro
			for(int j=arr.length()-1;j>=0;j--)
			{
				rev=rev+arr.charAt(j);
			}
			System.out.print(rev+" ");
		}
		
	}

}
