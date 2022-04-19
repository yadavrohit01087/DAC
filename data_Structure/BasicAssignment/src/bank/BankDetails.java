package bank;

public class BankDetails {
	
	private int accNo;
	private String name;
	private String accType;
	private float balance;
	
	public BankDetails()
	{
		this.accNo=0;
		this.name=null;
		this.accType=null;
		this.balance=0;
		
	}

	
	public BankDetails(int a,String n,String t,float b)
	{
		this.accNo=a;
		this.name=n;
		this.accType=t;
		this.balance=b;
		
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void depositMoney(int val)
	{
		this.balance+=val;
	}
    public void withdrawMoney(int val)
    {
    	this.balance-=val;
    }
    
    public int checkBalance()
    {
    	int bal=(int)this.balance;
    	return bal;
    }
    
    
	@Override
	public String toString() {
		return "BankDetails [accNo=" + accNo + ", name=" + name + ", accType=" + accType + ", balance=" + balance + "]";
	}
	

}
