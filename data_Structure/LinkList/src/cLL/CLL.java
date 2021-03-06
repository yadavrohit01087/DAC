package cLL;

public class CLL {
	Node head;
	
	public CLL()
	{
		this.head=null;
	}

	public void insertFirst(int value)
	{
		Node tmp=new Node(value);
		if(head==null)
		{
			head=tmp;
			tmp.next=head;
		}
		else if(head.next==head)
		{
			
			tmp.next=head;
			head.next=tmp;
			head=tmp;
		}
		else
		{
			tmp.next=head;
			head=tmp;
		}
	}
	
	public void append(int value)
	{
		Node tmp=new Node(value);
		if(head==null)
		{
			head=tmp;
			tmp.next=head;
		}
		else if(head.next==head)
		{
			tmp.next=head;
			head.next=tmp;
		}
		else
		{
			Node itr=head;
			while(itr.next!=head)
			{
				itr=itr.next;
			}
			tmp.next=head;
			itr.next=tmp;
		}
	}
	
	
	private int getCLLLength()
    {
		int count=1;
		Node itr=head;
		while(itr.next!=head)
		{
			count++;
			itr=itr.next;
		}
		return count;
	}
	
	public void insertByPos(int value,int pos)
	{
		Node tmp=new Node(value);
		int noOfNodes=getCLLLength();
		if(pos==1)
		{
			insertFirst(value);
		}
		else if(pos==noOfNodes+1)
		{
			append(value);
		}
		else
		{
			Node itr=head;
			if(pos>1 && pos<noOfNodes+1)
			{
				for(int i=1;i<pos;i++)
				{
					itr=itr.next;
				}
				tmp.next=itr.next;
				itr.next=tmp;
			}
		}
	}
	
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("linklist is empty");
		}
		else if(head.next==head)
		{
			head.next=null;
			head=null;
		}
		else
		{
			Node itr=head;
			while(itr.next!=head)
			{
				itr=itr.next;
			}
			Node tmp=head;
			head.next=head;
			itr.next=head.next;
			tmp.next=null;
		}
		
	}
	
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("linklist is empty");
		}
		else if(head.next==head)
		{
			head.next=null;
			head=null;
		}
		else
		{
			Node itr=head;
			while(itr.next.next!=head)
			{
				itr=itr.next;
			}
			Node tmp=itr.next;
			itr.next=head;
			tmp.next=null;
		}
	}
	
	public void deleteByPos(int pos)
	{
		int noOfNodes=getCLLLength();
		if(pos==1)
		{
			deleteFirst();
		}
		else if(pos==noOfNodes)
		{
			deleteLast();
		}
		else
		{
			Node itr=head;
			if(pos>1 && pos<noOfNodes)
			{
				for(int i=1;i<pos-1;i++)
				{
					itr=itr.next;
				}
				Node tmp=itr.next;
				itr.next=tmp.next;
				tmp.next=null;
			}
		}
	}
	
	
	public String toString()
	{
		String str="";
		if(head==null)
		{
			str="linklist is empty";
		}
		else
		{
			str+=head.data+",";
			Node itr=head.next;
			while(itr!=head)
			{
				str+=itr.data+",";
				itr=itr.next;
			}
		}
		return str;
	}
	
}
