package studentArr;

public class StudentMain {

	public static void main(String[] args) {
		//Student s1=new Student("Rohit",24);
		
		Student s []=new Student[3];
		s[0]=new Student(12,"Rohit",30);
		s[1]=new Student(23,"Chitra",3);
		s[2]=new Student(10,"gauri",29);
		Student.maxAge(s);
		
		int arr1[]=new int [5];
		int arr2[]=new int [5];
		int arr3[]=new int [5];
		
		for(int i=0;i<arr1.length;i++)//setmarks of each object
		{
			arr1[i]=i*10;
		}
		for(int i=0;i<arr2.length;i++)//setmarks of each object
		{
			arr2[i]=i*15;
		}
		
		for(int i=0;i<arr3.length;i++)//setmarks of each object
		{
			arr3[i]=i*12;
		}

			s[0].setMarks(arr1);
			s[1].setMarks(arr2);
			s[2].setMarks(arr3);

		for(int i=0;i<s.length;i++)//print student objects
		{
			System.out.println(s[i]);
		}
		System.out.println("avg of marks of 1st student :"+s[0].getEachAvg());
		System.out.println("avg of marks of 2nd student :"+s[1].getEachAvg());
		System.out.println("avg of marks of 3rd student :"+s[2].getEachAvg());
		
		Student.findAvg(s);
		
		for(int i=0;i<arr1.length;i++)
		{
			int crr[]=s[0].getMarks();
			System.out.print(crr[i]+",");
		}
		System.out.println();
		
		for(int i=0;i<arr2.length;i++)
		{
			int crr[]=s[1].getMarks();
			System.out.print(crr[i]+",");
		}
		System.out.println();
		
		for(int i=0;i<arr3.length;i++)
		{
			int crr[]=s[2].getMarks();
			System.out.print(crr[i]+",");
		}
		System.out.println();
		
//		}
//		int arr2 []=new int[] {23,45,12,30,70,50};
//		
//		concate(arr2,arr);
//		
		

		//		s1.printAvgMarks();
		//		s1.printLowestMarks();
		//		s1.printHighestMarks();
		//		System.out.println(s1);
	}
//	
//	private static void maxAge(Student[] s) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public static void concate(int [] arr,int []arr2)
//	{
//		int [] arr3=new int [arr.length+arr2.length];
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr3[i]=arr[i];
//		}
//		int j=0;
//		for(int i=arr.length;i<arr3.length;i++)
//		{
//			while(j<arr2.length)
//			{
//			arr3[i]=arr2[j];
//			j++;
//			}
//		}
//		
//		for(int i=0;i<arr3.length;i++)
//		{
//			System.out.print(arr3[i]+",");
//		}
//		System.out.println();
//	}
}
