package hashingStudent;

public class Main {

	public static void main(String[] args) {
		HashingStudent hash=new HashingStudent(50);
		Student s1=new Student("Rohit",24,999999990397476L,"rohit.077yadav@gmail.com");
		Student s2=new Student("komal",25,1000345686L,"komal.054yadav@gmail.com");
		Student s3=new Student("drishtant",23,10000056L,"drish347.mishra@gmail.com");
		Student s4=new Student("Rohit",24,9930397476L,"rohit.077yadav@gmail.com");
		
		hash.insert(s1);
		hash.insert(s2);
		hash.insert(s3);
		hash.insert(s4);
		System.out.println(hash);
		
//		hash.remove(s1);
//		hash.remove(s1);
//		hash.remove(s1);
		System.out.println(hash);
	}

}
