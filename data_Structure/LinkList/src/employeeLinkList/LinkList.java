package employeeLinkList;

public class LinkList {
	Node head;
	
	public LinkList()
	{
		this.head=null;
	}

	public void insert(Employee data)
	{
		Node tmp=new Node(data);
		if(head==null)
		{
		head=tmp;
		}
		
		else
		{
			tmp.next=head;
			head=tmp;
			
		}
	}
	
	public void append(Employee data)
	{
		Node tmp=new Node(data);
		if(head==null)
		{
			head=tmp;
		}
	    
		if(head.next==null)
		{
			head.next=tmp;
			tmp.next=null;
			
		}
		else
		{
			Node itr=head;
			while(itr.next!=null)
			{
				
				itr=itr.next;
			}
			if(itr.next==null)
			{
				itr.next=tmp;
			    tmp.next=null;
			}
		}
	}
	
	
	public void delete()
	{
		if(head==null)
		{
			System.out.println("linklist is empty");
		}
		if(head.next==null)
		{
			head=null;
		}
		else
		{
			Node t=head;
			head=t.next;
			t.next=null;
		}
		
	}
	
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("linklist is empty");
		}
		if(head.next==null)
		{
			head=null;
		}
		else
		{
			Node jtr=null;
			Node itr=head;
			while(itr.next!=null)
			{
				jtr=itr;
				itr=itr.next;
			}
			jtr.next=null;
			itr=null;
		}
	}
	
	public String toString()
	{
		String str="";
		if(head==null)
		{
			str="linklist is empty";
		}
		Node itr=head;
		while(itr!=null)
		{
			str+=itr.getData()+",";
			itr=itr.next;
		}
		return str;
	}
}
