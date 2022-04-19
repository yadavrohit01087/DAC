package stack;

public class Stack {
	int top;
	int arr[];
	
	public Stack(int size)
	{
		arr=new int[size];
		top=-1;
	}

	public void push(int value)
	{
		if(top==arr.length-1)
		{
			System.out.println("stack is overflow");
		}
		else
			top++;
		     arr[top]=value;
		
	}
	
	public int pop()
	{
		int value=0;
		if(top!=-1)
		{
			value=arr[top];
		    top--;
		}
		else
		{
			System.out.println("stack is underflow");
		}  
		    return value;
	}
	
	public String toString()
	{
		String str="";
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		else
			for(int i=top;i>=0;i--)
			{
				str=str+arr[i]+",";
			}
		return str;
	}
}
