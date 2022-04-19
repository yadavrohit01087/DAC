package mergeSorting;

public class Main {

	public static void main(String[] args) {
		int crr[]=new int[] {5,12,34,45,6,23,19,67,10,51};
		
		MergeSorting.print(crr);
		MergeSorting.mergeSort(crr, 0, 9);
		MergeSorting.print(crr);
	

	}

}
