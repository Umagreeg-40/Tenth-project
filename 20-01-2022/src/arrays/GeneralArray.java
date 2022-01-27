package arrays;

public class GeneralArray 
{

	public static void main(String[] args) 
	{
		int myArr[] = {5,84,2,10};
		int sum=0;
		
		for(int x=0; x<myArr.length; x++)
		{
			sum=sum+myArr[x];
		}
		
		System.out.println(sum);
	}
}
