package employeeLinkList;

public class Node {
	
	 Employee data;
	 Node next;
	
	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
		this.data = data;
	}

//	public Node()
//	{
//		this.data=null;
//		this.next=null;
//	}
//	
	public Node(Employee data)
	{
		this.data=data;
		this.next=null;
	}
	
//	
//	public Node(int data,Node next)
//	{
//		this.data=data;
//		this.next=next;
//		
//	}

	public String toString()
	{
		String str="";
		str=str+this.data+","+this.next;
		return str;
	}
}
