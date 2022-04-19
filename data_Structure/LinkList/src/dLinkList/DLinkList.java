package dLinkList;

public class DLinkList {
	Node head;
	Node tail;

	public DLinkList()
	{
		this.head=null;
		this.tail=null;
	}

	public int getDLLLength()
	{
		int count=0;
		Node itr=head;
		while(itr!=null)
		{
			count++;
			itr=itr.next;
		}
		return count;
	}

	public void insert(int data) {
		Node tmp=new Node(data);
		if(head==null)
		{
			head=tail=tmp;
		}

		else 
		{
			tmp.next=head;
			head.prev=tmp;
			head=tmp;
		}	
	}

	public void append(int data)
	{
		Node tmp=new Node(data);
		if(tail==null)
		{
			head=tail=tmp;
		}
		else
		{
			tmp.prev=tail;
			tail.next=tmp;
			tail=tmp;
		}
	}

	public void insertByPosition(int data,int pos)
	{

		int noOfNodes=getDLLLength();
		if(pos==1)
		{
			insert(data);
		}

		else if(pos==noOfNodes+1) 
		{
			append(data);
		}
		else
		{
			Node tmp=new Node(data);
			if(pos>1 && pos<noOfNodes+1) //validate position
			{
				Node itr=head;
				for(int i=1;i<pos-1;i++)
				{
					itr=itr.next;
				}
				tmp.next=itr.next;
				itr.next.prev=tmp;
				itr.next=tmp;
				tmp.prev=itr;
			}
			else
				System.out.println("invalid position");
		}
	}

	public void delete()
	{
		if(head==null)
			System.out.println("linkedlist is empty");

		else if(head.next==null)
		{
			head=tail=null;
		}
		else 
		{
			Node tmp=head;
			head=head.next;
			head.prev=null;
			tmp.next=null;

		}
	}

	public void deleteLast()
	{

		if(tail==null)//empty condition
			System.out.println("linkedlist is empty");

		else if(tail.prev==null)//if(head.next==null), if(head==tail) one node
		{
			head=tail=null;
		}
		else //more than one node
		{
			Node tmp=tail;
			tail=tail.prev;
			tail.next=null;
			tmp.prev=null;
		}
	}

	public void deleteByPosition(int pos)
	{
		int noOfNodes=getDLLLength();
		if(pos==1)
		{
			delete();
		}
		else if(pos==noOfNodes)
		{
			deleteLast();
		}
		else
		{
			if(pos>1 && pos<noOfNodes)
			{
				Node itr=head;
				for(int i=1;i<pos-1;i++)
				{
					itr=itr.next;
				}
				Node t=itr.next;
				itr.next=t.next;
				t.next.prev=itr;
				t.next=null;
				t.prev=null;
			}
			else
				System.out.println("invalid postion");
		}
	}

	public void reversePrint()
	{
		if(tail==null)
		{
			System.out.println("linklist is empty");
		}
		else
		{
			Node itr=tail;
			while(itr!=null)
			{
				System.out.print(itr.data+",");
				itr=itr.prev;
			}
			System.out.println();
		}
	}


	public String toString()
	{
		if(head==null)
		{
			System.out.println("linklist is empty");
		}
		String str="";
		Node itr=head;
		while(itr!=null)
		{
			str+=itr.data+",";
			itr=itr.next;
		}
		return str;
	}
}
