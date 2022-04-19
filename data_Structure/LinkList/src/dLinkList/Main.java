package dLinkList;

public class Main {

	public static void main(String[] args) {
		DLinkList list=new DLinkList();
		
		list.insert(12);
		list.append(24);
		list.insert(48);
		list.append(120);
		//System.out.println(list);
		list.insertByPosition(240,3);
		System.out.println(list);
		list.reversePrint();
		list.delete();
		list.deleteLast();
		//System.out.println(list); 
		list.deleteByPosition(2);
		System.out.println(list);
      
   }
}