package hashingString;

public class Main {

	public static void main(String[] args) {
		Hashing hash=new Hashing(10);
		
//		hash.insertL("Rohit");
//		hash.insertQ("Rohit");
//		hash.insertQ("Rohit");
		hash.insertS("Rohit");
		hash.insertS("shraddha");
		hash.insertS("bhakti");
//		hash.insertL("Rohit");
//		hash.insertL("Rohit");
//		hash.insertL("Rohit");
		System.out.println(hash);
		
		hash.removeS("Rohit");
//		hash.removeS("radha");
		hash.removeS("Rohit");
		System.out.println(hash);
	}

}
