package hashingString;

public class Hashing {
	String strArr[];
	
	 public Hashing(int size)
	 {
		 this.strArr=new String [size];
	 }

	 public int hashFunction(String inputStr)
	 {
		 int sum=0;
		 for(int i=0;i<inputStr.length();i++)
		 {
			 sum=sum+inputStr.charAt(i);
		 }
		 int index=sum%strArr.length;
		 return index;
	 }
	 
	 public void insertL(String inputStr)//linear
	 {
		 int index=hashFunction(inputStr);
		 System.out.print(inputStr + " key from hash function = "+ index);
		 
		 if(strArr[index]==null)
		 strArr[index]=inputStr;
		 else             
		 {            //collision...
			 while(true)
			 {
				 if(index<strArr.length-1)
					 index++;
				 else 
					 index=0;
				 
				 //circular index
				 //index=(++index%strArr.length);
				 
				 if(strArr[index]==null)
				 {
					 strArr[index]=inputStr;
				     break;
				 }
			 }
		 }
		 System.out.println(" and is placed at "+ index);
	 }
	 public void insertS(String inputStr)//series
	 {
		 int index=hashFunction(inputStr);
		 System.out.print(inputStr + "key from hash function ="+ index);
		 
		 if(strArr[index]==null)
		 strArr[index]=inputStr;
		 else             
		 {            //collision...
			 int i=0;
			 while(true)
			 {
				 index=index + i++;
				 if(index>strArr.length-1)
					 index=0;
				 
				 //circular index
				 //index=(++index%strArr.length);
				 
				 if(strArr[index]==null)
				 {
					 strArr[index]=inputStr;
				     break;
				 }
			 }
		 }
		 System.out.println(" and is placed at "+ index);
	 }
	 public void insertQ(String inputStr)//Quadratic
	 {
		 int index=hashFunction(inputStr);
		 System.out.print(inputStr + "key from hash function ="+ index);
		 
		 if(strArr[index]==null)
		 strArr[index]=inputStr;
		 else             
		 {            //collision...
			 int i=1;
			 while(true)
			 {
				 index=index + (i*i);
				 if(index>strArr.length-1)
				 {
					 index=0;
					 i=0;
				 }
				 
				 if(strArr[index]==null)
				 {
					 strArr[index]=inputStr;
				     break;
				 }
				 i++;
			 }
			 
		 }
		 System.out.println(" and is placed at "+ index);
	 }
	 
	 public void removeL(String inputStr)
     {
    	 int index=searchL(inputStr);
		 strArr[index]=null;
		 
		 System.out.println(" and is removed from "+ index);
     }
	 public void removeS(String inputStr)
     {
    	 int index=searchS(inputStr);
		 strArr[index]=null;
		
		 System.out.println(" and is removed from "+ index);
     }
	 public void removeQ(String inputStr)
     {
    	 int index=searchQ(inputStr);
		 strArr[index]=null;
		 
		 System.out.println(" and is removed from "+ index);
     }
	 
	 
	 public int searchL(String inputStr)
	 {
		 int index=hashFunction(inputStr);
		 System.out.print(inputStr + "key from hash function ="+ index);
		 
		 if(strArr[index]!=null && strArr[index].equals(inputStr))
			 //null pointer exception for already removed same string/key and 
			                                 //index and removing string which does not exist
		 { 
			 return index;
		 }
			 
		 else 
		 {            //collision...
			 while(true)
			 {
				 if(index<strArr.length-1)
					 index++;
				 else 
					 index=0;
				 
				 //circular index
				 //index=(++index%strArr.length);
				 
				 if(strArr[index]!=null && strArr[index].equals(inputStr))
				 {
					 return index;
				 }
			 }
		 }
			 
	 }
	 public int searchS(String inputStr)
	 {
		 int index=hashFunction(inputStr);
		 System.out.print(inputStr + "key from hash function ="+ index);
		 
		 //null pointer exception for already removed same string/key and 
         //index and removing string which does not exist
		 if(strArr[index]!=null && strArr[index].equals(inputStr))//
		 { 
			 return index;
		 }
			 
		 else 
		 {            //collision...
			 int i=1;
			 while(true)
			 {
				 index=index + i++;
				 if(index>strArr.length-1)
				 {
					 index=0;
				 }
				 if(strArr[index]!=null && strArr[index].equals(inputStr))
				 {
					 return index;
				 }
				
			 }
		 }
			 
	 }
	 public int searchQ(String inputStr)
	 {
		 int index=hashFunction(inputStr);
		 System.out.print(inputStr + "key from hash function ="+ index);
		 
		 if(strArr[index]!=null && strArr[index].equals(inputStr))
			 //null pointer exception for already removed same string/key and 
			                                 //index and removing string which does not exist
		 { 
			 return index;
		 }
			 
		 else 
		 {            //collision...
			 int i=1;
			 while(true)
			 {
				 index=index + (i*i);
				 if(index>strArr.length-1)
				 {
					 index=0;
					 i=0;
				 }
				
				 if(strArr[index]!=null && strArr[index].equals(inputStr))
				 {
					 return index;
				 }
				 i++;
			 }
		 }
			 
	 }
	 
	 public String toString()
	 {
		 String str="";
		 str+="{ ";
		 for(int i=0;i<strArr.length;i++)
		 {
			str+=strArr[i]+",";
		 }
		 str+=" }";
		 return str;
	 }
}

    