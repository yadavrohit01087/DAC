package quickSortStudent;

public class  QuickSorting{
	
	public static int partition(Student arr[],int l,int h)
	{
		int p=h,j=l,i=l-1;
		while(j!=p)
		{
			if(arr[j].getAge()<arr[p].getAge())
			{
				i++;
				Student temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
				
			}
			else
				j++;
		}
		if(j==p)
		{
		   i++;
		   Student temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
		return i;
	}

	
	public static void quickSort(Student brr[],int l,int h)
	{
		if(l<h)
		{
			int pi=partition(brr,l,h);//
			  quickSort(brr,l,pi-1);
			  quickSort(brr,pi+1,h);
		}
	}	
		
//	public static void mergeSort(int arr[],int brr[],int crr[])
//	{
//		int i=0,j=0,k=0;
//		
//		while(i<arr.length && j<brr.length)
//		{
//			if(arr[i]<=brr[j])
//            {
//            	crr[k]=arr[i];
//            	i++;
//            	k++;
//            }
//			else
//			{
//				crr[k]=brr[j];
//				j++;
//				k++;
//			}
//		}
//			if(i==arr.length)
//			{
//				while(j<brr.length)
//				{
//				  crr[k]=brr[j];
//				  j++;
//				  k++;
//				}
//			}
//			else if(j==brr.length)
//			{
//				while(i<arr.length)
//				{
//					crr[k]=arr[i];
//					i++;
//					k++;
//				}
//				
//			}
//			for(int m=0;m<crr.length;m++)
//			{
//			System.out.print(crr[m]+",");
//			}
//			System.out.println();
//		}
//
//

	
	public static void print(Student crr[])
	{
		for(int i=0;i<crr.length;i++)
		{
			System.out.print(crr[i]+",");
		}
		System.out.println();
	}


}
