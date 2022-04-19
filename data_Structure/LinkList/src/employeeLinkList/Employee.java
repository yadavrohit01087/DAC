package employeeLinkList;

import java.util.Scanner;

public class Employee {
		
		private String name;
		private int age;
		private float salary;
		private String dept;
		Scanner sc= new Scanner(System.in);
		
		public Employee()
		{
			
			this("xyz",25,35000,"developer");
		}
		
		public Employee(String x,int y,float z, String p)
		{
			this.name=x;
			this.age=y;
			this.salary=z;
			this.dept=p;
			
		}
		
		public void accept()
		{
			System.out.println("enter name: ");
			this.name=sc.next();
			System.out.println("enter age");
			this.age=sc.nextInt();
			System.out.println("enter salary");
			this.salary=sc.nextFloat();
			System.out.println("enter dept");
			this.dept=sc.next();
				
		}
		
		public String toString()
		{
			String str="";
			str="Employee [ "+this.name+","+this.age+","+this.salary+","+this.dept+"  ]";
			return str;
		}
		
		public String getName()
		{
			return this.name="raja";
		}
		
		public void setName(String x)
		{
			this.name=x;
		}
		
		public float getSalary()
		{
			return this.salary=2345567;
		}
		
		public void setSalary(float x)
		{
			this.salary=x;
		}
		
	}





