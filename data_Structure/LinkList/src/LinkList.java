
public class LinkList {
	Node head;
	
	public LinkList()
	{
		this.head=null;
	}

	public void insert(int data)
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
	
	public void append(int data)
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
	
	private int getLLLength()
	{
		int count=0;
		Node itr=head;
		while(itr!=null)
		{
			itr=itr.next;
			count++;
			
		}
		return count;
	}
	
	public void insertByPosition(int data,int pos)
	{
		int noOfNodes=getLLLength();
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
			if(pos>1 && pos<noOfNodes+1)
			{
				
				Node tmp=new Node(data);
				Node itr=head;
			    for(int i=1;i<pos;i++)
				{
					itr=itr.next;
				}
				tmp.next=itr.next;
				itr.next=tmp;
			}
			else
				System.out.println("invalid position");
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
	public void deleteByPosition(int pos)
	{
		int noOfNodes=getLLLength();
	
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
				t.next=null;
			}
			
			else
				System.out.println("invalid position");
		}
}
	
	public void reversePrint()
	{
		reversePrintRecursive(head);
		System.out.println();
	}
	
	private void reversePrintRecursive(Node itr)
	{

		if(itr.next!=null)
		{
			reversePrintRecursive(itr.next);
			
		}
		System.out.print(itr.data+",");
	}
	
	public void reverse()
	{
		Node it=head;
		Node itp=null;
		Node itn=head;
		while(it!=null)
		{
			itn=it.next;
			it.next=itp;
			itp=it;
			it=itn;
		}
		head=itp;
		
	}
	
	public void printSmallest()
	{
		  
			Node itr=head;
			int min=itr.data;
			while(itr!=null)
			{
				if(itr.data<min)
				{
					min=itr.data;
				}
				itr=itr.next;
			}
		      System.out.println("smallest number :"+min);
	}
	
	public void printLargest()
	{
			Node itr=head;
			int max=itr.data;
			while(itr!=null)
			{
				if(itr.data>max)
				{
					max=itr.data;
				}
				itr=itr.next;
			}
		      System.out.println("largest number :"+max);
	}
	
	public void printEven()
	{
		System.out.print("even numbers :" );
		Node itr=head;
		while(itr!=null)
		{
			if(itr.data%2==0)
			{
				System.out.print(itr.data+",");
			}
			itr=itr.next;
		}
		System.out.println();
	}
	

	public void printOdd()
	{
		System.out.print("odd numbers :" );
		Node itr=head;
		while(itr!=null)
		{
			if(itr.data%2!=0)
			{
				System.out.print(itr.data+",");
			}
			itr=itr.next;
		}
		System.out.println();
	}
	
	public void insertByValue(int value,int n)
	{
		Node tmp=new Node(n);
		Node itr=head;
		while(itr.data!=value)
		{
			itr=itr.next;
		}
		 tmp.next=itr.next;
		 itr.next=tmp;
	}
	
	public void insertAtMiddle(int data)
	{
		Node tmp=new Node(data);
		int noOfNodes=getLLLength();
		if(head==null)
		{
			head=tmp;
		}
		else
		{
			int pos=noOfNodes/2;
		  if(pos%2==0)
		  {
			  insertByPosition(data,pos);
		  }
		  else
			  insertByPosition(data,(pos+1));
			
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
