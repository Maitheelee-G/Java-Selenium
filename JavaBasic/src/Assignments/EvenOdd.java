package Assignments;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd obj1= new EvenOdd();
		boolean res;
		res= obj1.checkEvenOdd(14);
		if(res==true)
		{
			System.out.println("The given number is Even");
			
		}	
		else
			System.out.println("The given number is odd");

		
	}
	
	 boolean checkEvenOdd(int a)
	{
		if(a%2==0)
		{
			return true;
		}
		else
			return false;
	}

}
