package mathUtil;

import java.util.Scanner;

public class Mathutil {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to find sqaure,factorial and check prime");
        int num=sc.nextInt();
        getSquare(num);
        getFact(num);
        getPrime(num);
	}

}
