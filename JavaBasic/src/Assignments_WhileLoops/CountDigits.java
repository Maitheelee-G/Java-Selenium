package Assignments_WhileLoops;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res=0;
		res = countDigits(45);
		System.out.println(res);
	}
	
	static int countDigits(int num)
	{
		int j=0;
		if(num>0)
			j=1;
		//for(int x=num; x>=0;)
		int x=num;
		while(x>=0)
		{
			x= x/10;
			if(x>0)
				j++;
			else 
				return j;
		}
		return j;
	}
	

}
