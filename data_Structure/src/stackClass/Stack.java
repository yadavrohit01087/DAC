package stackClass;

public class Stack {
	private int [] arr;
	private int top;
			
	public Stack()
	{
		this.arr=new int[5];
		this.top=-1;
	}

	public Stack(int size)
	{
		this.arr=new int[size];
		this.top=-1;
	}
	public void push(int value)
	{
		if(this.top<this.arr.length-1)
		{
			this.top++;
			this.arr[this.top]=value;
		}
		
		else
			System.out.println("stack is overflow");
	}
	
	public int pop()
	{
		int value=0;
		if(this.top!=-1)
		{
			 value=this.arr[this.top];
			this.top--;
			
		}
		else 
			System.out.println("stakc is underflow");
		
		return value;
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
		for(int i=0;i<this.arr.length;i++)
		{
			res.push(this.arr[i]);
		}
		for(int i=0;i<s2.arr.length;i++)
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
