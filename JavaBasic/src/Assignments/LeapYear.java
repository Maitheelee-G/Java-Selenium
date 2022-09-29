package Assignments;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res;
		res= checkYear(1000);
		if(res==true)
			System.out.println("It is a Leap Year");
		else
			System.out.println("It is not a Leap Year");
	}
	
	static boolean checkYear(double y)
	{
//		if(y%4==0)
//		{
//			if(y%100==0)
//			{
//				if(y%400==0)
//				{
//					return true;
//
//				}
//				else 
//					return false;
//				
//			}
//			return true;
//		}
//		else
//			return false;
		
		if(y%4==0 || (y%100==0 && y%400==0))
			return true;
			else
				return false;
	}
	
	//Both the above ways are correct

}
