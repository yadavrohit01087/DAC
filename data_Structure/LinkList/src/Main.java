import java.util.Scanner;

public class Main {
	public static  void main(String args[])
	{

		/*Node head=new Node(11);//head pointing to new node with value 11
	  head.next=new Node(22);
	  head.next.next=new Node(33);  //without Linklist Class
	 System.out.println(head);*/
		int ch=0;
		Scanner sc=new Scanner(System.in);
		LinkList list=new LinkList();
		list.insert(11);
		list.insert(25);
		list.insert(3);
		
		do {

			System.out.println("enter choice:  \n1.insert   2.append   3.insert by position  \n4.delete,  5.delete last"
					+ "6.delete by position   \n7. print forwrad   8.print reverse link list    \n9.reverse linklist"
					+ "\n10.print smallest    11.print largest number  \n12.print odd numbers   \n13.print even numbers "
					+ " \n14.insert by value    \n15.insertAtMiddle   \n16.exit");
			ch=sc.nextInt();
			if(ch==16)
				break;

			switch(ch)
			{
			case 1:
				System.out.println("enter number to insert at first");
				list.insert(sc.nextInt());
				break;

			case 2:
				System.out.println("enter number to insert at last");
				list.append(sc.nextInt());
				break;

			case 3:
				System.out.println("enter number to insert at intermediate position: number,position");
				list.insertByPosition(sc.nextInt(),sc.nextInt());
				break;

			case 4:
				list.delete();
				break;

			case 5:
				list.deleteLast();
				break;

			case 6:
				System.out.println("enter position to delete at: ");
				list.deleteByPosition(sc.nextInt());
				break;

			case 7:
				System.out.println(list);
				break;

			case 8:
				list.reversePrint();
				break;

			case 9:
				list.reverse();
				break;


			case 10:
				list.printSmallest();

				break;

			case 11:
				list.printLargest();
				break;

			case 12:
				list.printOdd();
				break;

			case 13:
				list.printEven();
				break;


			case 14:
				System.out.println("enter both value before which new value to be inserted  ");
				list.insertByValue(sc.nextInt(),sc.nextInt());
				break;
				
			case 15:
				System.out.println("enter value to be inserted in the middle");
				list.insertAtMiddle(sc.nextInt());
				break;
			}
		}while(ch!=0);


	}
}
