package heapSorting;

public class HeapSorting {
	
	public static void heapSort(int arr [])
	{
		int n=arr.length;  // node to start heapify =(n/2
		for(int i=(n/2)-1;i>=0;i--)//1---->heapify complete array
		{
			heapify(arr,i);
		}
		
		for(int i=n-1;i>=0;i--)//after heapify 2------>swap 1st-last element of array
		{
			int temp=arr[0];
			arr[0]=arr[n-1];
			arr[n-1]=temp;
			                
			heapify(arr,i);//3---->length of array get reduced by 1 as last element get sorted each time
			               //so heapify again everytime for reamining array
		}
	}
	
	
	
	public static void heapify(int arr [],int i)
	{
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		
		if(l<arr.length && arr[l]>arr[i])
		{
			largest=l;
		}
		
		if(r<arr.length && arr[r]>arr[largest])
		{
			largest=r;
		}
		
		if(largest!=i)
		{
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			
			heapify(arr,largest);//heapify again swapped children node(largest) of i(node to heapify)
			                      //with its children if it has any
			
		}
	}
	
	public static void print(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
	

}
