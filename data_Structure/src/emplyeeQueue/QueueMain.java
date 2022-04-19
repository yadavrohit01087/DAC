package emplyeeQueue;

import java.util.Scanner;

/*
Demonstrate a menu driven program of Queue for Employee class
 */

public class QueueMain {

	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
				Queue q1=new Queue();
				Queue q2=new Queue();
	
				int ch;
				
				do {
					 System.out.println("choice: 1.insert  2.remove   3.concat  4.exit");
					  ch=sc.nextInt();
					 if(ch==4)
						 break;
					  switch(ch)
					  {
					  case 1:
						     System.out.println("enter student to push into stack");
					         Employee e1=new Employee();
					         q1.insert(e1);
					         System.out.println(q1);
					         break;
					         
					  case 2:
						   Employee e=q1.remove();
					        System.out.println("value popped out of stack:"+e);
					        System.out.println(e);
					        break;
					        
					 
					  case 3:
						    Queue q3=q1.concate(q2); //concatanate two array into one
							System.out.println(q3);
							break;
					        
					  default:
						     System.out.println("wrong choice");
					         break;
					  }
				 }  while(ch!=0);
				
				System.out.println(q2);
				
				
	}

}
