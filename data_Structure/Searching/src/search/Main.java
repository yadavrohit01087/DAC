package search;

public class Main {

	public static void main(String[] args) {
		Search s1=new Search(5);
		s1.acceptArray();
		int pos=s1.binarySearch(20);
		System.out.println(pos);
		int count=s1.binarySearchData(20);
		System.out.println(count);
	    int pos2=s1.sequentialSearch(30);
	    System.out.println(pos2);
	}

}
