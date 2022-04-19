
public class Node {
	
	 String data;
	 Node next;
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node()
	{
		this.data=null;
		this.next=null;
	}
	
	public Node(String data)
	{
		this.data=data;
		this.next=null;
	}
	
	
	public Node(String data,Node next)
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
