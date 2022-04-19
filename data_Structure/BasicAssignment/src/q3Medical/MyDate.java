package q3Medical;
/*
 *Create class MyDate(day,month,year) which will have constructors and getter/setters 
and toString().
create another class called 

 
 * 
 */

public class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int d,int m,int y)
	{
		this.day=d;
		this.month=m;
		this.year=y;
	}

	public int getDay()
	{
		return this.day;
	}
	
	public int getMonth()
	{
		return this.month;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public void setDay(int d)
	{
		this.day=d;
	}
	

	public void setMonth(int m)
	{
		this.month=m;
	}
	

	public void setYear(int y)
	{
		this.year=y;
	}
	
	public String toString()
	{
		String str="";
		str="[ "+this.day+"-"+this.month+"-"+this.year+" ]";
		return str;
	}
}
