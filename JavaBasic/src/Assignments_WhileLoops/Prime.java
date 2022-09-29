package Assignments_WhileLoops;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res;
		res = checkForPrime(4);
		if(res== true)
			System.out.println("The given number is Prime");
		else
			System.out.println("The given number is not Prime");
	}
	
	static boolean checkForPrime(int num)
	{
		int rem=0, i=2;
		//for(i=2;i<=num;i++)
		while(i<=num)
		{
			rem=num%i;
			if(rem==0 )
				break;
			i++;
		}
		if(i==num)
			return true;
		else
			return false;
	}

}
