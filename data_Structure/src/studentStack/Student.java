package studentStack;
public class Student {
	
	String name;
	int age;
	char gender;
	
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
	
	public String getNmae() 
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
		if(name.isEmpty())
			str +="Student:["+age+","+gender+" ]";
		else
		    str+="Student:[ "+name+","+age+","+gender+" ]";
		return str;
	}


}
