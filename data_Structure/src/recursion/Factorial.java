package recursion;

public class Factorial {

	public static void main(String[] args) {
	    int i=7;
	   int res= fact(i);
	   System.out.println(res);
	}

	static int fact(int n)
	{
		if(n==1)
		return 1;
		
		else
			return (n*fact(n-1));
			
	}
}
