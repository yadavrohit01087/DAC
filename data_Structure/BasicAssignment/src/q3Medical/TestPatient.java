package q3Medical;
//Write another class Called TestPatient which will have main() method which will create 2 objects
//of patient class and call all the functionalities.


public class TestPatient {

	public static void main(String[] args) {
		Patient p1=new Patient("asthana","juhu",new MyDate(12,12,1992),"BP");
		Patient p2=new Patient("Parmar","Borivali",new MyDate(1,1,2001),"jaundice");
		System.out.println(p1);
		System.out.println(p2);
		
		p1.setAddress(p2.getAddress());
		p1.setMedicalHistory("allergy");
		p2.setPatientName("rostagi");
		p2.setDob(new MyDate(5,5,1995));
		System.out.println(p1);
		System.out.println(p2);
	}

}
