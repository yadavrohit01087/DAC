package emplyeeQueue;


public class Queue {
	private Employee [] arr;
	private int F;
	private int R;


	public Queue()
	{
		this.arr=new Employee[5];
		this.F=-1;
		this.R=-1;
	}

	public Queue(int size)
	{
		this.arr=new Employee[size];
		this.F=-1;
		this.R=-1;
	}

	public void insert(Employee e)
	{
		if(this.R<this.arr.length-1)
		{
			this.R++;
			this.arr[this.R]=e;
			if(this.F==-1)
				this.F++;
		}
		else
			System.out.println("stack is full");
	}
	
	public Employee remove()
	{
		Employee e=null;
		if(this.F!=-1)
		{  
			e=this.arr[F];
			if(this.F!=this.R)  
				this.F++;
		}
		else
			System.out.println("queue is empty");
		return e;
	}

	public String toString()
	{
		String str="";
		if(this.F==-1)
			System.out.println("queue is empty");

		else
		{
			for(int i=this.F;i<=this.R;i++)
				str+=this.arr[i]+",";
		}
		return str;

	}
	
	public Queue concate(Queue q)
	{
	
		Queue res=new Queue(this.arr.length+q.arr.length);
		for(int i=0;i<this.R;i++)
		{
			res.insert(this.arr[i]);
		}
		for(int i=0;i<q.R;i++)
		{
			res.insert(q.arr[i]);
		}
		
		return res;
	}
	

}
