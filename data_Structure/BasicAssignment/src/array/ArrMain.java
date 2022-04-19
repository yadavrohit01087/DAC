package array;

public class ArrMain {

	public static void main(String[] args) {
		double [] drr=new double [] {2.3,5.3,6.3};
		boolean [] brr=new boolean[] { 2<3,5>6};
		char [] crr=new char[] {'r','s','t'};
		int [] arr=new int [5];
		for(int i=0;i<5;i++)
		{
			arr[i]=5*i;
		}
		
		int sum=sumArray(arr);
		System.out.println("avg= "+sum/5);
		printArray(arr);
		printArray(brr);
		printArray(crr);
		printArray(drr);
		printSumEven(arr);
		
	}

public static int sumArray(int [] arr)
{
	int sum=0;
	for(int i=0;i<5;i++)
	{
		sum=sum+arr[i];
	}
	return sum;
}

public static void printArray(int [] arr)
{
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+",");
	}
	System.out.println();
}

public static void printArray(boolean [] brr)
{
	
	for(int i=0;i<brr.length;i++)
	{
		System.out.print(brr[i]+",");
	}
	System.out.println();
}

public static void printArray(char [] crr)
{
	
	for(int i=0;i<crr.length;i++)
	{
		System.out.print(crr[i]+",");
	}
	System.out.println();
}

public static void printArray(double [] drr)
{
	
	for(int i=0;i<drr.length;i++)
	{
		System.out.print(drr[i]+",");
	}
	System.out.println();
}
public static void printSumEven(int [] arr)
{
	int sum=0;
	
	for(int i=0;i<5;i++)
	{
		if(arr[i]%2==0)
		{
			sum=sum+arr[i];
		}
	}
	System.out.println(sum);
}
}