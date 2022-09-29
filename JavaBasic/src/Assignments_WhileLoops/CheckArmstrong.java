package Assignments_WhileLoops;

public class CheckArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int armstrong, actualNumber= 371;
		armstrong= checkArmstrong(actualNumber);
		if(armstrong==actualNumber)
			System.out.println("The given number is Armstrong");
		else
			System.out.println("It is not Armstrong");
	}
	
//	static int checkArmstrong(int num)
//	{
//		int res=0, rem=0;
//		//int x=num;
//		while(num>=0)
//		{
//			rem= num%10;
//			res = res+ rem*rem*rem;
//			num= num/10;
//			//if(x>0)
//				//j++;
//			//else 
//				//return j;
//		}
//		return res;
//	}
//
	
	static int checkArmstrong(int num)
	{
		int res=0, rem=0;
		//for(int x=num; x!=0;)
		int x=num;
		while(x!=0)
		{
			rem= x%10;
			res = res+(rem*rem*rem);
			x = x/10;
		}
		return res;
	}
}
