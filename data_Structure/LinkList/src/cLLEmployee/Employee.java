package cLLEmployee;

import java.util.Scanner;

public class Employee {
		
		private String name;
		private int age;
		private float salary;
		
		Scanner sc= new Scanner(System.in);
		
		public Employee()
		{
			this("xyz",25,35000);
		}
		
		public Employee(String x,int y,float z)
		{
			this.name=x;
			this.age=y;
			this.salary=z;
		}

		public String getName()
		{
			return this.name;
		}
		
		public void setName(String x)
		{
			this.name=x;
		}
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		public float getSalary()
		{
			return this.salary;
		}
		
		public void setSalary(float x)
		{
			this.salary=x;
		}
		
		public void accept()
		{
			System.out.println("enter name: ");
			this.name=sc.next();
			System.out.println("enter age");
			this.age=sc.nextInt();
			System.out.println("enter salary");
			this.salary=sc.nextFloat();
		}
		
		public String toString()
		{
			String str="";
			str="Employee [ "+this.name+","+this.age+","+this.salary+"  ]";
			return str;
		}

		
	}





