package Assignments_ForLoops;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res;
		res = checkForPrime(2);
		if(res== true)
			System.out.println("The given number is Prime");
		else
			System.out.println("The given number is not Prime");
	}
	
	static boolean checkForPrime(int num)
	{
		int rem=0, i;
		for(i=2;i<=num;i++)
		{
			rem=num%i;
			if(rem==0 )
				break;
			
		}
		if(i==num)
			return true;
		else
			return false;
	}

}
