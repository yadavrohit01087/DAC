package q3Medical;
/*
 Patient(String patient_name,String address,MyDate DOB,String MedicalHistory) .Write all constructors
getter/setter,toString() for this class * 
 */
public class Patient {
   String patientName;
   String address;
   MyDate dob;
   String medicalHistory;
   

   public Patient()
   {
	   this.patientName=null;
	   this.address=null;
	   this.dob=null;
	   this.medicalHistory=null;
   }
	
   public Patient(String n,String addr,MyDate dmy,String med)
   {
	   this.patientName=n;
	   this.address=addr;
	   this.dob=dmy;
	   this.medicalHistory=med;
   }
   
   public String getPatientName()
   {
	   return this.patientName;
   }
   
   public String getAddress()
   {
	   return this.address;
   }
   
   public MyDate getDob()
   {
	   return this.dob;
   }
   
   public String getMedicalHistory()
   {
	   return this.medicalHistory;
   }
   
   public void setPatientName(String n)
   {
	   this.patientName=n;
   }
   
   public void setAddress(String a)
   {
	   this.address=a;
   }
   
   public void setDob(MyDate d)
   {
	   this.dob=d;
   }
   
   public void setMedicalHistory(String m)
   {
	   this.medicalHistory=m;
   }
   
   public String toString()
   {
	   String str="";
	   str="patient [ "+this.patientName+","+this.address+","+this.dob+","+this.medicalHistory+" ]";
	   return str;
   }
   
}
