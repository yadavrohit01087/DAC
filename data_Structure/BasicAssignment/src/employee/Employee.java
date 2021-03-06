package employee;

/*
 * 
 *Q2.Create a class Employee(empid,empname,basicSalary)
Write constructor,toString(),getter and setter method.
and also add calculateSalary() which calculate salary with incentive
if basicSalary is greater than 5000 the incentaive is 1000rs.
otherwise incentaive is 500rs  
 * 
 */

public class Employee {
	private int empid;
	private String empName;
	private float basicSalary;
	private boolean isExperienced;
	private Date doj;
	
	public Employee(int id,String n,float s,Date d)
	{
		this.empid=id;
		this.empName=n;
		this.basicSalary=s;
		this.doj=d;
	}
	
	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public void setExperienced(boolean b)
	{
		this.isExperienced=b;
	}
	public int getEmpId()
	{
		return this.empid;
	}

	public String getEmpName()
	{
		return this.empName;
	}
	
	public float getBasicSalary()
	{
		return this.basicSalary;
	}
	

	public void setEmpId(int id)
	{
		this.empid=id;
	}

	public void setEmpName(String n)
	{
		 this.empName=n;
	}
	
	public void setBasicSalary(float s)
	{
		this.basicSalary=s;
	}
	
	
	public float calculateSalary()
	{
		float res=0;
		if(basicSalary>5000)
		{
		  res=this.basicSalary+1000;
		}
		else
			res=this.basicSalary+500;
		
	     return res;
	}
	
	public String toString() {
		String str="";
		str="Employee [ "+this.empid+","+this.empName+","+this.basicSalary+","+this.isExperienced+","+this.doj+" ]";
		
		return str;
		
	}
}
