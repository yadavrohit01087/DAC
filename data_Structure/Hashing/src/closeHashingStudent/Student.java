package closeHashingStudent;

public class Student {
	private String name;
	private String mobile;
	private int age;
	private String email;
	
	public Student()
	{
		this.name=null;
		this.age=0;
		this.mobile=null;
		this.email=null;
		
	}
	
	public Student(String n,int a,String m,String e)
	{
		this.name=n;
		this.age=a;
		this.mobile=m;
		this.email=e;
		
	}
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(String name,String mobile,int age,String email)
	{
		this.mobile=mobile;
		this.name=name;
		this.age=age;
		this.email=email;
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mobile=" + mobile + ", age=" + age + ", email=" + email + "]";
	}
	
}	
