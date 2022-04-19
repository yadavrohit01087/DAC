package q4Calculate;
/*
 * 
 * 
 * {In main function call all of them by creating MyCalculator object.
Public static void main(String args[])

	MyCalculator m=new MyCalculator();

	//
}
 */
		
public class Main {

	public static void main(String[] args) {
	MyCalculator m1=new MyCalculator(30,6);
	MyCalculator m2=new MyCalculator(10,2);
	
	MyCalculator m3= MyCalculatorOpr.add(m1, m2);
	MyCalculator m4= MyCalculatorOpr.subtraction(m1, m2);
	MyCalculator m5 =MyCalculatorOpr.multiply(m1, m2);
	MyCalculator m6= MyCalculatorOpr.division(m1, m2);
	 
	 m1.display();
	 m2.display();
	 m3.display();
	 m4.display();
	 m5.display();
	 m6.display();
	 
	}

}
