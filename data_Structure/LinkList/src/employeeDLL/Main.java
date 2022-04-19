package employeeDLL;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("Amber", 47, 15500); //name, age & salary
		Employee e2 = new Employee("Borat", 23, 15600);
		Employee e3 = new Employee("Celcia", 30, 15100);
		Employee e4 = new Employee("Dexter", 40, 15200);
		Employee e5 = new Employee("Esther", 33, 15300);
		Employee e6 = new Employee("Frank", 31, 15600);
		Employee e7 = new Employee("Ginny", 35, 15100);
		Employee e8 = new Employee("Harry", 27, 15200);
		Employee e9 = new Employee("Esther", 29, 15300);
		
		EmployeeDLL employeeList1 = new EmployeeDLL();
		employeeList1.insert(e1);//e1
		employeeList1.append(e2);//e1 e2
		employeeList1.insertAtPos(e3,3);//e1 e3 e3
		employeeList1.append(e4);//e1 e2 e3 e4
		employeeList1.insert(e5);//e5 e1 e2 e3 e4
		employeeList1.append("Frankl", 30, 15900);

		EmployeeDLL employeeList2 = new EmployeeDLL();
		employeeList2.insert(e1);//e1
		employeeList2.append(e6);//e1 e6
		employeeList2.insertAtPos(e8,3);//e1  e6  e8
		employeeList2.append(e9);//e1  e6  e8 e9
		employeeList2.insert(e7);//e7 e1  e6  e8 e9
		employeeList2.append("Dortmand", 30, 15900);
		
		System.out.println(employeeList1);//print
		System.out.println(employeeList2);//print

	      employeeList1.append(employeeList2);//print
		//employeeList1.deleteOlderThan31Age();
		//System.out.println(employeeList1);//print
		//EmployeeDLL.printCommonEmployees(employeeList1, employeeList2);//print

//		EmployeeDLL employeeList3 = EmployeeDLL.concat(employeeList1, employeeList2);
//		System.out.println(employeeList3);//print

	}

}
