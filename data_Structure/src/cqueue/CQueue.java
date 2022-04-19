package cqueue;

public class CQueue {
	private int []arr;
	private int F;
	private int R;


public CQueue()
{
	this.arr=new int[5];
	this.F=-1;
	this.R=-1;

}

public CQueue(int size)
{
	this.arr=new int[size];
	this.F=-1;
	this.R=-1;
			
}

public void insert(int value)
{
		if(this.F+1==this.R || (this.R==this.arr.length-1 && this.F==0))
	     System.out.println("Circular Queue is full");
		if(this.R!=this.arr.length-1)
	      this.R++;
		else
			this.R=0;
		this.arr[this.R]=value;
		if(this.F==-1)
			this.F++;
}	

public int remove()
{
	int value=0;
	if(this.F==-1)
		System.out.println("Circular Queue is empty");
	else
		value=this.arr[F];
	if(this.F!=this.R)
	{
		if(this.F!=this.arr.length-1)
	    this.F++;
	else
		this.F=0;
	}	
	else
		this.F=this.R=-1;
	return value;
}

public String toString()
{
	String str="";
	if(this.F==-1)
		System.out.println("Circular Queue is empty");
	else
		for(int i=this.F;i<this.R;i++)
		{
			if(i==arr.length-1)
				R=0;
			else
				R++;
		
		str+=this.arr[i]+",";
		}
	return str;
}

/*public CQueue concate(CQueue q)
{
	CQueue res=new CQueue(this.arr.length+q.arr.length);
	for(int i=this.F;i<this.R;i++)
	{
		res.insert(value);
	}
	for(int i=q.
	
	return res;
	}
	*/

}