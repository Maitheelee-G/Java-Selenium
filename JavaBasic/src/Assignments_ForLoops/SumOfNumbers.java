package Assignments_ForLoops;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int addition;
		addition = sum(5);
		System.out.println("Sum of given natural numbers= " +addition);
	}
	
	static int sum(int n)
	{
		int res=0;
		for (int i=1; i<=n;i++)
		{
			res=res+i;
		}
		return res;
	}

}
