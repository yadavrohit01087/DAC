package quickSortStudent;

public class Main {

	public static void main(String[] args) {
//		int arr[]=new int[] {1,2,2,5};
//		int brr[]=new int[] {9,11,23,39};
	
//		int crr[]=new int[arr.length+brr.length];
//		QuickSorting.mergeSort(arr,brr,crr);
//		QuickSorting.print(crr);
      
    	
    	
    	 Student s1=new Student("Rohit",24,'M');
    	 Student s2=new Student("Bharat",29,'M');
    	 Student s3=new Student("Vijay",25,'M');
    	 Student s4=new Student("Vishay",18,'M');
          
    	 Student mrr[]=new Student[] {s1,s2,s3,s4};
    	 QuickSorting.quickSort(mrr,0,mrr.length-1);
          QuickSorting.print(mrr);
	}

	

	}

