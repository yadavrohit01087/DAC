package bookcqueue;

import java.util.Scanner;

public class CQueueMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CQueue q1=new CQueue();
		Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		System.out.println(q1);
		CQueue q2=new CQueue();
		q2.insert(b1);
		q2.insert(b2);
		q2.insert(b3);
	
		int ch;
		do {
			System.out.println("enter choice 1.insert 2.remove  3.concate  4.exit");
			ch=sc.nextInt();
			if(ch==4)
				break;
			switch(ch)
			{
			case 1: 
				q1.insert(b1);
				q1.insert(b2);
				q1.insert(b3);
				System.out.println(q1);
			    break;
			
			case 2:
				 Book b=q1.remove();
			     System.out.println("value popped out of queue :"+b);
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
