package quickSorting;

public class Main {

	public static void main(String[] args) {
//		int arr[]=new int[] {1,2,2,5};
//		int brr[]=new int[] {9,11,23,39};
	
//		int crr[]=new int[arr.length+brr.length];
//		QuickSorting.mergeSort(arr,brr,crr);
//		QuickSorting.print(crr);
      
    	int mrr[]=new int[] {23,2,34,12,9,20};
    	 QuickSorting.quickSort(mrr,0,mrr.length-1);
          
        QuickSorting.print(mrr);
	}

	

	}

