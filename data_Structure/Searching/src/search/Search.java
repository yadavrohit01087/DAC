package search;

import java.util.Scanner;

public class Search {
	int arr[];
	
	public Search(int size)
	{
		arr=new int[size];
	}
	
	public void acceptArray()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter elements for array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	
	public int binarySearch(int key)
	{
		int low=0;
		int high=arr.length;
		int mid=(low+high)/2;
		 while(arr[mid]!=key && low<high)
		 {
			 if(arr[mid]<key)
			    high=mid-1;
			 else
				 low=mid+1;
			 
			 mid=(low+high)/2;
		 }
		
		 if(arr[mid]==key)
		    return mid+1;
		 else
			 return -1;
	}
	
	public int binarySearchData(int key)
	{
		int count=0;
		int low=0;
		int high=arr.length;
		int mid=(low+high)/2;
		 while(arr[mid]!=key && low<high)
		 {
			 if(arr[mid]<key)
			    high=mid-1;
			 else
				 low=mid+1;
			 
			 mid=(low+high)/2;
		 }
		
		 if(arr[mid]==key)//==>return mid+1 else return -1
		   count++;
		 low=mid-1;
		 while(arr[low]==key)
		 {
			 count++;
			 low=low-1;
		 }
		 high=mid+1;
		 while(arr[high]==key)
		 {
			 count++;
			 high=high+1;
		 }
		 return count;
		 
	}
	
	public int sequentialSearch(int key)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				count=i+1;
			}
			
		}
		return count;
	}
     
}
