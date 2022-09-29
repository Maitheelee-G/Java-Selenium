package Assignments_WhileLoops;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int reverse, actualNumber= 121;
		reverse= checkPalindrome(actualNumber);
		if(reverse==actualNumber)
			System.out.println("The given number is Palindrome");
		else
			System.out.println("It is not Palindrome");
		//System.out.println(reverse);
	}
	
	static int checkPalindrome(int num)
	{
		int rem=0,x=0;
		//for(;num!=0;)
		while(num!=0)
		{
			rem=num%10;
			x=x*10+rem;
			num=num/10;
		}
		return x;
	}

}
