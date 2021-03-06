package studentArr;

public class Student {
	private int rollNo;
	private String name;
	private int age;
	private int [] marks;
	
	public Student()
	{
		this.rollNo=0;
		this.name=null;
		this.age=0;
		this.marks=null;
		
	}
	
	public Student(int rno,String name,int age)
	{
		this.rollNo=rno;
		this.name=name;
		this.age=age;
		this.marks=new int[5];
		
	}

	public void setMarks(int [] marks)
	{
		this.marks=marks;
	}

	public int [] getMarks()
	{
		return this.marks;
	}
	
	
	public void printAvgMarks()
	{
		float sum=0;
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		System.out.println("avg Marks :"+sum/marks.length);
	}

	public void printHighestMarks()
	{
		int h=marks[0];
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]>h)
			{
				h=marks[i];
			}
		}
		System.out.println(h);
	}
	
	
	public void printLowestMarks()
	{
		int l=marks[0];
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]<l)
			{
				l=marks[i];
			}
		}
		System.out.println(l);
	}
	
	public static void maxAge(Student s[])
	{
		Student max=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].age>max.age)
			{
				max=s[i];
			}
		}
		System.out.println(max);
	}
	
	public int getEachAvg ()
	{
		int sum=0,avg;
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+this.marks[i];
		}
		avg=sum/marks.length;
		return avg;
	}
	
	public static void findAvg(Student s[]) 
	{
		int sum=0,avg;
		//Student sum=new Student();
		for(int i=0;i<s.length;i++)
		{
			sum=sum+s[0].getEachAvg();
		}
		avg=sum/s.length;
		System.out.println("avg of all student marks: "+avg);
	}
	
	public String toString()
	{
		String str="";
		str="Student [ "+this.rollNo+","+this.name+','+this.age+" ] , Marks : (";

		for(int i=0;i<marks.length;i++)
		{
				str+=marks[i]+", ";
		}
		str+=")";
		return str;
	}
}
