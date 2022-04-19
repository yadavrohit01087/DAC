package studentStack;

import java.util.Scanner;

/*
 * 
 Demonstrate a menu driven program of Stack for Student class
 * 
 */



public class StackMain {
     static Scanner sc=new Scanner(System.in);
     public static void main(String[] args) {
		
		Stack stackStudent1=new Stack(5);
		Stack stackStudent2=new Stack();
		Student s1=new Student("rohit",24,'m');
		Student s2=new Student("rohi",26,'m');
		int ch;
		do {
			 System.out.println("choice: 1.push  2.pop  3.equals  4.concat  5.exit");
			  ch=sc.nextInt();
			 if(ch==5)
				 break;
			  switch(ch)
			  {
			  case 1:
				     System.out.println("enter student to push into stack");
			         Student s3=new Student();
			         //stackStudent1.s3.getName();
			         stackStudent1.push(s3);
			         stackStudent1.push(s2);
			         System.out.println(s3);
			         stackStudent1.push(s2);
			         break;
			         
			  case 2:
				   Student s=stackStudent1.pop();
			        System.out.println("value popped out of stack:"+s);
			        System.out.println(stackStudent1);
			        break;
			        
			  case 3:
				    if(stackStudent2.equals(stackStudent1))   //checks hashcode
					   System.out.println("s1 and s2 are same");
					else
						System.out.println("s1 and s2 are different");
				    break;
			        
			  case 4:
				    Stack stackStudent3=stackStudent1.concat(stackStudent2); //concatanate two array into one
					System.out.println(stackStudent3);
					break;
			        
			  default:
				     System.out.println("wrong choice");
			         break;
			  }
		 }  while(ch!=0);
	
		
	}

}
