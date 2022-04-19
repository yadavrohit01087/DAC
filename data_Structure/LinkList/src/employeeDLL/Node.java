package employeeDLL;

public class Node {
	
	private Node prev;
	private Employee data;
	private Node next;
	
	public Node(Employee data)
	{
		this.prev=null;
		this.data=data;
		this.next=null;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String toString()
	{
		String str="";
		str=this.data+"";
		return str;
	}
}
