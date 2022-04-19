package dQueue;

public class DQueue {
	private int [] arr;
	private int F=-1;
	private int R=-1;
	
	public DQueue()
	{
		this.arr=new int[5];
		this.F=-1;
		this.R=-1;
		
	}
	
	public DQueue(int size)
	{
		this.arr=new int[size];
		this.F=-1;
		this.R=-1;
		
	}
	
	public void insertR(int value)
	{
		if(this.F==0 && this.R==this.arr.length-1)//check full condition
		{
			System.out.println("queue is full");
		}
		else 
		{
			if(this.R!=this.arr.length-1)//check space after Rear
			{
				this.R++;
				this.arr[this.R]=value;
			}
			else if(this.F!=0)//check space before front
			{
				this.F--;
				for(int x=this.F;x<this.R;x++)//move elements towards front end by 1 position to insert from rear 
				{
					this.arr[x]=this.arr[x+1];
				}
				this.arr[this.R]=value;//insert value from rear
			}
			else if(this.F==-1)// for inserting 1st element 
				this.F=0;
		}
	}
	
	public void insertF(int value)
	{
		if(this.F==0 && this.R==this.arr.length-1)//check full condition
		{
			System.out.println("queue is full");
		}
		else 
		{
			if(this.F!=0)//check space before front
			{
				this.F--;
				this.arr[this.F]=value;
			}
			else if(this.R!=this.arr.length-1)//check space after rear
			{
				this.R++;
				for(int x=this.R;x>this.F;x--)//move elements towards rear end by 1 position to insert from front 
				{
					this.arr[x]=this.arr[x-1];
				}
				this.arr[this.F]=value;//insert value from front
			}
			else if(this.R==-1)//for inserting first element
				this.R=this.F=0;
		}
	}
	
	public int removeF()
	{
		int value=0;
		if(this.F==-1)//check empty condition
		{
			System.out.println("queue is empty");
		}
		else
		{
			value=this.arr[this.F];
			if(this.R==this.F)
				this.R=this.F=-1;
			else
			    this.F++;
		}
		
		return value;
	}
	
	public int removeR()
	{
		int value=0;
		if(this.R==-1)
		{
			System.out.println("queue is empty");
		}
		else
		{
			value=this.arr[this.R];
			
			if(this.R!=this.F)
				this.R--;
			else
			    this.R=this.F=-1;
		}
		
		return value;
	}
	
	public String toString()
	{
		String str="";
		if(this.F==-1)
		{
		   System.out.println("queue is empty");
		}
		else
		{
			
			for(int i=this.F;i<this.R;i++)
			{
				str+=arr[i]+",";
			}
		}
		return str;
		
	}

}
