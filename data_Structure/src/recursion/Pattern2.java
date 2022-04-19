package recursion;
/*
	1
	1 2 1
	1 2 1 2 1
	1 2 1
	1
 */

public class Pattern2 {

	public static void main(String[] args) {
		int i=0;
		pattern(i);
	}
	
	static void pattern(int x)
	{
		for(int i=1;i<x;i++)
		{
			
			for(int j=1;j<i;j++)
			{
				System.out.print(j+"\t");
				
			}	
			for(int k=i;k>=1;k--)
			{
				System.out.print(k+"\t");
			}
			System.out.println();
			
		
		}
		if(x<5)
		{
			x++;
			pattern(x);
		}
		
	}

}
