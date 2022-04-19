package q4Calculate;

/*
 * 
 * Write below functions in MyCalculatorOpr class
make all functions static
void add(MyCalculator ob1,MyCalculator ob2)
{
	which will add two calculator objects
} 
void Subtraction(MyCalculator ob1,MyCalculator ob2)
{

}
void multiply(MyCalculator ob1,MyCalculator ob2)
{
	
}
void divide(MyCalculator ob1,MyCalculator ob2)
{

}
 */

public class MyCalculatorOpr {
	
	public static MyCalculator add(MyCalculator ob1, MyCalculator ob2)
	{
		
		MyCalculator ob3=new MyCalculator();
		ob3.num1=ob1.num1+ob2.num1;
		ob3.num2=ob1.num2+ob2.num2;
	     return ob3;
	}
	
	public static MyCalculator subtraction(MyCalculator ob1, MyCalculator ob2)
	{
		
		MyCalculator ob3=new MyCalculator();
		ob3.num1=ob1.num1-ob2.num1;
		ob3.num2=ob1.num2-ob2.num2;
	    return ob3;
	}
	
	public static MyCalculator multiply(MyCalculator ob1, MyCalculator ob2)
	{
		
		MyCalculator ob3=new MyCalculator();
		ob3.num1=ob1.num1*ob2.num1;
		ob3.num2=ob1.num2*ob2.num2;
	    return ob3;
	}
	
	public static MyCalculator division(MyCalculator ob1, MyCalculator ob2)
	{
		
		MyCalculator ob3=new MyCalculator();
		ob3.num1=ob1.num1/ob2.num1;
		ob3.num2=ob1.num2/ob2.num2;
	     return ob3;
	}

}
