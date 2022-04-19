package cLLEmployee;

public class Node {
	Employee data;
	Node next;
	
	public Node(Employee e)
	{
		this.data=e;
		this.next=null;
	}

	public String toString()
	{
		String str="";
		str=this.data+"";
		return str;
	}
}
