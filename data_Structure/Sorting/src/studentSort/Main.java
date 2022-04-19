package studentSort;

public class Main {

	public static void main(String[] args) {
		Student arr []=new Student[3];
		Student s1=new Student("Amisha",25,'F');
		Student s2=new Student("Rohit",24,'M');
		Student s3=new Student("Basant",18,'M');
		arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
       /* SortStudent.byAgeAscending(arr);
        SortStudent.print(arr);
        SortStudent.byAgeDescending(arr);
        SortStudent.print(arr);*/
        
        SortStudent.byNameAscending(arr);
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        //SortStudent.print(arr);
        }
        SortStudent.byNameDescending(arr);
        SortStudent.print(arr);
	}

}
