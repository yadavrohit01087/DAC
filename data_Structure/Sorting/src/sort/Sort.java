package sort;

public class Sort {
	
	public static void selectionAscending(int [] arr)
	{   // 5 23  34   12  17  
		// 0   1   2   3    4
		for(int p=0;p<arr.length-1;p++)
		{
			
			int i=p;//1
		    int x=arr[i];// x=23
		    while(i<arr.length)//2<5
		    {
		       if(arr[i]<x)// 23<23  false  
		       {            //  12  <23  true
		    	int temp=x;
		    	x=arr[i];     //x=5
		    	arr[i]=temp;
		    	 
		       }
		       i++;//i=2
		    }
		   arr[p]=x;//arr[0]=5
		}
	}
	
	public static void selectionDescending(int [] arr)
	{
		for(int p=0;p<arr.length-1;p++)
		{
			
			int i=p;
		    int x=arr[i];
		    while(i<arr.length)
		    {
		       if(arr[i]>x)
		       {
		    	int temp=x;
		    	x=arr[i];
		    	arr[i]=temp;
		    	 
		       }
		       i++;
		    }
		   arr[p]=x;
		}
	}
	
	public static void insertionAscending(int [] arr)
	{
		//24,2,45,100,23,5,100,42
		for(int p=1;p<arr.length;p++)
		{
			int i=p;
            
			while(i>0)
			{
				if(arr[i]<arr[i-1])
				{
					int temp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;
					i--;
				}
				else
					break;
			}
		}
		System.out.println(arr);
	}
	
	public static void insertionDescending(int [] arr)
	{
		//24,2,45,100,23,5,100,42
		for(int p=1;p<arr.length;p++)
		{
			int i=p;
            
			while(i>0)
			{
				if(arr[i]>arr[i-1])
				{
					int temp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;
					i--;
				}
				else
					break;
			}
		}
		System.out.println(arr);
	}
	
	public static void bubbleAscending(int [] arr)
	{
		//24,2,45,100,23,5,100,42
		for(int j=0;j<arr.length-1;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i+1]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;

				}
			}
		}
	}
	
	public static void bubbleDescending(int [] arr)
	{
		//24,2,45,100,23,5,100,42
		for(int j=0;j<arr.length-1;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i+1]>arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;

				}
			}
		}
	}
	
	
	
		public static void print(int arr[])
		{
			System.out.println("*******************************************************");
			for(int i=0;i<arr.length-1;i++)
			{
				System.out.print(arr[i]+",");
			}
			System.out.println();
		}
}
