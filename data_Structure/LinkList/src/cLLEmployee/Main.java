package cLLEmployee;

public class Main {

	public static void main(String[] args) {
		CLL list=new CLL();
		Employee e1=new Employee("Rohit",25,25000);
		Employee e2=new Employee("Pawan",24,45000);
		Employee e3=new Employee("Vijay",23,55000);
		Employee e4=new Employee("Amber",27,35000);
		
		list.insertFirst(e1);
		System.out.println(list);

		list.append(e2);
		System.out.println(list);
		
		list.insertByPos(e3,2);
		System.out.println(list);
		
		int p=list.getCLLLength();
		System.out.println(p);
		
		list.deleteFirst();
		System.out.println("*****"+list);
		
		list.deleteLast();
		System.out.println(list);
		
		list.deleteByPos(1);
		System.out.println(list);
	}

}
