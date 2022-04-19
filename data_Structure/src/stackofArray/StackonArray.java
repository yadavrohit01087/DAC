package stackofArray;

public class StackonArray {
	 static int arr[]=new int[5],topIndex=-1;

	public static void main(String[] args) {
		print();
		push(10);
		push(20);
		push(30);
		int value=pop();
		pop();
		push(50);
		push(60);
		push(70);
		push(80);
		push(90);
		print();
		
	}
	
	static void print()
	{
		if(topIndex==-1)
			System.out.println("stack is empty");
		else 
		{
		  for(int i=arr.length-1;i>=0;i--)
		  {
		   System.out.print(arr[i]+" ");	
		  }
		}
	}
 
	static void push(int value)
	{
		if(topIndex<arr.length-1)
		{
			topIndex++;
			arr[topIndex]=value;
		}
		else
			System.out.println("stack overflow");
		
	}
	
	static int pop()
	{
		int value=0;
		if(topIndex!=-1)
		{
			value=arr[topIndex];
			topIndex--;
			
		}
		else
		{
			System.out.println("stack underflow");
		}
		return value;
	}
}
