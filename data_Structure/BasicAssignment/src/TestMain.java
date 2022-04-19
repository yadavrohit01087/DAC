
public class TestMain {

	public static void main(String[] args) {
		MyPen p1=new MyPen("Blue","cello","gelpen",10);
		MyPen p2=new MyPen("Black","cello gripper","ballpen",5);
		MyPen p3=new MyPen("Red","parker","inkpen",15);
		
		p2.setPenType(p1.getPenType());
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
