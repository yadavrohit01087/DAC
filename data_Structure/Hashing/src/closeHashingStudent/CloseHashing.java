package closeHashingStudent;

public class CloseHashing {
	LinkList [] arr;
	
	public CloseHashing(int size)
	{
		LinkList [] arr=new LinkList[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new LinkList();
		}
	}
	
	public int hashFunction(String inputStr)
	{
		int sum=0;
		for(int i=0;i<inputStr.length();i++)
		{
			sum+=inputStr.charAt(i);
		}
		int index=sum%arr.length;
		return index;
		
	}
	
	public void insert(Student s1)
	{
		String inputStr=s1.getMobile();
		int index=hashFunction(inputStr);
		System.out.print(inputStr+" key from Hash function ="+index);
		
		arr[index].append(s1);
		System.out.println(" and is placed at "+index);
	}
	

	public int search(String inputStr)
	{
		int index=hashFunction(inputStr);
		
		if(arr[index].isPresent(inputStr))
		{
			System.out.print(inputStr+" key from Hash function ="+index);
		}
		else
			System.out.println(inputStr+" is not found..");
		return index;
		
	}

	
	public void remove(String inputStr)
	{
		int index=search(inputStr);
		int status=arr[index].deleteValue(inputStr);
		
		if(status==1)
		{
			System.out.println(" and is removed from "+index);
		}
		else
			System.out.println(inputStr+" is not found..");
	}
	
	public String toString()
	{
		String str="";
		for(int i=0;i<arr.length;i++)
		{
			str+=arr[i]+",";
		}
		return str;
	}
}
