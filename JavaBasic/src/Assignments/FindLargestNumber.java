package Assignments;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		res = largestNumber(2,5,1);
		if(res== 1)
			System.out.println("All the numbers are equal");
		else
			System.out.println(res+ " is the largest number");

	}
	
	static int largestNumber(int a, int b, int c)
	{
		if(a>b && a>c)
			return a;
		else 
		{
			if(b>a && b>c)
				return b;
			else
			{
				if(c>a && c>b)
					return c;
				else
					return 1;
				
			}
				
		}
		
	}

}
