package practise;

public class Main {
  public static  void main(String args[])
  {
	  /*Node head=new Node(11);//head pointing to new node with value 11
	  head.next=new Node(22);
	  head.next.next=new Node(33);  //without Linklist Class
	 System.out.println(head);*/
	  
	  LinkList list=new LinkList();
	  list.insert(34);
	  list.insert(54);
	  list.append(94);
	  list.delete();
	  list.deleteLast();
	  
	  System.out.println(list);
	  
  }
}
