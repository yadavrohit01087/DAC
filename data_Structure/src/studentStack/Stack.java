package studentStack;

public class Stack {
	private Student [] arr;
	private int top;
			
	public Stack()
	{
		this.arr=new Student[5];
		this.top=-1;
	}

	public Stack(int size)
	{
		this.arr=new Student[size];
		this.top=-1;
	}
	public void push(Student s)
	{
		if(this.top<this.arr.length-1)
		{
			this.top++;
			this.arr[this.top]=s;
		}
		
		else
			System.out.println("stack is overflow");
	}
	
	public Student pop()
	{
		Student s=null;
		if(this.top!=-1)
		{
			s=this.arr[this.top];
			this.top--;
			
		}
		else 
			System.out.println("stack is underflow");
		
		return s;
	}
	
	public String toString()
	{
		String str="";
		if(top==-1)
			System.out.println("stack is empty");
		
		for(int i=0;i<this.top;i++)
		{
			str+=arr[i]+",";
		}
		return str;
	}

	public Stack concat(Stack s2) {
		Stack res=new Stack(this.arr.length+s2.arr.length);
		for(int i=0;i<this.top;i++)
		{
			res.push(this.arr[i]);
		}
		for(int i=0;i<s2.top;i++)
		{
			res.push(s2.arr[i]);
		}
		return res;
	}
	
	public boolean equals(Stack x)
	{
		if(this.arr.length !=x.arr.length)
			return false;
		if(this.top!=x.top)
			return false;
		
			for(int i=0;i<this.top;i++)
			{
				if(this.arr[i]!=x.arr[i])
					return false;
		    }
			
		return true;
	}
	
}
