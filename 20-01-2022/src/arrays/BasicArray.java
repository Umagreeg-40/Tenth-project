package arrays;

public class BasicArray 
{

	public static void main(String[] args) 
	{
		int employeeAges[] = {56,34,26,42,44};
		
		System.out.println("Elements in an array: "+employeeAges.length);
		
		System.out.println("===========");
		
		for(int i=0;i<employeeAges.length;i++)
		{
			System.out.println(employeeAges[i]);
		}
		
		System.out.println("===========");
		
		System.out.println(employeeAges[3]);
	}
		
		
}
	


