package studentSort;

public class SortStudent {
	
	public static void byAgeAscending(Student [] arr)
	{
		for(int p=0;p<arr.length-1;p++)
		{
			
			int i=p;
		    Student x=arr[i];
		    while(i<arr.length)
		    {
		       if(arr[i].getAge()<x.getAge())
		       {
		    	Student temp=x;
		    	x=arr[i];
		    	arr[i]=temp;
		    	 
		       }
		       i++;
		    }
		   arr[p]=x;
		}
	}
	
	public static void byAgeDescending(Student [] arr)
	{
		for(int p=0;p<arr.length-1;p++)
		{
			
			int i=p;
		    Student x=arr[i];
		    while(i<arr.length)
		    {
		       if(arr[i].getAge()>x.getAge())
		       {
		    	Student temp=x;
		    	x=arr[i];
		    	arr[i]=temp;
		    	 
		       }
		       i++;
		    }
		   arr[p]=x;
		}
	}
	
	public static void byNameAscending(Student [] arr)
	{
		for(int p=0;p<arr.length-1;p++)
		{
			
			int i=p;
		    Student x=arr[i];
		    while(i<arr.length)
		    {
		       if(arr[i].getName().compareTo(x.getName())<0)
		       {
		    	Student temp=x;
		    	x=arr[i];
		    	arr[i]=temp;
		    	 
		       }
		       i++;
		    }
		   arr[p]=x;
		}
	}
	
	public static void byNameDescending(Student [] arr)
	{
		for(int p=0;p<arr.length-1;p++)
		{
			
			int i=p;
		    Student x=arr[i];
		    while(i<arr.length)
		    {
		       if(arr[i].getName().compareTo(x.getName())>0)
		       {
		    	Student temp=x;
		    	x=arr[i];
		    	arr[i]=temp;
		    	 
		       }
		       i++;
		    }
		   arr[p]=x;
		}
	}
	
	public static void print(Student arr[])
	{
		System.out.println("*****************************");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
	
	
}
