package Assignments;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quotient = Quotient(10,2);
		System.out.println("Quotient is: " +quotient );
		int remainder = Remainder(10,2);
		System.out.println("Remainder is: " +remainder);
		
	}
	
	static int Quotient(int a, int b)
	{
		int d = a/b;
		return d;
	}
	
	static int Remainder(int a, int b)
	{
		int d = a%b;
		return d;
	}

}
