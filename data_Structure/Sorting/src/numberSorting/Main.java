/*
Write Java code to sort below array using Quick sort. 
Each element in the array is object of Number class which holds int value.
{5,16,7,3,1,11,29,18,20,25}
 * 
 */

public class Main {

	public static void main(String[] args)
	{
		int arr[]=new int[]{5,16,7,3,1,11,29,18,20,25};
		
		Sort sort=new Sort();
		Sort.quickSort(arr,0,9);
		Sort.print(arr);
	
	}

}
