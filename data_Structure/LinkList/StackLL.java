
public class StackLL {
	static Node top;

	public StackLL()
	{
		this.top=null;
	}
	public StackLL(Node head)
	{
		this.top=head;
	}

	public static void push(Student val)
	{
		Node tmp=new Node(val);
		if(top==null)
		{
			top=tmp;
		}
		else
		{
			tmp.next=top;
			top=tmp;
		}
	}

	public static void pop()
	{
		Node tmp=new Node();
		if(top==null)
		{
			System.out.println("Linklist is empty");
		}
		else 
		{
			if(top.next==null)
			{
				top=null;

			}
			else
			{
				Node t=top;
				top=t.next;
				t.next=null;
			}

		}
	}



	public static void Printmale( )
	{
		Node it=top;
		while(it!=null)
		{
			if(Student.gender=='m')
			{
				System.out.println(it.data);
			}
			it=it.next;
		}
	}

	public static void Printfemale( )
	{    Node it=top;
	while(it!=null)
	{
		if(Student.gender=='f')
		{
			System.out.println(it.data);

		}
		it=it.next;
	}
	}


	public static void reverseprint()
	{
		reverseprintRecursive(top);

	}
	public static void reverseprintRecursive(Node it)
	{
		if(it.next!=null)
			reverseprintRecursive(it.next);
		System.out.print(it.data+"->");

	}

	public void Empty()
	{
		EmptyByRecusrion(top);
		System.out.println("stack is empty");
	}
	
	public void EmptyByRecusrion(Node top2)
	{
		Node temp=top2;
		if(temp!=null)
		{
			EmptyByRecusrion(temp);
		}
	}
	
	
	
	
	
	

	public String toString() {
		String str ="";
		if(this.top==null)
		{
			str= "Linked list empty";
		}
		else
		{
			Node it=top;
			while(it!=null) {
				str +=it.data+"->";
				it=it.next;


			}

		}
		return str;


	}


}









