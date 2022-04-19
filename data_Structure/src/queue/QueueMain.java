package queue;

import java.util.Scanner;

/*
Write a menu driven program to demonstrate various operation of queue
	
	
	1. input size of Queue from user.

	2.Write menu driven operation
  		insert(),remove()

	3.implement two Queue q1 and q2.

	4.concat two Queue
	Queue q3=q2.concat(q1);
	System.out.println(q3);

 */

public class QueueMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				Queue q1=new Queue();
				System.out.println(q1);
				Queue q2=new Queue();
				q2.insert(29);
				q2.insert(69);
				q2.insert(50);
			
				int ch;
				do {
					System.out.println("enter choice 1.insert 2.remove  3.concate  4.exit");
					ch=sc.nextInt();
					if(ch==4)
						break;
					switch(ch)
					{
					case 1: 
						System.out.println("enter value to be inserted into queue");
						int n=sc.nextInt();
						q1.insert(n);
						System.out.println(q1);
					    break;
					
					case 2:
						 int value=q1.remove();
					     System.out.println("value popped out of queue :"+value);
					     System.out.println(q1);
					     break;
					 
					case 3:
						Queue q3=q1.concate(q2);
						System.out.println(q3);
						break;
					     
					 default:
						   System.out.println("wrong choice");
					     
					}
				}while(ch!=0);
				
				
				
	}

}
