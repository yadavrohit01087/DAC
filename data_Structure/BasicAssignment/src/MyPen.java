/*
Q1.Create a class MyPen which has 
attributes(pencolour,brand,pentype(Example->ballPen,inkPen,gellPen),price)\
1.Write parameter less and parameterized constructor
2.getter and setter methods and toString() method.
       Write another class called TestMain which has main() method which will create 
3 objects of MyPen class.and which will update the pentype from ballpen to gellpen.
(hint:call setter method to update the type of pen).Display all the objects.

 * 
 */
public class MyPen {
	String penColour;
	String brand;
	String penType;
	int price;
	
	public MyPen()
	{
		this.penColour=null;
		 this.brand=null;
		this.penType=null;
		this.price=0;
	}

	public MyPen(String c,String b, String t,int p)
	{
		this.penColour=c;
		 this.brand=b;
		this.penType=t;
		this.price=p;
	}

	public String getPenColour()
	{
		return this.penColour;
	}
	
	public String getBrand()
	{
		return this.brand;
	}
	
	public String getPenType()
	{
		return this.penType;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	
	public void setPenColour(String c)
	{
		this.penColour=c;
	}
	
	public void setBrand(String b)
	{
		this.brand=b;
	}
	
	public void setPenType(String t)
	{
		this.penType=t;
	}
	public void setPrice(int p)
	{
		this.price=p;
	}
	
	public String toString()
	{
		String str="";
		str="Pen [ "+this.penColour+","+this.brand+","+this.penType+","+this.price+" ]";
		return str;
	}
	
}
