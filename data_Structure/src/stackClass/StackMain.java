package stackClass;
/*
 * Q1.Stack implementation
	1. input size of stack from user.

	2.Write menu driven operation
  	 push(),pop(),equals()

	3.implement two stack s1 and s2.

	4.concat two stack
	Stack s3=s1.concat(s2);
	System.out.println(s3);

	5.check Stack s1 and s2 are same or different
 * 
 */

import java.util.Scanner;

public class StackMain {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("enter stack size");
		int n=sc.nextInt();
		Stack s1=new Stack(n);
		Stack s2=new Stack(5);
		 
		 int ch;
		do {
			 System.out.println("choice: 1.push  2.pop  3.equals  4.concat  5.exit");
			  ch=sc.nextInt();
			 if(ch==5)
				 break;
			  switch(ch)
			  {
			  case 1:
				     System.out.println("enter number to push into stack");
			         int p=sc.nextInt();
			         s1.push(p);
			         System.out.println(s1);
			         break;
			         
			  case 2:
				    int value=s1.pop();
			        System.out.println("value popped out of stack:"+value);
			        System.out.println(s1);
			        break;
			        
			  case 3:
				    if(s1.equals(s2))   //checks hashcode
					   System.out.println("s1 and s2 are same");
					else
						System.out.println("s1 and s2 are different");
				    break;
			        
			  case 4:
				    Stack s3=s1.concat(s2); //concatanate two array into one
					System.out.println(s3);
					break;
			        
			  default:
				     System.out.println("wrong choice");
			         break;
			  }
		 }  while(ch!=0);
	
		
       
		
		s2.push(20);
		s2.push(20);
		s2.push(20);
		s2.pop();
		
		for(int i=0;i<5;i++)
		{
			s2.push(100);
		}
		System.out.println(s2);
		
		
		
		
	}

}
