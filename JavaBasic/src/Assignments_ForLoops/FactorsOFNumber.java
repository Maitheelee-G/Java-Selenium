package Assignments_ForLoops;

public class FactorsOFNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 16, m=-16;
		System.out.println("Factors of the given Positive number are: ");
		factorsOfPositive(n);
		System.out.println("Factors of the given Negative number are: ");
		factorsOfNegative(m);
	}

	static void factorsOfPositive(int num)
	{
		int rem=0, i;
		for(i=1;i<=num;i++)
		{
			rem=num%i;
			if(rem==0 )
				System.out.print(i+" ");
			
			
		}
		
	}
	
	static void factorsOfNegative(int num)
	{
		int rem=0, i;
		for(i=num;i<=Math.abs(num);i++)
		{
			if(i==0)
				continue;
			else
			{
			rem=num%i;
			if(rem==0 )
				//System.out.print("-"+i+" "+i+" ");
			System.out.print(i+" ");
			}
		}
		
	}

}
