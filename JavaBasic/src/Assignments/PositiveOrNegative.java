package Assignments;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char res;
		res = checkPositiveNegative(16);
		if(res=='p')
			System.out.println("Is is a Positive Number");
		else
			System.out.println("Is is a negative Number");
	}
	
	static char checkPositiveNegative(int num)
	{
		if(num>0)
			return 'p';
		else 
			return 'n';
	}

}
