package Assignments_ForLoops;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		r = reverse(123456);
		System.out.println("The reverse of a given number is: " +r);
	}
	
	static int reverse(int num)
	{
		int rem=0,x=0;
		for(;num!=0;)
		{
			rem= num%10;
			x=x*10+rem;
			num=num/10;
		}
		return x;
	}

}
