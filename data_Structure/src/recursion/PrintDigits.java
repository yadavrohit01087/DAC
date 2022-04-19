package recursion;

import java.util.Scanner;

public class PrintDigits {

	public static void main(String[] args) {
		int x;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		 x=sc.nextInt();
		int  res=sumOfDigits(x);
		
		System.out.println(res);
		
	}
	static int sumOfDigits(int n)//1111
	{
		if(n==0)
			return 0;
		else
			return n%10 + sumOfDigits(n/10);//1+SUM(111)-->1+1+SUM(11)-->1+1+1+SUM(1)-->1+1+1+0
		
	}

	
}
