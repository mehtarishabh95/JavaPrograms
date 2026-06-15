package javaPrograms;

public class BinarySearch 
{
	public static int BinarySearch(int [] arr,int x)
	{
		int first=0;//first index
		int last=arr.length-1;// last index
		
		while(first<=1)
		{
			int middle=(first+last)/2;
			if(x==arr[middle])
			{
				return middle;
			}
			else if(x>arr[middle])
			{
				first=middle+1;
			}
			else
			{
				last =middle-1;
			}
		}
		return-1;
	}

	public static void main(String[] args) 
	{
		int[] arr= {5,8,21,36,46};
		System.out.println(BinarySearch(arr, 46));

	}

}
