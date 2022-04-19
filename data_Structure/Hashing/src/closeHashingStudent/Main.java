package closeHashingStudent;
/*
 * 
 * Student.javaCreate Student object with below member variables and provide helping function into Students class
- age
- name
- mobile_no
- emailid

Apply hashing on above Students object to place them in array size 10.
Make use of student's mobile_no for calculating hashcode (key)
Make use of linear probing for collisions
Print number of times collision happened while placing 10 students in array. 


 */

public class Main {

	public static void main(String[] args) {
		CloseHashing hash=new CloseHashing(6);
		Student s1=new Student("Rohit",24,"9930397476","rohit.077yadav@gmail.com");
		Student s2=new Student("Rohit",24,"9930354476","rohit.077yadav@gmail.com");
		Student s3=new Student("Rohit",24,"993039557476","rohit.077yadav@gmail.com");
		Student s4=new Student("Rohit",24,"9930336697476","rohit.077yadav@gmail.com");
		Student s5=new Student("Rohit",24,"993036697476","rohit.077yadav@gmail.com");
		Student s6=new Student("Rohit",24,"99303329797476","rohit.077yadav@gmail.com");
//		Student s2=new Student();
//		Student s3=new Student();
//		Student s4=new Student();
		
		
		hash.insert(s1);
		hash.insert(s2);
		hash.insert(s3);
		hash.insert(s4);
		hash.insert(s5);
		hash.insert(s6);
//		hash.insert(s3);
		System.out.println(hash);
	}

}
