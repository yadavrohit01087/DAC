package cLL;

public class Main {

	public static void main(String[] args) {
		CLL list=new CLL();
		list.insertFirst(20);
		System.out.println(list);

		list.append(40);
		System.out.println(list);
		
		list.insertByPos(60,2);
		System.out.println(list);
		
//		list.deleteFirst();
//		System.out.println(list);
		
		list.deleteLast();
		System.out.println(list);
		
		list.deleteByPos(1);
		System.out.println(list);
	}

}
