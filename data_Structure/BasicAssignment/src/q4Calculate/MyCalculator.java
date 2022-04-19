package q4Calculate;

/*
 * Create a class in java MyCalculator with 
two data members int num1,num2 .
Write Parameter less and Parameterized Constructor 
to initialize your data members.
MyCalculator()
{
	//write your code here
}
MyCalculator(int n1,int n2)
{
	//write your code here
}
void display()
{
	Display num 1 and num2 value
}

 * 
 * 
 */

public class MyCalculator {
	int num1;
	int num2;
	
	public MyCalculator()
	{
		this.num1=0;
		this.num2=0;
	}
	
	public MyCalculator(int n1,int n2)
	{
		this.num1=n1;
		this.num2=n2;
	}
	
	void display()
	{
		System.out.println("[ "+num1+","+num2+" ]");
		
	}
	
	
	

}
