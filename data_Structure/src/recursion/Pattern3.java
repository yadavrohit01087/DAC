package recursion;

public class Pattern3 {

	public static void main(String[] args) {
		int n=1;
		fun(n);

	}
static void fun(int x)
	{
		if(x<5)
		{
			x++; 
			fun(x);
			for(int i=0;i<x;i++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}
