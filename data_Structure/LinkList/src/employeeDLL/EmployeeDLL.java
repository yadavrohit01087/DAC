package employeeDLL;

public class EmployeeDLL {
	Node head;
	Node tail;
	
	public EmployeeDLL()
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
			itr=itr.getNext();
		}
		return count;
	}
	
	public void insert(Employee e)
	{
		Node tmp=new Node(e);
		if(head==null)
		{
			head=tail=tmp;
		}
		else 
		{
			head.setPrev(tmp);
			tmp.setNext(head);
			head=tmp;
		}
		
	}
	
	public void append(Employee e)
	{
		Node tmp=new Node(e);
		if(tail==null)
		{
			head=tail=tmp;
		}
		else 
		{
			tmp.setPrev(tail);
			tail.setNext(tmp);
		    tail=tmp;
		 }
		
	}
	
	public void append(String name,int age,float salary)
	{
		Employee e1=new Employee(name,age,salary);
		Node tmp=new Node(e1);
		if(tail==null)
		{
			head=tail=tmp;
		}
		else 
		{
			tmp.setPrev(tail);
			tail.setNext(tmp);
			tail=tmp;
		 }
		
	}
	
	public void append(EmployeeDLL edll)
	{
		Node itr=edll.head;
		while(itr!=null)
		{
			this.append(itr.getData());
			itr=itr.getNext();
		}
		
		System.out.println(this);
	}
	
	public void insertAtPos(Employee e,int pos)
	{
		int noOfNodes=getDLLLength();
		Node tmp=new Node(e);
		if(pos==1)
		{
			insert(e);
		}
		else if(pos==noOfNodes+1)
		{
			append(e);
		 }
		else
		{
			Node itr=head;
			if(pos>1 && pos<noOfNodes+1)
			{
				for(int i=1;i<pos-1;i++)
				{
					itr=itr.getNext();
				}
				tmp.setNext(itr.getNext());
				tmp.setPrev(itr);
				itr.setNext(tmp);
				itr.getNext().setPrev(tmp);
				
			}
		}
	}
	
	public void delete()
	{
		if(head==null)
		{
			System.out.println("linklist is empty");
		}
		else if(head.getNext()==null)
		{
			head=tail=null;
		}
		else 
		{
			Node tmp=head;
			head=head.getNext();
			head.setPrev(null);
			tmp.setNext(null);
			
		}
	}

	public void deleteLast()
	{
		if(tail==null)
		{
			System.out.println("linklist is empty");
		}
		else if(tail==head)
		{
			head=tail=null;
		}
		else
		{
			Node itr=tail;
			tail=tail.getPrev();
			tail.setNext(null);
			itr.setPrev(null);
		}
	}
	
	public void deleteAtPos(int pos)
	{
		int noOfNodes=getDLLLength();
		if(pos==1)
		{
			delete();
		}
		else if (pos==noOfNodes)
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
					itr=itr.getNext();
				}
				
				Node t=itr.getNext();
				itr.setNext(t.getNext());
				t.getNext().setPrev(itr);
				t.setNext(null);
				t.setPrev(null);
			}
		}
		
	}
	
	
    public void deleteOlderThan31Age()   
    {
    	int i=1;
    	Node itr=head;
    	while(itr!=null)
    	{
    		if(itr.getData().getAge()>31)
    		{
    			itr=itr.getNext();
    			deleteAtPos(i);
//    			itr.getPrev().setNext((itr.getNext());
//    			itr.getNext().setPrev((itr.getPrev());
//    			itr.setPrev(null);
//    			itr.setNext(null);
    			
    		}
    		else
    		{
    		itr=itr.getNext();
    		i++;
    		}
    	}
    	
    }
    
    public static void printCommonEmployees(EmployeeDLL el1, EmployeeDLL el2)
    {
    	String str="";
    	Node itr1=el1.head;
    	
    	while(itr1!=null )
    	{
    		Node itr2=el2.head;
    		while(itr2!=null)
    		{
    			if(itr1.getData().getName().compareTo(itr2.getData().getName())==0)
    			{
    				if((itr1.getData().getAge()==itr2.getData().getAge())&&
    						(itr1.getData().getSalary()==itr2.getData().getSalary()))
    				{
    					str+=itr2.getData();
    				}
    			}
    			itr2=itr2.getNext();	
    		}
    		itr1=itr1.getNext();
    	}
    	System.out.println(str);
    }
    
    public static EmployeeDLL concat(EmployeeDLL el1, EmployeeDLL el2)
    {
    	EmployeeDLL el3=new EmployeeDLL();
    	 el3=el1;
    	 Node tmp=el2.head;
    	 el3.tail.setNext(tmp);//el3.tail.setNext(el2.head)
    	 tmp.setPrev(el3.tail);//el2.head.setPrev(el3.tail)
    	
    	return el3;
//    	Node itr1=el1.head;
//    	Node itr2=el2.head;
//    	
//    	while(itr1!=null)
//    	{
//    		el3.append(itr1.getData());
//    		itr1=itr1.getNext();
//    	}
//    	
//    	while(itr2!=null)
//    	{
//    		el3.append(itr2.getData());
//    		itr2=itr2.getNext();
//    	}
    	
    }
    
	public String toString()
	{
		System.out.println("*********************");
		String str="";
		if(tail==null)
		{
			System.out.println("LinkList is empty");
		}
		else
		{
			Node itr=head;
			while(itr!=null)
			{
				str+=itr.getData()+",";
				itr=itr.getNext();
			}
		}
		return str;
	}
	
	
	
}
