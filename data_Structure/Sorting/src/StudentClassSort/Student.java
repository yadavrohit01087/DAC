package StudentClassSort;

import studentSort.Student;

public class Student {
	private String name;
	private int age;
	private char gender;
	
	public Student()
	{
		this.name="default";
		this.age=00;
		this.gender='m';
		
	}
	public Student(String n,int a,char g)
	{
		this.name=n.toUpperCase();
		this.age=a;
		this.gender=g;
		
	}
	
	public String getName() 
	{
	  return this.name;	
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public char getGender()
	{
		return this.gender;
	}
	
	public void setName(String n)
	{
		this.name=n;
	}
	
	public void setAge(int a)
	{
		this.age=a;
	}
	
	public void setGnder(char g)
	{
		this.name=g;
	}
	
	public String toString()
	{
		String str="";
		str=str+"Student:[ "+name+","+age+","+gender+" ]";
		return str;
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
	
	public static void print(Student students[])
	{
		System.out.println("*****************************");
		for(int i=0;i<students.length;i++)
		{
			System.out.print(students[i]+",");
		}
		System.out.println();
	}
	
	


}
