package stack;

public class Main {

	public static void main(String[] args) {
		Stack s1=new Stack(5);
		
		s1.push(25);
		System.out.println(s1);
		s1.push(35);
		s1.push(12);
		s1.push(25);
		s1.push(35);
		System.out.println(s1);
		
		s1.pop();
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);//internally tostring call 
	}

}
