package stackUsingLinkedList;

public class StackLL {
	Node top;
	
	public StackLL()
	{
		this.top=null;
	}
	
	public void push(int value)//insertFirst
	{
		Node tmp=new Node(value);
		if(top==null)
		top=tmp;
		else 
		{
			tmp.next=top;
			top=tmp;
		}
		
	}
	
	public int pop()//deleteLast
	{
		Node itr=top;
		while(tmp!=null)
		{
			
		}
		
		
	}

	
}
