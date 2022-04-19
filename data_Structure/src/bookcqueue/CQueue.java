package bookcqueue;

public class CQueue {
	private Book []arr;
	private int F;
	private int R;


public CQueue()
{
	this.arr=new Book[5];
	this.F=-1;
	this.R=-1;

}

public CQueue(int size)
{
	this.arr=new Book[size];
	this.F=-1;
	this.R=-1;
			
}

public void insert(Book b)
{
		if(this.F+1==this.R || (this.R==this.arr.length-1 && this.F==0))
	     System.out.println("Circular Queue is full");
		if(this.R!=this.arr.length-1)
	      this.R++;
		else
			this.R=0;
		this.arr[this.R]=b;
		if(this.F==-1)
			this.F++;
}	

public Book remove()
{
	Book b=null;
	if(this.F==-1)
		System.out.println("Circular Queue is empty");
	else
		b=this.arr[F];
	if(this.F!=this.R)
	{
		if(this.F!=this.arr.length-1)
	    this.F++;
	else
		this.F=0;
	}	
	else
		this.F=this.R=-1;
	return b;
}

public String toString()
{
	String str="";
	if(this.F==R)
		System.out.println("Circular Queue is empty");
	else
		for(int i=this.F;i<this.R;i++)
		str+=this.arr[i]+",";
	return str;
}

/*public CQueue concate(CQueue q2)
{
	CQueue res=new CQueue(this.arr.length+q2.arr.length);
	for(int i=this.F;i<this.R;i++)
	{
		res.insert(value);
	}
	
	return res;
	*/

}