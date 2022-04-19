package dQueue;

public class Main {

	public static void main(String[] args) {
		DQueue dq1=new DQueue();
		DQueue dq2=new DQueue(5);
		dq1.insertF(15);
		dq1.insertR(50);
		dq1.insertR(70);
		dq1.removeR();
		dq1.insertR(60);
		dq1.removeF();
		dq1.insertF(10);
		
		System.out.println(dq1);
	}

}
