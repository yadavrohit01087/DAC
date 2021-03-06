package hashingStudent;

public class HashingStudent {
	Student arr[];
	
	public HashingStudent(int size)
	{
		arr=new Student[size];
	}
	
//	public int hashFunction(String inputStr)
//	{
//		int sum=0;
//		for(int i=1;i<inputStr.length();i++)
//		{
//			sum=sum+inputStr.charAt(i);
//		}
//		int index=sum%arr.length;
//		return index;
//	}
	
//	public int hashFunction(String inputStr)
//	{
//		int sum=0;
//		for(int i=0;i<inputStr.length();i=i+2)
//		{
//			sum=sum+Integer.parseInt(inputStr.substring(i,i+2));
//		}
//		   int index=sum%arr.length;
//		return index;
//	}
	
	public int hashFunction(long inputStr)
	{
        long n=inputStr;
		long sum=0,i=0,r;
		while(n!=0)//99
		{
			    r=n%100;
				sum=sum+r;
				n=n/10;//
		}
		   System.out.println(sum);
		   int index=(int)sum%arr.length;
		   return index;
	}
	
	
	public void insert(Student st)
	{
		long inputStr=st.getMobile();
//		String inputStr=st.getEmail();
		int index=hashFunction(inputStr);
		System.out.print(inputStr+" is placed at "+index);
		
		if(arr[index]==null)
		{
			arr[index]=st;
		}
		
		else
			while(true)
			{
				if(index<arr.length-1)
					index++;
				else
					index=0;

				if(arr[index]==null)
				{
					arr[index]=st;
					break;
				}
			}
		System.out.println(" and placed at "+index);
		System.out.println("***************");
	}
	
	public void remove(Student st)
	{
		long inputStr=st.getMobile();//getEmail
		int index=search(inputStr);
		arr[index]=null;
		System.out.println(" and removed from"+index);
		System.out.println("***************");
	}
	
	public int search(long inputStr)
	{
		int index=hashFunction(inputStr);
		System.out.print(inputStr+" is placed at "+index);
		if(arr[index]!=null && inputStr==arr[index].getMobile())//getEmail
		{
			return index;
		}
		else
			while(true)
			{
				if(index<arr.length-1)
				   index++;
				else
					index=0;
				
				if(arr[index]!=null && inputStr==arr[index].getMobile())
				{
					return index;
				}
			}
	}

	public String toString()
	{
		String str="";
		for(int i=0;i<arr.length;i++)
		{
			str+=arr[i]+",";
		}
		System.out.println("***************");
		return str;
	}
}
