package closeHashingStudent;

public class Node {
	
	 Student data;
	 Node next;
	
	public Student getData() {
		return data;
	}

	public void setData(Student data) {
		this.data = data;
	}

	public Node()
	{
		this.data=null;
		this.next=null;
	}
	
	public Node(Student data)
	{
		this.data=data;
		this.next=null;
	}
	
	
	public Node(Student data,Node next)
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
