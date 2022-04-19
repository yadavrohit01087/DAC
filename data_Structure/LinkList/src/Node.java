
public class Node {
	
	 int data;
	 Node next;
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node()
	{
		this.data=0;
		this.next=null;
	}
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	
	
	public Node(int data,Node next)
	{
		this.data=data;
		this.next=next;
		
	}

	public String toString()
	{
		String str="";
		str=str+this.data+","+this.next;
		return str;
	}
}
