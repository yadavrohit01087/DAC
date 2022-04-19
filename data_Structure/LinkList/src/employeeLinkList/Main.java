package employeeLinkList;

import java.util.Scanner;

public class Main {
  public static  void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  /*Node head=new Node(11);//head pointing to new node with value 11
	  head.next=new Node(22);
	  head.next.next=new Node(33);  //without Linklist Class
	 System.out.println(head);*/
	  
	  LinkList list=new LinkList();
//	  list.insert(34);
//	  list.insert(54);
//	  list.append(94);
//	  list.delete();
//	  list.deleteLast();
	  for(int i=0;i<2;i++)
	  {
		  System.out.println("enter name: ");
		  String name=sc.next();
		  
		  System.out.println("enter age: ");
		  int age=sc.nextInt();
		  
		  System.out.println("enter salary: ");
		  Float salary=sc.nextFloat();
		  
		  System.out.println("enter role: ");
		  String role=sc.next();
		  
		  Employee e=new Employee(name,age,salary,role);
		  list.insert(e);
	  }
//	 Employee e1=new Employee("rohit",25,35000,"developer");
//	 Employee e2=new Employee("sahil",25,50000,"developer");
	 
	// list.insert(e);
	 //list.append(e2);
	 
	  System.out.println(list);
	  
  }
}
