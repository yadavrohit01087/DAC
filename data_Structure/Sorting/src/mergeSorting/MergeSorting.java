package mergeSorting;

public class MergeSorting {
	
	public static void merge(int crr[],int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-(m+1)+1;
		int arr[]=new int[n1];
		int brr[]=new int[n2];
		
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=crr[l+i];
		}
		
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=crr[m+1+i];
		}
		
		int i=0,j=0,k=0;
		
		while(i<arr.length && j<brr.length)
		{
			if(arr[i]<=brr[j])
			{
				crr[k]=arr[i];
				k++;
				i++;
			}
			else
				crr[k]=brr[j];
			    k++;
			    j++;
		}	
		if(j==brr.length)
		{
			while(i<arr.length)
			{
				crr[k]=arr[i] ;
				i++;
				k++;
			}
		}
		else
		{	  
			while(j<arr.length)
			{
				crr[k]=brr[j] ;
				j++;
				k++;
			}
		}
	}

	public static void mergeSort(int crr[],int l,int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;
			mergeSort(crr,l,m);
			mergeSort(crr,m+1,r);
			
			merge(crr,l,m,r);
		}
	}
	
	public static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
	
}
