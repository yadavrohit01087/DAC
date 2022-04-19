package bookcqueue;
/*
Q1.Create a class Book(bookId,bookName,bookPrice)
1.Write no argument constructor 
2.Write parameterized constructor.
3.Write display function to display all the book information.
4.Write getter and setter functions.and toString() method.
create two objects of book class to call the functions.

*/
public class Book {
	
	private int bookId;
	private String bookName;
	private float bookPrice;
	
	public Book()
	{
		bookId=123;
		bookName="unknown";
		bookPrice=0.0f;
		
	}
	
	public Book(int id,String book,float price)
	{
		bookId=id;
		bookName=book;
		bookPrice=price;
		
	}
	
	public void display()
	{
		System.out.println("Book details: " +"\n"+ "Book ID: "
	                       +bookId+"  Book Name: "+bookName
	                       +"  Book Price: "+bookPrice);
		
	}
	
	public int getId()
	{
		return bookId;
	}
	
	public String getName()
	{
		return bookName;
	}
	
	public float getPrice()
	{
		return bookPrice;
	}
	
	public void  setId(int i)
	{
		 bookId=i;
	}
	
	public void setName(String b)
	{
	    bookName=b;
	}
	
	public void setPrice(float p)
	{
		bookPrice=p;
	}
	
	@Override
	public String toString()
	{
		String str="Book details: " +"\n"+ "[Book ID: "
                +bookId+" Book Name: "+bookName
                +"  Book Price: "+bookPrice+"]";
        return str;
	}
	

}
