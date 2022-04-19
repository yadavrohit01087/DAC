package employee;

public class Main {
	/*
	 * Q3.Write a class Student having following attributes
	int rollNo;
	String studentName;
	boolean isExperianced;
they should be private
write a no-args and parameterized constructor.getter and setter for all the attributes
write two public methods
1. showStudentInfo
2. setExperienced(boolean b)
create 3 different objects of Student class in main() and call all the functionalities.
	 * 
	 */

	public static void main(String[] args) {
		Employee e []=new Employee[3];

		Employee e1=new Employee(1116,"Rohit",3500,new Date(12,5,1997));
		Employee e2=new Employee(1117,"Shrihari",5500,new Date(14,5,1997));
		Employee e3=new Employee(1117,"hari",5500,new Date(15,5,1997));
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		e1.setDoj(new Date(1,1,1991));
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		e1.setExperienced(true);
		float p1=e1.calculateSalary();
		System.out.println(p1);
		float p2=e2.calculateSalary();
		System.out.println(p2);
		System.out.println(e1);
		System.out.println(e2);
	}

}
