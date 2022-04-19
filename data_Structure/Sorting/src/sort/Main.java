package sort;

public class Main {

	public static void main(String[] args) {
		int arr []=new int[] {24,2,45,100,23,5,100,42};
		//Sort.print(arr);
		/*Sort.selectionAscending(arr);
		Sort.print(arr);
		Sort.selectionDescending(arr);
		Sort.print(arr);*/
		
//		Sort.insertionAscending(arr);
//		Sort.print(arr);
//		Sort.insertionDescending(arr);
//		Sort.print(arr);
		
		Sort.bubbleAscending(arr);
		Sort.print(arr);
		Sort.bubbleDescending(arr);
		Sort.print(arr);
	}

}
