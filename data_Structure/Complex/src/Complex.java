
public class Complex {
	int real;
	int img;
	
	public Complex()
	{
		this.real=0;
		this.img=-1;
	}
	public Complex(int real,int img)
	{
		this.real=real;
		this.img=img;
	}
	
	public int getReal()
	{
		return this.real; 
	}
	
	public int getImg()
	{
		return this.img;
	}
	
	public void setReal(int real)
	{
		
		this.real=real;
	}

	public void setImg(int img)
	{
		
		this.img=img;
	}
	
	public String toString()
	{
		String str="";
		str+="["+this.real+","+this.img+"]";
		return str;
	}
}
