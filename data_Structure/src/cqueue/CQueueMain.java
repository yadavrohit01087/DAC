package cqueue;

import java.util.Scanner;

public class CQueueMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CQueue q1=new CQueue();
		System.out.println(q1);
		CQueue q2=new CQueue();
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
				//CQueue q3=q1.concate(q2);
				//System.out.println(q3);
				break;
			     
			 default:
				   System.out.println("wrong choice");
			     
			}
		}while(ch!=0);
		
	}

}
