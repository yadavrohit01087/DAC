package StudentClassSort;

public class Main {

	public static void main(String[] args) {
		Student students []= new Student [3];
		Student s1=new Student("Rohit",23,'m');
		Student s2=new Student("pawan",25,'m');
		Student s3=new Student("radha",27,'f');
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
//		for(int i=0;i<arr.length;i++)
//		{
//         arr[i]=new Student ("Rohit",23,'m');
//	    }
	   
		Student.byNameAscending(students);
	    Student.print(students);

		Student.byNameDescending(students);
	    Student.print(students);

	}

}
