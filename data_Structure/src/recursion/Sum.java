package recursion;

public class Sum {

	public static void main(String[] args) {
		int i=0;
		int p=sum(i);
		System.out.println(p);
		print(i);
	}
	
	static int sum(int x)
	{
		
		if(x==200)
			return 0;
		else
			return (x + sum(x+1));
		    
		
	}
	
	static int print(int x)
	{
		if(x==200)
		   return 0 ;
		else
		{
			System.out.print(x+",");
			return print(x+1);
		}
		
	}

}
