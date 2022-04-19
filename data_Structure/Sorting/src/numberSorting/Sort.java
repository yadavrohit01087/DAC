
public class Sort {
	
	public static int partition(int arr[],int l,int h)
	{
		int p=h,j=l,i=l-1;
		while(j<p)
		{
			if(arr[p]<arr[j])
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			j++;
		}      
		   //if(j==p) =>unconditional swap
			i++;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			return i;
			
		}
		
	
	public static void quickSort(int arr [],int l,int h)
	{
		if(l<h)
		{
			int pi=partition(arr,l,h);
			quickSort(arr,l,pi-1);
			quickSort(arr,pi+1,h);
			
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
