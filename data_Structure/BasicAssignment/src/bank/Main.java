package bank;

import java.util.Scanner;

public class Main {

	/*
	 * Q5.Write a Java Class BankDetails which contains(accno,name,acc_type,balance)
For the aboove class do below options.
1.Deposit_money()
2.Withdraw_money()
3.check_balance()
4.display_all information about account
Account no should be generated automatically should not be taken from user.

	 */
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	BankDetails b1=new BankDetails(109200,"Rohit","saving",15000.0f);
	BankDetails b2=new BankDetails(119200,"Rohi","current",100000.0f);
	
	System.out.println("enter amount to be deposited:");
	int dep=sc.nextInt();
	b1.depositMoney(dep);
	System.out.println("enter amount to be withdraw:");
	int w=sc.nextInt();
	b1.withdrawMoney(w);
	int bal=b1.checkBalance();
	System.out.println("balance :"+bal);
	System.out.println(b1);
	

	}

}
